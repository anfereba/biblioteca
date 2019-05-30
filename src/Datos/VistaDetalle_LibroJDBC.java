package Datos;
import Domain.AtributosVistaDetalle_Libro;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
public class VistaDetalle_LibroJDBC {
    private final String SQL_SELECT= "SELECT Id_Libro, Titulo, Nombre FROM detalle_libro ORDER BY Id_Libro";
    private final String SQL_UPDATE = "UPDATE costeo set Fecha_Retornado =? WHERE Id_Costeo = ?";
        public List<AtributosVistaDetalle_Libro> select() {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        AtributosVistaDetalle_Libro libro = null;
        List<AtributosVistaDetalle_Libro> libros = new ArrayList<AtributosVistaDetalle_Libro>();
        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_SELECT);
            rs = stmt.executeQuery();
            while (rs.next()) {
                int Id_Libro = rs.getInt(1);
                String Titulo = rs.getString(2);
                String Nombre = rs.getString(3);
                libro = new AtributosVistaDetalle_Libro();
                libro.setId_Libro(Id_Libro);
                libro.setTitulo(Titulo);
                libro.setNombre(Nombre);
                libros.add(libro);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            Conexion.close(rs);
            Conexion.close(stmt);
            Conexion.close(conn);
        }
        return libros;
    }
        public List<AtributosVistaDetalle_Libro> SearchLibro(String TituloLibro) {
        String SQL_SEARCH= "SELECT Id_Libro, Titulo, Nombre FROM detalle_libro WHERE Titulo = '"+TituloLibro+"'";
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        AtributosVistaDetalle_Libro libro = null;
        List<AtributosVistaDetalle_Libro> libros = new ArrayList<AtributosVistaDetalle_Libro>();
        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_SEARCH);
            rs = stmt.executeQuery();
            while (rs.next()) {
                int Id_Libro = rs.getInt(1);
                String Titulo = rs.getString(2);
                String Nombre = rs.getString(3);
                libro = new AtributosVistaDetalle_Libro();
                libro.setId_Libro(Id_Libro);
                libro.setTitulo(Titulo);
                libro.setNombre(Nombre);
                libros.add(libro);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            Conexion.close(rs);
            Conexion.close(stmt);
            Conexion.close(conn);
        }
        return libros;
    }
        
}
