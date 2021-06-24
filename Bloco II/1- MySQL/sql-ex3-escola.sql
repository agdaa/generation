-- Crie um banco de dados para um registro de uma escola, onde o sistema trabalhará com as
-- informações dos estudantes deste registro dessa escola.
CREATE DATABASE db_escola;
USE db_escola;

-- Crie uma tabela estudantes e utilizando a habilidade de abstração e determine 5 atributos
-- relevantes dos estudantes para se trabalhar com o serviço dessa escola.
CREATE TABLE tb_estudantes (
    id INT AUTO_INCREMENT,
    nome VARCHAR(35) NOT NULL,
    sobrenome VARCHAR(20) NOT NULL,
    turma INT NOT NULL,
    dt_nascimento DATE NOT NULL,
    nota FLOAT NOT NULL,
    PRIMARY KEY (id)
); 

-- Popule esta tabela com até 8 dados;
INSERT INTO tb_estudantes (nome,sobrenome,turma,dt_nascimento, nota)
VALUES
('Sarah', 'Andrade', 18, '1998-10-20', 6.3 ),
('Júlio', 'Silva', 19, '1997-10-10', 8.0 ),
('Maria', 'Novaes', 20, '1995-10-20', 7.2 ),
('Mário', 'Souza', 18, '1994-10-10', 5.9 ),
('Júlia', 'Teixeira', 20, '1991-10-20', 10.0 ),
('Sandro', 'Brás', 20, '1999-10-10', 9.5 ),
('Márcia', 'Pereira', 19, '1997-10-20', 9.0 ),
('Márcio', 'Ruiz', 19, '1992-10-10', 6.8 );

-- Faça um select que retorne o/as estudantes com a nota maior do que 7.
SELECT * FROM tb_estudantes WHERE nota > 7;

-- Faça um select que retorne o/as estudantes com a nota menor do que 7.
SELECT * FROM tb_estudantes WHERE nota > 7;

-- Ao término atualize um dado desta tabela através de uma query de atualização.
UPDATE tb_estudantes SET turma = 18 WHERE id = 2;
