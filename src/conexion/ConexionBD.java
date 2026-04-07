
package conexion;
import java.sql.Connection;
import java.sql.DriverManager;
public class ConexionBD {
    private static final String URL = "jdbc:sqlite:legendary.db";
    public static Connection conectar() {
        try {
            Connection conn = DriverManager.getConnection(URL);
            System.out.println("Conectado a la base de datos");
            return conn;
        } catch (Exception e) {
            System.out.println("Error de conexión: " + e.getMessage());
            return null;
        }
    }
}
