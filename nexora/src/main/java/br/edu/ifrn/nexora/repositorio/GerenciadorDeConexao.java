package br.edu.ifrn.nexora.repositorio;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class GerenciadorDeConexao {
    private static final String URL = "jdbc:mysql://localhost:3306/nexora_db?useTimezone=true&serverTimezone=UTC";
    private static final String USER = "root";     
    // ATENÇÃO: Substitua pelo valor da senha que você definiu ao instalar o MySQL
    private static final String PASSWORD = "123456"; 

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}