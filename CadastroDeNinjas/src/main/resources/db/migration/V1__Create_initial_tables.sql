-- Initial migration to create tables
CREATE TABLE tb_missoes (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(255),
    missao_nome VARCHAR(255),
    nivel VARCHAR(255),
    rank VARCHAR(255),
    status BOOLEAN
);

CREATE TABLE tb_model (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(255),
    email VARCHAR(255) UNIQUE,
    img_url VARCHAR(255),
    idade INT,
    missoes_id BIGINT,
    FOREIGN KEY (missoes_id) REFERENCES tb_missoes(id)
);
