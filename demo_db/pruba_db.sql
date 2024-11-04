CREATE DATABASE prueba_db;
USE prueba_db;

CREATE TABLE usuarios (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(100) NOT NULL,
    correo VARCHAR(100) NOT NULL,
    dni VARCHAR(100) NOT NULL
);

INSERT INTO usuarios (nombre, correo, dni) VALUES ('Juan Pérez', 'juan.perez@example.com', '12345678A');
INSERT INTO usuarios (nombre, correo, dni) VALUES ('María López', 'maria.lopez@example.com', '87654321B');
