-- Crie um banco de dados para um serviço de pizzaria de uma empresa, o nome do banco
-- deverá ter o seguinte nome db_pizzaria_legal, onde o sistema trabalhará com as
-- informações dos produtos desta empresa.
-- O sistema trabalhará com 2 tabelas tb_pizza e tb_categoria.
CREATE DATABASE IF NOT EXISTS db_pizzaria;
USE db_pizzaria;

-- Crie uma tabela de categorias utilizando a habilidade de abstração e determine 3 atributos
-- relevantes do tb_categoria para se trabalhar com o serviço dessa pizzaria.
CREATE TABLE tb_categoria (
  categoria_id INT AUTO_INCREMENT,
  nome_categoria VARCHAR(45) NOT NULL,
  descricao_categoria VARCHAR(200) NULL,
  preco_padrao VARCHAR(45) NOT NULL,
  PRIMARY KEY (categoria_id)
  );

-- Crie uma tabela de tb_pizza e utilizando a habilidade de abstração e determine 5 atributos
-- relevantes dos tb_produto para se trabalhar com o serviço dessa pizzaria(não esqueça de
-- criar a foreign key de tb_categoria nesta tabela).
CREATE TABLE tb_pizza (
  pizza_id INT AUTO_INCREMENT,
  sabor VARCHAR(45) NOT NULL,
  descricao_pizza VARCHAR(100),
  preco_pizza DOUBLE NOT NULL,
  ingrediente_adicional VARCHAR(45),
  borda_recheada BOOLEAN NOT NULL,
  PRIMARY KEY (pizza_id),
FOREIGN KEY (categoria_id)
    REFERENCES tb_categoria (categoria_id)
);

-- Popule esta tabela Categoria com até 5 dados.
INSERT INTO tb_categoria (nome_categoria, descricao_categoria, preco_padrao) 
VALUES 
('Brotinho', 'Pizza salgada pequena com 4 pedaços', 20.00),
('Grande', 'Pizza salgada tamanho normal com 8 pedaços', 40.00),
('Extra Grande', 'Pizza salgada maior com 16 pedaços', 60.00),
('Doce Brotinho', 'Pizza doce pequena com 4 pedaços', 25.00),
('Doce Grande', 'Pizza doce tamanho normal com 8 pedaços', 50.00);

-- Popule esta tabela pizza com até 8 dados.
INSERT INTO tb_pizza (categoria_id, sabor, descricao_pizza, preco_pizza, ingrediente_adicional,  borda_recheada) 
VALUES 
(1, 'Mussarela', 'Queijo mussarela, azeitonas e orégano', 20.00, '', FALSE ),
(1, 'Calabresa', 'Queijo mussarela, azeitonas e orégano', 20.00, '', FALSE ),
(1, 'Mussarela', 'Queijo mussarela, azeitonas e orégano', 20.00, '', FALSE ),
(1, 'Mussarela', 'Queijo mussarela, azeitonas e orégano', 20.00, '', FALSE ),
(1, 'Mussarela', 'Queijo mussarela, azeitonas e orégano', 20.00, '', FALSE ),
(1, 'Mussarela', 'Queijo mussarela, azeitonas e orégano', 20.00, '', FALSE ),
(1, 'Mussarela', 'Queijo mussarela, azeitonas e orégano', 20.00, '', FALSE ),
(1, 'Mussarela', 'Queijo mussarela, azeitonas e orégano', 20.00, '', FALSE );

-- Faça um select que retorne os Produtos com o valor maior do que 45 reais.

-- Faça um select trazendo os Produtos com valor entre 29 e 60 reais.

-- Faça um select utilizando LIKE buscando os Produtos com a letra C.

-- Faça um um select com Inner join entre tabela categoria e pizza.

-- Faça um select onde traga todos os Produtos de uma categoria específica (exemplo todos
-- os produtos que são pizza doce).