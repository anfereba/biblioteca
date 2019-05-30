package Datos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LibroAutorJDBC {

    private final String SQL_INSERT = "INSERT INTO libaut(Id_Autor, Id_Libro) VALUES(?,?)";
    private final String SQL_UPDATE = "UPDATE libro SET Id_Autor=?, Id_Libro=? WHERE 1";
    public boolean correcto = false;

    public int insert(int Id_Autor, int Id_Libro) {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;//no se utiliza en este ejercicio		
        int rows = 0; //registros afectados
        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_INSERT);
            stmt.setInt(1, Id_Autor);
            stmt.setInt(2, Id_Libro);
            System.out.println("Ejecutando query:" + SQL_INSERT);
            rows = stmt.executeUpdate();//no. registros afectados
            System.out.println("Registros afectados:" + rows);
            correcto = true;
        } catch (SQLException e) {
            e.printStackTrace();
            correcto = false;
        } finally {
            Conexion.close(stmt);
            Conexion.close(conn);
        }
        return rows;
    }
    public int update(int Id_Autor, int Id_Libro) {
        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;
        try {
            conn = Conexion.getConnection();
            System.out.println("Ejecutando query:" + SQL_UPDATE);
            stmt = conn.prepareStatement(SQL_UPDATE);
            stmt.setInt(1, Id_Autor);
            stmt.setInt(2, Id_Libro);
            rows = stmt.executeUpdate();
            System.out.println("Registros actualizados:" + rows);
            correcto = true;
        } catch (SQLException e) {
            e.printStackTrace();
            correcto = false;
        } finally {
            Conexion.close(stmt);
            Conexion.close(conn);
        }
        return rows;
    }
}
