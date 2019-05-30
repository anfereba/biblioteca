package Domain;
public class Atributos {
    private int Id_Autor;
    private String Nombre_A,Nacionalidad,Fecha_Nac;

    public int getId_Autor() {
        return Id_Autor;
    }

    public String getFecha_Nac() {
        return Fecha_Nac;
    }

    public void setFecha_Nac(String Fecha_Nac) {
        this.Fecha_Nac = Fecha_Nac;
    }

    public void setId_Autor(int Id_Autor) {
        this.Id_Autor = Id_Autor;
    }
    public String getNombre_A() {
        return Nombre_A;
    }

    public void setNombre_A(String Nombre_A) {
        this.Nombre_A = Nombre_A;
    }

    public String getNacionalidad() {
        return Nacionalidad;
    }

    public void setNacionalidad(String Nacionalidad) {
        this.Nacionalidad = Nacionalidad;
    }


}
