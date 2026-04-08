
package conexion;
import java.sql.Connection;
import java.sql.DriverManager;

// Clase encargada de la conexión con la base de datos
public class ConexionBD {
    
    // Ruta de la base de datos
    private static final String URL = "jdbc:sqlite:legendary.db";
    
    // Método que establece la conexión con SQLite
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
