package modelo;

import conexion.ConexionBD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

// Clase que gestiona las operaciones CRUD de citas en la base de datos
public class CitaDAO {
    
    // Método para insertar una nueva cita en la base de datos
    public void insertar(Cita cita) {
        
         // Consulta SQL para insertar una cita
        String sql = "INSERT INTO citas(nombre, telefono, servicio, precio, fecha, hora) VALUES (?, ?, ?, ?, ?, ?)";
        try (Connection conn = ConexionBD.conectar();
             PreparedStatement ps = conn.prepareStatement(sql)) {
             // Asignación de valores a la consulta
            ps.setString(1, cita.getNombre());
            ps.setString(2, cita.getTelefono());
            ps.setString(3, cita.getServicio());
            ps.setDouble(4, cita.getPrecio());
            ps.setString(5, cita.getFecha());
            ps.setString(6, cita.getHora());
            
             // Ejecución de la inserción
            ps.executeUpdate();
            
            System.out.println("Cita guardada correctamente");
        } catch (Exception e) {
            
             // Manejo de errores
            System.out.println("Error: " + e.getMessage());
        }
    }
    
    // Método para consultar las citas
    public List<Cita> listar() {
        
        // Lista donde se almacenan las citas obtenidas de la base de datos
        List<Cita> lista = new ArrayList<>();
        
        // Consulta SQL para obtener todas las citas
        String sql = "SELECT * FROM citas";
        
        try (Connection conn = ConexionBD.conectar();
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql)) {
            
            // Recorrer los resultados de la consulta
            while (rs.next()) {
                
           // Crear objeto Cita con los datos de la BD
            Cita c = new Cita(
                rs.getInt("id"),
                rs.getString("nombre"),
                rs.getString("telefono"),
                rs.getString("servicio"),
                rs.getDouble("precio"),
                rs.getString("fecha"),
                rs.getString("hora")
            );
            
            // Agregar la cita a la lista
            lista.add(c);
            }
        } catch (Exception e) {
            
            // Manejo de errores
            System.out.println("Error: " + e.getMessage());
        }
        
        // Retornar lista de citas
        return lista;
    }
    
    // Método para eliminar una cita según su ID
    public void eliminar(int id) {
        
        // Consulta SQL para eliminar una cita
        String sql = "DELETE FROM citas WHERE id = ?";

        try (Connection conn = ConexionBD.conectar();
            PreparedStatement ps = conn.prepareStatement(sql)) {
 
            // Asignar el ID a eliminar
            ps.setInt(1, id);
            
            // Ejecutar eliminación
            ps.executeUpdate();

            System.out.println("Cita eliminada");
   
        } catch (Exception e) {
            
            // Manejo de errores
            System.out.println("Error: " + e.getMessage());
        }
    }
    
    // Método para actualizar los datos de una cita existente
    public void actualizar(Cita cita) {
        
     // Consulta SQL para actualizar una cita
        String sql = "UPDATE citas SET nombre=?, telefono=?, servicio=?, precio=?, fecha=?, hora=? WHERE id=?";

        try (Connection conn = ConexionBD.conectar();
            PreparedStatement ps = conn.prepareStatement(sql)) {
              // Asignar nuevos valores a la consulta
            ps.setString(1, cita.getNombre());
            ps.setString(2, cita.getTelefono());
            ps.setString(3, cita.getServicio());
            ps.setDouble(4, cita.getPrecio());
            ps.setString(5, cita.getFecha());
            ps.setString(6, cita.getHora());
            ps.setInt(7, cita.getId());
            
            // Ejecutar actualización
            ps.executeUpdate();

            System.out.println("Cita actualizada");

        } catch (Exception e) {
            
            // Manejo de errores
            System.out.println("Error: " + e.getMessage());
        }
    }
}
