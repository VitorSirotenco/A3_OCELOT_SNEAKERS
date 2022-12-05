package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class  ConexaoSQL {

    private static String host = "localhost";
    private static String porta = "3306";
    private static String usuario = "root";
    private static String senha = "";
    private static String db = "db_ocelot";

    public Connection obtemConexao() {
                
        try {
            Connection conn = DriverManager.getConnection(
                    "jdbc:mysql://" + host + ":" + porta + "/" + db + "?useTimezone=true&serverTimezone=UTC",
                    usuario,
                    senha
            );

            return conn;
        } catch (SQLException e) {
            return null;
        }
    }
}
