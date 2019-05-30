package Domain;
public class AtributosLibro {
    private int Id_Libro;
    private String Titulo,Editorial,Area;

    public int getId_Libro() {
        return Id_Libro;
    }

    public void setId_Libro(int Id_Libro) {
        this.Id_Libro = Id_Libro;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public String getEditorial() {
        return Editorial;
    }

    public void setEditorial(String Editorial) {
        this.Editorial = Editorial;
    }

    public String getArea() {
        return Area;
    }

    public void setArea(String Area) {
        this.Area = Area;
    }

    @Override
    public String toString() {
        return "AtributosLibro{" + "Id_Libro=" + Id_Libro + ", Titulo=" + Titulo + ", Editorial=" + Editorial + ", Area=" + Area + '}';
    }
    

    
}
