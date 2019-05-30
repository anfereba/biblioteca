package Datos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ReservaJDBC {
    public boolean correcto;
     private final String SQL_INSERT = "INSERT INTO reservas (Id_Lector, Id_Libro, Fecha_Prestamo) VALUES (?, ?, ?)";
     public int insert(int Id_Lector, int Id_Libro, String Fecha_Prestamo) {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;//no se utiliza en este ejercicio		
        int rows = 0; //registros afectados
        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_INSERT);
            stmt.setInt(1, Id_Lector);
            stmt.setInt(2, Id_Libro);
            stmt.setString(3, Fecha_Prestamo);
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
}
