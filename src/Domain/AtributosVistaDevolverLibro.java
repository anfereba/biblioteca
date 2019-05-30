package Domain;

public class AtributosVistaDevolverLibro {

    private int Id_Costeo, N_Prestamo, Id_Libro, Id_Reserva;
    private String Nombre, Apellido, NombreLibro, Fecha_Prestamo, Fecha_Devuelto, Fecha_Retornado;

    public int getId_Costeo() {
        return Id_Costeo;
    }

    public void setId_Costeo(int Id_Costeo) {
        this.Id_Costeo = Id_Costeo;
    }

    public int getN_Prestamo() {
        return N_Prestamo;
    }

    public void setN_Prestamo(int N_Prestamo) {
        this.N_Prestamo = N_Prestamo;
    }

    public int getId_Libro() {
        return Id_Libro;
    }

    public void setId_Libro(int Id_Libro) {
        this.Id_Libro = Id_Libro;
    }

    public int getId_Reserva() {
        return Id_Reserva;
    }

    public void setId_Reserva(int Id_Reserva) {
        this.Id_Reserva = Id_Reserva;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getNombreLibro() {
        return NombreLibro;
    }

    public void setNombreLibro(String NombreLibro) {
        this.NombreLibro = NombreLibro;
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

    public String getFecha_Retornado() {
        return Fecha_Retornado;
    }

    public void setFecha_Retornado(String Fecha_Retornado) {
        this.Fecha_Retornado = Fecha_Retornado;
    }

}
