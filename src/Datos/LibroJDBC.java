package Datos;
import Domain.AtributosLibro;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
public class LibroJDBC {
    public boolean correcto=false;
    private final String SQL_INSERT = "INSERT INTO libro(Id_Libro, Titulo, Editorial, Area) VALUES(?,?,?,?)";
    private final String SQL_UPDATE= "UPDATE libro SET Titulo=?, Editorial=?, Area=? WHERE Id_Libro=?";
    private final String SQL_DELETE= "DELETE FROM libro WHERE Id_Libro = ?";
    private final String SQL_SELECT= "SELECT Id_Libro, Titulo, Editorial, Area FROM libro ORDER BY Id_Libro";
        public int insert(int Id_Libro ,String Titulo, String Editorial, String Area) {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;//no se utiliza en este ejercicio		
        int rows = 0; //registros afectados
        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_INSERT);
            stmt.setInt(1,Id_Libro);
            stmt.setString(2, Titulo);
            stmt.setString(3, Editorial);
            stmt.setString(4, Area);
            System.out.println("Ejecutando query:" + SQL_INSERT);
            rows = stmt.executeUpdate();//no. registros afectados
            System.out.println("Registros afectados:" + rows);
            correcto=true;
        } catch (SQLException e) {
            e.printStackTrace();
            correcto=false;
        } finally {
            Conexion.close(stmt);
            Conexion.close(conn);
        }
        return rows;
    }
        public int update(String Titulo, String Editorial, String Area,int Id_Libro) {
        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;
        try {
            conn = Conexion.getConnection();
            System.out.println("Ejecutando query:" + SQL_UPDATE);
            stmt = conn.prepareStatement(SQL_UPDATE);          
            stmt.setString(1, Titulo);
            stmt.setString(2, Editorial);
            stmt.setString(3, Area);
            stmt.setInt(4,Id_Libro);
            rows = stmt.executeUpdate();
            System.out.println("Registros actualizados:" + rows);
            correcto=true;
        } catch (SQLException e) {
            e.printStackTrace();
            correcto=false;
        } finally {
            Conexion.close(stmt);
            Conexion.close(conn);
        }
        return rows;
    }
        public int delete(int Id_Libro) {
        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;
        try {
            conn = Conexion.getConnection();
            System.out.println("Ejecutando query:" + SQL_DELETE);
            stmt = conn.prepareStatement(SQL_DELETE);
            stmt.setInt(1, Id_Libro);
            rows = stmt.executeUpdate();
            System.out.println("Registros eliminados:" + rows);
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            Conexion.close(stmt);
            Conexion.close(conn);
        }
        return rows;
    }
        public List<AtributosLibro> select() {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        AtributosLibro libro = null;
        List<AtributosLibro> libros = new ArrayList<AtributosLibro>();
        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_SELECT);
            rs = stmt.executeQuery();
            while (rs.next()) {
                int Id_Libro = rs.getInt(1);
                String Titulo = rs.getString(2);
                String Editorial = rs.getString(3);
                String Area = rs.getString(4);
                libro = new AtributosLibro();
                libro.setId_Libro(Id_Libro);
                libro.setTitulo(Titulo);
                libro.setEditorial(Editorial);
                libro.setArea(Area);
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
