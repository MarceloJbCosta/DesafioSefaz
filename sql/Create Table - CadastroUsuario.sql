create database cadastroUsuario;

CREATE TABLE usuario (
    id INT PRIMARY KEY AUTO_INCREMENT,
    nome INT NOT NULL,
    email VARCHAR(50) NOT NULL,
    senha VARCHAR(15) NOT NULL
);


CREATE TABLE telefones (
    id INT PRIMARY KEY AUTO_INCREMENT,
    ddd INT NOT NULL,
    numero VARCHAR(15) NOT NULL,
    tipo VARCHAR(15) NOT NULL
);

 