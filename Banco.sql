CREATE DATABASE BibliotecaVirtual;

USE Biblioteca;

CREATE TABLE Usuarios (
    id_usuario INT AUTO_INCREMENT,
    nome_usuario VARCHAR(255) NOT NULL,
    senha_usuario VARCHAR(255) NOT NULL,
    sexo_usuario VARCHAR(255),
    email_usuario VARCHAR(255),
    genero_pref VARCHAR (255),
    nivel_acesso ENUM('comum', 'admin') DEFAULT 'comum',
    apelido_usuario VARCHAR(255),
    PRIMARY KEY (id_usuario)
);

CREATE TABLE Autores (
    id_autor INT AUTO_INCREMENT,
    nome_autor VARCHAR(255) NOT NULL,
    PRIMARY KEY (id_autor)
);

CREATE TABLE Livros (
    id_livro INT AUTO_INCREMENT,
    titulo_livro VARCHAR(255) NOT NULL,
    id_autor INT,
    genero VARCHAR(255),
    data_publicacao DATE,
    editora VARCHAR(255),
    nota_livro float,
    FOREIGN KEY (id_autor) REFERENCES Autores(id_autor),
    PRIMARY KEY (id_livro)
);


INSERT INTO Usuarios (nome_usuario, senha_usuario, sexo_usuario, email_usuario, genero_pref, nivel_acesso)
VALUES ('Admin', 'SenhaAdmin123', 123456789, 'admin@email.com', 'Drama e Terror', 'admin');