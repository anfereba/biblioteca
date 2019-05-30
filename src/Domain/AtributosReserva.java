package Domain;

public class AtributosReserva {

    private int Id_Reserva, Id_Lector, Id_Libro, Id_Estado;
    private String Fecha_Prestamo;

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

    public int getId_Libro() {
        return Id_Libro;
    }

    public void setId_Libro(int Id_Libro) {
        this.Id_Libro = Id_Libro;
    }

    public int getId_Estado() {
        return Id_Estado;
    }

    public void setId_Estado(int Id_Estado) {
        this.Id_Estado = Id_Estado;
    }

    public String getFecha_Prestamo() {
        return Fecha_Prestamo;
    }

    public void setFecha_Prestamo(String Fecha_Prestamo) {
        this.Fecha_Prestamo = Fecha_Prestamo;
    }

}
