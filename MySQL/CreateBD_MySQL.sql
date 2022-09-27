CREATE DATABASE agencia_vousuave;
USE agencia_vousuave;
/* Lógico_1: */

CREATE TABLE Cliente (
    Id_Cliente INT PRIMARY KEY AUTO_INCREMENT,
    Nome_Cli VARCHAR(110) NOT NULL,
    Data_Nasc DATE NOT NULL,
    Cpf VARCHAR(11) NOT NULL UNIQUE,
    Data_Cadastro DATE NOT NULL
);


CREATE TABLE Passagem (
    Id_Passagem INT PRIMARY KEY AUTO_INCREMENT,
    Origem VARCHAR(110) NOT NULL,
    Destino VARCHAR(110) NOT NULL,
    Id_Tp INT NOT NULL,
    Caminho VARCHAR(80) NOT NULL,
    Descricao VARCHAR(80) NOT NULL,
    Desc_preco VARCHAR(80) NOT NULL,
    Preco_antigo VARCHAR(80) NOT NULL,
    Preco_atual VARCHAR(80) NOT NULL
);

CREATE TABLE Pacote (
    Id_Pacote INT PRIMARY KEY AUTO_INCREMENT,
    Destino VARCHAR(50) NOT NULL,
    Diaria INT NOT NULL,
    Caminho Varchar(80) NOT NULL,
    Preco INT NOT NULL,
    Id_Hotel INT NOT NULL,
    Guia_Turismo BOOLEAN NOT NULL,
    Internacional BOOLEAN NOT NULL
);

CREATE TABLE Tipos_Passagem (
    Id_Tp INT PRIMARY KEY AUTO_INCREMENT,
    Passagem_Onibus BOOLEAN,
    Passagem_Aviao BOOLEAN,
);

CREATE TABLE Compras_Cliente (
    Id_Cc INT PRIMARY KEY AUTO_INCREMENT,
    Id_Pacote INT,
    Id_Passagem INT,
    Id_Hotel INT,
    Id_Cliente INT NOT NULL
);

CREATE TABLE Hotel (
    Id_Hotel INT PRIMARY KEY AUTO_INCREMENT,
    nome_hotel VARCHAR(50) NOT NULL
);

CREATE TABLE Administrador(
	id_admin INT PRIMARY KEY AUTO_INCREMENT,
    nome_admin VARCHAR(110) NOT NULL,
    senha VARCHAR(50) NOT NULL,
    ativo BOOLEAN NOT NULL
);


ALTER TABLE Passagem ADD CONSTRAINT FK_Passagem_1
	FOREIGN KEY (Id_Tp)
    REFERENCES tipos_passagem (Id_Tp)
    ON DELETE CASCADE; 
    
ALTER TABLE Pacote ADD CONSTRAINT FK_Pacote_1
	FOREIGN KEY (Id_Hotel)
    REFERENCES Hotel (Id_Hotel)
    ON DELETE CASCADE; 
        

ALTER TABLE Compras_Cliente ADD CONSTRAINT FK_Compras_Cliente_1
    FOREIGN KEY (Id_Pacote)
    REFERENCES Pacote (Id_Pacote)
    ON DELETE CASCADE;

ALTER TABLE Compras_Cliente ADD CONSTRAINT FK_Compras_Cliente_2
    FOREIGN KEY (Id_Passagem)
    REFERENCES Passagem (Id_Passagem)
    ON DELETE CASCADE;

ALTER TABLE Compras_Cliente ADD CONSTRAINT FK_Compras_Cliente_3
    FOREIGN KEY (Id_Hotel)
    REFERENCES Hotel (Id_Hotel)
    ON DELETE CASCADE;

    
ALTER TABLE Compras_Cliente ADD CONSTRAINT FK_Compras_Cliente_4
    FOREIGN KEY (Id_Cliente)
    REFERENCES Cliente (Id_Cliente)
    ON DELETE CASCADE;
