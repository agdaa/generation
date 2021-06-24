-- Crie um banco de dados para um serviço de um game Online , o nome do banco deverá ter
-- o seguinte nome db_generation_game_online, onde, o sistema trabalhará com as informações dos personagens desse game.
-- O sistema trabalhará com 2 tabelas tb_personagem e tb_classe.

CREATE DATABASE IF NOT EXISTS db_generation_game_online;
USE db_generation_game_online ;

-- Crie uma tabela tb_classe utilizando a habilidade de abstração e determine 3 atributos
-- relevantes da classe para se trabalhar com o serviço desse game Online.
CREATE TABLE tb_classe (
  id INT AUTO_INCREMENT,
  nome VARCHAR(45) NOT NULL,
  descricao VARCHAR(200) NULL,
  ponto_forte VARCHAR(45) NOT NULL,
  PRIMARY KEY (id)
  );

-- Crie uma tabela tb_personagem e utilizando a habilidade de abstração e determine 5
-- atributos relevantes dos funcionários para se trabalhar com o serviço desse game Online
-- (não esqueça de criar a foreign key de tb_classe nesta tabela).
CREATE TABLE tb_personagem (
  id INT AUTO_INCREMENT,
  nome VARCHAR(45) NOT NULL,
  poder_ataque INT NOT NULL,
  poder_defesa INT NOT NULL,
  inteligencia INT NOT NULL,
  habilidade INT NOT NULL,
  classe INT NOT NULL,
  PRIMARY KEY (id),
FOREIGN KEY (classe)
    REFERENCES tb_classe (id)
);

-- Popule esta tabela classe com até 5 dados. 
INSERT INTO tb_classe (nome, descricao, ponto_forte) 
VALUES 
('Arqueiro', 'Especialista no arco e flecha', 'Mira à distância'),
('Mago', 'Manipulador de poderes mágicos', 'Poções'),
('Espadachim', 'Especialista treinado na luta com espadas', 'Habilidade de luta'),
('Estrategista', 'Especialista em projetar estratégias', 'Inteligência'),
('Guerreiro', 'Lutador treinado em várias modalidades', 'Resistência');

-- Popule esta tabela personagem com até 8 dados.
INSERT INTO tb_personagem (nome, poder_ataque, poder_defesa, inteligencia, habilidade, classe) 
VALUES 
('Charles', 2020, 180, 1600, 2800, 1),
('Super', 2800, 2200, 1600, 3000, 5),
('Master', 800, 1000, 3000, 600, 4),
('Blaster', 700, 250, 700, 1000, 2),
('Jammim', 3000, 1100, 300, 2900, 3),
('Stevie', 1200, 900, 2030, 2520, 1),
('Wonder', 300, 500, 3000, 2520, 2),
('Claude', 1300, 2000, 500, 3000, 3);


-- Faça um select que retorne os personagens com o poder de ataque maior do que 2000.
SELECT * FROM tb_personagem WHERE poder_ataque > 2000;

-- Faça um select trazendo os personagens com poder de defesa entre 1000 e 2000.
SELECT * FROM tb_personagem WHERE poder_ataque < 2000 AND poder_ataque > 1000;

-- Faça um select utilizando LIKE buscando os personagens com a letra C.
SELECT * FROM tb_personagem WHERE nome LIKE 'C%';

-- Faça um um select com Inner join entre tabela classe e personagem.
SELECT * FROM tb_personagem INNER JOIN tb_classe ON tb_classe.id = tb_personagem.classe ;

-- Faça um select onde traga todos os personagem de uma classe específica (exemplo todos os personagens que são arqueiros).
SELECT 
    tb_personagem.nome, tb_classe.nome, poder_ataque, poder_defesa, inteligencia, habilidade
FROM
    tb_personagem
        INNER JOIN
    tb_classe ON tb_classe.id = tb_personagem.classe
WHERE
    classe = 1;