USE [remg_solicitacoes]
GO

INSERT INTO [dbo].[tipo_solicitacao]
           ([identificador]
           ,[nome]
           ,[status],
		   [descricao])
     VALUES (1, 'Distintivo Especial ', 1, 'Distintivo Especial'),
	 (2, 'Semeador', 1, 'Distintivo de Semeador'),
	 (3, 'Condecorações', 1, 'Condecoração'),
	 (4, 'Nível Formação', 1, 'Nível de formação')
GO

INSERT INTO [dbo].[condecoracao]
           ([identificador]
           ,[nome]
           ,[status],
		   [descricao])
     VALUES (1,'Diploma Mérito Regional', 1, 'teste')

GO

 
INSERT INTO [dbo].[status]
           ([identificador]
           ,[nome]
           ,[status],
		   [descricao])
     VALUES (1,'Recebida', 1, 'teste'),
(2,'Em Analise', 1, 'teste'), 
(3,'Indeferido', 1, 'teste'), 
(4,'Deferido', 1, 'teste'), 
(5,'Aprovado Aguardando Pagamento', 1, 'teste'), 
(6,'Aguardando Alteracoes Solicitadas', 1, 'teste'), 
(7,'Emitido', 1, 'teste'), 
(8,'Enviado Ao Escritorio Nacional', 1, 'teste'), 
(9,'Enviado Ao Solicitante', 1, 'teste')

GO 

INSERT INTO [dbo].[grupo_escoteiro]
           ([identificador]
           ,[nome_grupo]
           ,[numero_grupo])
     VALUES
           (1, 'Grupo Escoteiro Lagoa do Nado', '46')
GO



 