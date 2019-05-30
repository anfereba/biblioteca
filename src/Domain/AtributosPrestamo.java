package Domain;

public class AtributosPrestamo {

    private int N_Prestamo, Id_Lector, Id_Reserva;
    private String Fecha_Prestamo, Fecha_Devuelto, nombre, apellido, NombreLibro, validado;

    public int getN_Prestamo() {
        return N_Prestamo;
    }

    public int getId_Reserva() {
        return Id_Reserva;
    }

    public void setId_Reserva(int Id_Reserva) {
        this.Id_Reserva = Id_Reserva;
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

    public String getNombreLibro() {
        return NombreLibro;
    }

    public void setNombreLibro(String NombreLibro) {
        this.NombreLibro = NombreLibro;
    }

    public String getValidado() {
        return validado;
    }

    public void setValidado(String validado) {
        this.validado = validado;
    }

    public void setN_Prestamo(int N_Prestamo) {
        this.N_Prestamo = N_Prestamo;
    }

    public int getId_Lector() {
        return Id_Lector;
    }

    public void setId_Lector(int Id_Lector) {
        this.Id_Lector = Id_Lector;
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

}
