package modelo;

public class Cita {
    private int id;
    private String nombre;
    private String telefono;
    private String servicio;
    private double precio;
    private String fecha;
    private String hora;
    
    public Cita(int id, String nombre, String telefono, String servicio, double precio, String fecha, String hora) {
        this.id = id;
        this.nombre = nombre;
        this.telefono = telefono;
        this.servicio = servicio;
        this.precio = precio;
        this.fecha = fecha;
        this.hora = hora;
    
    }
    public int getId() { return id; }
    public String getNombre() { return nombre; }
    public String getTelefono() { return telefono; }
    public String getServicio() { return servicio; }
    public double getPrecio() { return precio; }
    public String getFecha() { return fecha; }
    public String getHora() { return hora; }
}
