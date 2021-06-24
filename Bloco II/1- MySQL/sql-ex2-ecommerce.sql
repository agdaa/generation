-- Crie um banco de dados para um e commerce, onde o sistema trabalhará com as
-- informações dos produtos deste ecommerce.
CREATE DATABASE db_ecommerce;
USE db_ecommerce;

-- Crie uma tabela produtos e utilizando a habilidade de abstração e determine 5 atributos
-- relevantes dos produtos para se trabalhar com o serviço deste ecommerce.
CREATE TABLE tb_produtos (
    id INT AUTO_INCREMENT,
    nome VARCHAR(30) NOT NULL,
    descricao VARCHAR(100),
    marca VARCHAR(15) NOT NULL,
    preco FLOAT NOT NULL,
    categoria VARCHAR(15),
    PRIMARY KEY (id)
);

-- Popule esta tabela com até 8 dados;
INSERT INTO tb_produtos (nome, descricao, marca, preco, categoria)
VALUES
('Cartão de memória', 'Descrição do Produto1', 'Brand1', 99.0 , 'Categoria A'),
('Produto2', 'Descrição do Produto2', 'Brand2', 510.0 , 'Categoria B'),
('Produto3', 'Descrição do Produto3', 'Brand3', 1270.0 , 'Categoria C'),
('Produto4', 'Descrição do Produto4', 'Brand1', 160.0 , 'Categoria B'),
('Produto5', 'Descrição do Produto5', 'Brand1', 210.0 , 'Categoria C'),
('Produto6', 'Descrição do Produto6', 'Brand2', 710.0 , 'Categoria A'),
('Produto7', 'Descrição do Produto7', 'Brand1', 100.0 , 'Categoria A'),
('Produto8', 'Descrição do Produto8', 'Brand3', 1000.0 , 'Categoria C');

-- Faça um select que retorne os produtos com o valor maior do que 500.
SELECT * FROM tb_produtos WHERE preco > 500.0;

-- Faça um select que retorne os produtos com o valor menor do que 500.
SELECT * FROM tb_produtos WHERE preco < 500.0;

-- Ao término atualize um dado desta tabela através de uma query de atualização.
UPDATE tb_produtos SET preco = 550.0 WHERE id = 5;