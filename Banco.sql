
CREATE DATABASE BibliotecaVirtual;

USE BibliotecaVirtual;


CREATE TABLE Usuarios (
    id INT AUTO_INCREMENT,
    nome VARCHAR(255) NOT NULL,
    senha VARCHAR(255) NOT NULL,
    PRIMARY KEY (id)
);


CREATE TABLE Autores (
    id INT AUTO_INCREMENT,
    nome VARCHAR(255) NOT NULL,
    PRIMARY KEY (id)
);


CREATE TABLE Livros (
    id INT AUTO_INCREMENT,
    titulo VARCHAR(255) NOT NULL,
    autor_id INT,
    FOREIGN KEY (autor_id) REFERENCES Autores(id),
    PRIMARY KEY (id)
);



INSERT INTO Usuarios (nome, senha)
VALUES ('admin', 'admin');

INSERT INTO Usuarios (nome, senha)
VALUES ('leonardo', 'ribeiro');