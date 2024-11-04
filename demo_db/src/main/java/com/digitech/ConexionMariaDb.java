package com.digitech;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

class ConexionMariaDB {

    // Datos de conexión
    private static final String URL = "jdbc:mariadb://localhost:3310/prueba_db";
    private static final String USUARIO = "root";
    private static final String CONTRASENA = "root";

    public static void main(String[] args) {
        // Intentar establecer la conexión
        try (Connection conexion = DriverManager.getConnection(URL, USUARIO, CONTRASENA)) {
            System.out.println("Conexión exitosa a MariaDB!");

            // Crear una declaración
            Statement stmt = conexion.createStatement();

            // Ejecutar una consulta
            String sql = "SELECT id, nombre, correo, dni FROM usuarios";
            ResultSet rs = stmt.executeQuery(sql);

            // Procesar los resultados
            while (rs.next()) {
                int id = rs.getInt("id");
                String nombre = rs.getString("nombre");
                String correo = rs.getString("correo");
                String dni = rs.getString("dni");
                System.out.printf("ID: %d, Nombre: %s, Correo: %s%n , dni: %s%n", id, nombre, correo, dni);
            }

            // Cerrar recursos
            rs.close();
            stmt.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}