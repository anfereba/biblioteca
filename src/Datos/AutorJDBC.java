package Datos;
import Domain.Atributos;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
public class AutorJDBC {
    public boolean correcto=false;
    private final String SQL_INSERT = "INSERT INTO autor(Nombre, Nacionalidad, Fecha_Nac) VALUES(?,?,?)";
    private final String SQL_UPDATE= "UPDATE autor SET Nombre=?, Nacionalidad=?, Fecha_Nac=? WHERE Id_Autor=?";
    private final String SQL_DELETE= "DELETE FROM autor WHERE Id_Autor = ?";
    private final String SQL_SELECT= "SELECT Id_Autor, Nombre, Nacionalidad, Fecha_Nac FROM autor ORDER BY Id_Autor";
    public int insert(String nombre, String Nacionalidad, String Fecha_Nac) {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;//no se utiliza en este ejercicio		
        int rows = 0; //registros afectados
        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_INSERT);
            stmt.setString(1, nombre);
            stmt.setString(2, Nacionalidad);
            stmt.setString(3, Fecha_Nac);
            System.out.println("Ejecutando query:" + SQL_INSERT);
            rows = stmt.executeUpdate();//no. registros afectados
            System.out.println("Registros afectados:" + rows);
            correcto=true;
        } catch (SQLException e) {
            correcto=false;
            e.printStackTrace();
        } finally {
            Conexion.close(stmt);
            Conexion.close(conn);
        }
        return rows;
    }
    public int update(String nombre, String Nacionalidad, String Fecha_Nac, int Id_Autor ) {
        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;
        try {
            conn = Conexion.getConnection();
            System.out.println("Ejecutando query:" + SQL_UPDATE);
            stmt = conn.prepareStatement(SQL_UPDATE);
            stmt.setString(1, nombre);
            stmt.setString(2, Nacionalidad);
            stmt.setString(3, Fecha_Nac);
            stmt.setInt(4, Id_Autor);
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
        public int delete(int Id_Autor) {
        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;
        try {
            conn = Conexion.getConnection();
            System.out.println("Ejecutando query:" + SQL_DELETE);
            stmt = conn.prepareStatement(SQL_DELETE);
            stmt.setInt(1, Id_Autor);
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
        public List<Atributos> select() {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Atributos autor = null;
        List<Atributos> autores = new ArrayList<Atributos>();
        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_SELECT);
            rs = stmt.executeQuery();
            while (rs.next()) {
                int Id_Autor = rs.getInt(1);
                String Nombre = rs.getString(2);
                String Nacionalidad = rs.getString(3);
                String Fecha_Nac = rs.getString(4);
                autor = new Atributos();
                autor.setId_Autor(Id_Autor);
                autor.setNombre_A(Nombre);
                autor.setNacionalidad(Nacionalidad);
                autor.setFecha_Nac(Fecha_Nac);
                autores.add(autor);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            Conexion.close(rs);
            Conexion.close(stmt);
            Conexion.close(conn);
        }
        return autores;
    }
        
}
