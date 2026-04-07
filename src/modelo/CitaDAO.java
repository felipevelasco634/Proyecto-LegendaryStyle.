package modelo;

import conexion.ConexionBD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class CitaDAO {
    public void insertar(Cita cita) {
        String sql = "INSERT INTO citas(nombre, telefono, servicio, precio, fecha, hora) VALUES (?, ?, ?, ?, ?, ?)";
        try (Connection conn = ConexionBD.conectar();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            
            ps.setString(1, cita.getNombre());
            ps.setString(2, cita.getTelefono());
            ps.setString(3, cita.getServicio());
            ps.setDouble(4, cita.getPrecio());
            ps.setString(5, cita.getFecha());
            ps.setString(6, cita.getHora());
            
            ps.executeUpdate();
            
            System.out.println("Cita guardada correctamente");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    
    public List<Cita> listar() {
        
        List<Cita> lista = new ArrayList<>();
        String sql = "SELECT * FROM citas";
        
        try (Connection conn = ConexionBD.conectar();
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql)) {
            
            while (rs.next()) {
            Cita c = new Cita(
                rs.getInt("id"),
                rs.getString("nombre"),
                rs.getString("telefono"),
                rs.getString("servicio"),
                rs.getDouble("precio"),
                rs.getString("fecha"),
                rs.getString("hora")
            );
            lista.add(c);
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        return lista;
    }
    public void eliminar(int id) {

        String sql = "DELETE FROM citas WHERE id = ?";

        try (Connection conn = ConexionBD.conectar();
            PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, id);
            ps.executeUpdate();

            System.out.println("Cita eliminada");
   
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    public void actualizar(Cita cita) {

        String sql = "UPDATE citas SET nombre=?, telefono=?, servicio=?, precio=?, fecha=?, hora=? WHERE id=?";

        try (Connection conn = ConexionBD.conectar();
            PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, cita.getNombre());
            ps.setString(2, cita.getTelefono());
            ps.setString(3, cita.getServicio());
            ps.setDouble(4, cita.getPrecio());
            ps.setString(5, cita.getFecha());
            ps.setString(6, cita.getHora());
            ps.setInt(7, cita.getId());

            ps.executeUpdate();

            System.out.println("Cita actualizada");

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
