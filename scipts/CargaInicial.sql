USE [remg_solicitacoes]
GO

INSERT INTO [dbo].[tipo_solicitacao]
           ([identificador]
           ,[nome]
           ,[status])
     VALUES (1, 'Distintivo Especial ', 1),
	 (2, 'Semeador', 1),
	 (3, 'Condecorações', 1),
	 (4, 'Nível Formação', 1)
GO


INSERT INTO [dbo].[status]
           ([identificador]
           ,[nome]
           ,[status])
     VALUES (1,'Recebida', 1),
(2,'Em Analise', 1), 
(3,'Indeferido', 1), 
(4,'Deferido', 1), 
(5,'Aprovado Aguardando Pagamento', 1), 
(6,'Aguardando Alteracoes Solicitadas', 1), 
(7,'Emitido', 1), 
(8,'Enviado Ao Escritorio Nacional', 1), 
(9,'Enviado Ao Solicitante', 1)

GO 

INSERT INTO [dbo].[grupo_escoteiro]
           ([identificador]
           ,[nome_grupo]
           ,[numero_grupo])
     VALUES
           (newid(), 'Grupo Escoteiro Lagoa do Nado', '46')
GO


INSERT INTO [dbo].[condecoracao]
           ([identificador]
           ,[nome]
           ,[status])
     VALUES (1,'Diploma Mérito Regional', 1)

GO