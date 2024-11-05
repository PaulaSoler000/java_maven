package com.digitech;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class delete {
    private static final String URL = "jdbc:mariadb://localhost:3310/prueba_db";
    private static final String USUARIO = "root";
    private static final String CONTRASENA = "root";
    Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {
        // Intentar establecer la conexión
        try (Connection conexion = DriverManager.getConnection(URL, USUARIO, CONTRASENA)) {
            System.out.println("Conexión exitosa a MariaDB!");

            String sql = "DELETE FROM usuarios WHERE id = ?";

            // Crear una declaración
            PreparedStatement stmt = conexion.prepareStatement(sql);
            stmt.setString(1, "5");

            int result = stmt.executeUpdate();
            System.out.println("Filas insertadas: " + result);

            // Cerrar recursos

            stmt.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
