CREATE DATABASE prueba_db;
USE prueba_db;

CREATE TABLE usuarios (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(100) NOT NULL,
    correo VARCHAR(100) NOT NULL
);

INSERT INTO usuarios (nombre, correo) VALUES ('Juan Pérez', 'juan.perez@example.com');
INSERT INTO usuarios (nombre, correo) VALUES ('María López', 'maria.lopez@example.com');