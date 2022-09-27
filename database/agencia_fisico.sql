CREATE DATABASE agencia;

USE agencia;

CREATE TABLE Parceiros (
id_parceiros INTEGER PRIMARY KEY auto_increment,
nome_parceiros VARCHAR(40)
);

CREATE TABLE Agencia (
id_agencia INTEGER PRIMARY KEY auto_increment,
nome_agencia VARCHAR(40)
cnpj VARCHAR (11)
);

CREATE TABLE Produtos (
id_produtos INTEGER PRIMARY KEY auto_increment,
nome_produtos VARCHAR(20),
preco_produtos DECIMAL(12,0),
pacote_produtos VARCHAR(22),
id_agencia INTEGER,
id_parceiros INTEGER,
FOREIGN KEY(id_agencia) REFERENCES Agencia (id_agencia),
FOREIGN KEY(id_parceiros) REFERENCES Parceiros (id_parceiros)
);

CREATE TABLE Usuarios (
id_usuario INTEGER PRIMARY KEY auto_increment,
nome_usuario VARCHAR(40),
email_usuario VARCHAR(40),
senha_usuario VARCHAR(20),
id_permissao INTEGER
cpf VARCHAR(11)
);

CREATE TABLE Permissoes (
id_permissao INTEGER PRIMARY KEY auto_increment,
tipo_permissao VARCHAR(12)
);

CREATE TABLE Itens_compra (
qtd_itens INTEGER,
valor_itens DECIMAL(11),
id_produtos INTEGER,
id_compra INTEGER,
FOREIGN KEY(id_produtos) REFERENCES Produtos (id_produtos)
);

CREATE TABLE Compras (
id_compras INTEGER PRIMARY KEY auto_increment,
data_compras DATETIME,
valor_compras DECIMAL(11),
id_usuario INTEGER,
FOREIGN KEY(id_usuario) REFERENCES Usuarios (id_usuario)
);

ALTER TABLE Usuarios ADD FOREIGN KEY(id_permissao) REFERENCES Permissoes (id_permissao);
ALTER TABLE Itens_compra ADD FOREIGN KEY(id_compra) REFERENCES Compra (id_compra);


CREATE VIEW produtos_completo as
SELECT l.id_produtos, l.nome_produtos, l.preco_produtos, l.publicacao_produtos, e.id_agencia, e.nome_agencia, a.id_parceiros, a.nome_parceiros 
FROM produtos l, agencia e, parceiros a 
where l.id_editora = e.id_editora and l.id_autor = a.id_autor order by l.id_livro asc;


select * from parceiros;
select * from agencia;