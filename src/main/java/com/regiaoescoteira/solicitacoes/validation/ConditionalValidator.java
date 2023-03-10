package com.regiaoescoteira.solicitacoes.validation;

import org.apache.commons.beanutils.BeanUtils;
import org.springframework.util.ObjectUtils;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import javax.validation.ConstraintValidatorContext;
import javax.validation.ConstraintValidator;

public class ConditionalValidator implements ConstraintValidator<ConditionalValidation, Object>{
    private String conditionalProperty;
    private String[] requiredProperties;
    private String message;
    private String[] conditions;

    @Override
    public void initialize(ConditionalValidation constraint) {
        conditionalProperty = constraint.conditionalProperty();
        requiredProperties = constraint.requiredProperties();
        message = constraint.message();
        conditions = constraint.values();
    }

    @Override
    public boolean isValid(Object object, ConstraintValidatorContext context) {
        try {
            Object conditionalPropertyValue = BeanUtils.getProperty(object, conditionalProperty);
            if (doConditionalValidation(conditionalPropertyValue)) {
                return validateRequiredProperties(object, context);
            }
        } catch (NoSuchMethodException | InvocationTargetException | IllegalAccessException ex) {
            return false;
        }
        return true;
    }

    private boolean validateRequiredProperties(Object object, ConstraintValidatorContext context) throws IllegalAccessException, InvocationTargetException, NoSuchMethodException {
        boolean isValid = true;
        for (String property : requiredProperties) {
            Object requiredValue = BeanUtils.getProperty(object, property);
            boolean isPresent = requiredValue != null && !ObjectUtils.isEmpty(requiredValue);
            if (!isPresent) {
                isValid = false;
                context.disableDefaultConstraintViolation();
                context
                        .buildConstraintViolationWithTemplate(message)
                        .addPropertyNode(property)
                        .addConstraintViolation();
            }
        }
        return isValid;
    }

    private boolean doConditionalValidation(Object actualValue) {
        return Arrays.asList(conditions).contains(actualValue);
    }
}
