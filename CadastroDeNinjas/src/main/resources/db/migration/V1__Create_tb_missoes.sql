CREATE TABLE tb_missoes
(
    id          BIGINT AUTO_INCREMENT NOT NULL,
    nome        VARCHAR(255) NULL,
    missao_nome VARCHAR(255) NULL,
    nivel       SMALLINT NULL,
    status      BOOLEAN NOT NULL,
    CONSTRAINT pk_tb_missoes PRIMARY KEY (id)
);
