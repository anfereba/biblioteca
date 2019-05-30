package Domain;
public class AtributosVistaReservaUsuario {
    private int Id_Reserva, Id_Lector;
    private String nombre, apellido, Titulo, Fecha_Prestamo, Fecha_Devuelto, EstadoPrestamo;

    public int getId_Reserva() {
        return Id_Reserva;
    }

    public void setId_Reserva(int Id_Reserva) {
        this.Id_Reserva = Id_Reserva;
    }

    public int getId_Lector() {
        return Id_Lector;
    }

    public void setId_Lector(int Id_Lector) {
        this.Id_Lector = Id_Lector;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public String getFecha_Prestamo() {
        return Fecha_Prestamo;
    }

    public void setFecha_Prestamo(String Fecha_Prestamo) {
        this.Fecha_Prestamo = Fecha_Prestamo;
    }

    public String getFecha_Devuelto() {
        return Fecha_Devuelto;
    }

    public void setFecha_Devuelto(String Fecha_Devuelto) {
        this.Fecha_Devuelto = Fecha_Devuelto;
    }

    public String getEstadoPrestamo() {
        return EstadoPrestamo;
    }

    public void setEstadoPrestamo(String EstadoPrestamo) {
        this.EstadoPrestamo = EstadoPrestamo;
    }
    
    
}
