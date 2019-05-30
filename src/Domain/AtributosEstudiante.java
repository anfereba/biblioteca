package Domain;
public class AtributosEstudiante {
    private long Telefono,CI;
    private int Id_Lector,Id_EstadoEstudiante;
    private String Nombre, Apellido, Direccion, Carrera, Fecha_Nac,email,Password;


    public int getId_EstadoEstudiante() {
        return Id_EstadoEstudiante;
    }

    public void setId_EstadoEstudiante(int Id_EstadoEstudiante) {
        this.Id_EstadoEstudiante = Id_EstadoEstudiante;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }
    
    public int getId_Lector() {
        return Id_Lector;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public void setId_Lector(int Id_Lector) {
        this.Id_Lector = Id_Lector;
    }

    public long getTelefono() {
        return Telefono;
    }

    public void setTelefono(long Telefono) {
        this.Telefono = Telefono;
    }

    public long getCI() {
        return CI;
    }

    public void setCI(long CI) {
        this.CI = CI;
    }


    public String getFecha_Nac() {
        return Fecha_Nac;
    }

    public void setFecha_Nac(String Fecha_Nac) {
        this.Fecha_Nac = Fecha_Nac;
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

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public String getCarrera() {
        return Carrera;
    }

    public void setCarrera(String Carrera) {
        this.Carrera = Carrera;
    }

    @Override
    public String toString() {
        return "AtributosEstudiante{" + "Id_Lector=" + Id_Lector + ", CI=" + CI + ", Nombre=" + Nombre + ", Apellido=" + Apellido + ", Direccion=" + Direccion + ", Carrera=" + Carrera + ", Fecha_Nac=" + Fecha_Nac + '}';
    }

    
}
