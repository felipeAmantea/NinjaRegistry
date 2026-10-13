-- Migration para adicionar a coluna de ranking na tabela tb_ninjas
ALTER TABLE tb_ninjas
    ADD COLUMN rank VARCHAR(255);