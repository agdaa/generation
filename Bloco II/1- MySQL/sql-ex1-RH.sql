-- Crie um banco de dados para um serviço de RH de uma empresa, onde o sistema
-- trabalhará com as informações dos funcionaries desta empresa.
CREATE DATABASE db_rh;
USE db_rh;

-- Crie uma tabela de funcionaries e utilizando a habilidade de abstração e determine 5
-- atributos relevantes dos funcionaries para se trabalhar com o serviço deste RH.
CREATE TABLE tb_funcionaries (
    id INT AUTO_INCREMENT,
    nome VARCHAR(35) NOT NULL,
    cargo VARCHAR(20) NOT NULL,
    salario DOUBLE NOT NULL,
    admissao DATE NOT NULL,
    PRIMARY KEY (id)
); 

-- Popule esta tabela com até 5 dados;
INSERT INTO tb_funcionaries (nome, cargo, salario, admissao) 
VALUES 
('João','atendente',1600.0,'2020-02-02'),
('Maria','gerente',3500.0,'2012-02-02'),
('José','supervisor',3000.0,'2018-02-02'),
('Carol','atendente',1600.0,'2020-02-02'),
('Julia','atendente',1600.0,'2021-02-02');

-- Faça um select que retorne os funcionaries com o salário maior do que 2000.
SELECT * FROM tb_funcionaries WHERE salario > 2000.0;
-- Faça um select que retorne os funcionaries com o salário menor do que 2000.
SELECT * FROM tb_funcionaries WHERE salario < 2000.0;

-- Ao término atualize um dado desta tabela através de uma query de atualização.
UPDATE tb_funcionaries SET salario = 1700.0 WHERE id = 1;