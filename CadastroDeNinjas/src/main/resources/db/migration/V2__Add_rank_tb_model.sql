-- migration para add a coluna de ranking na tabela de cadastros

ALTER TABLE tb_missoes
ADD COLUMN rank VARCHAR(255);