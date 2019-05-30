package Datos;
import Domain.AtributosPrestamo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
public class PrestamoJDBC {
    public boolean correcto=false;
    private final String SQL_INSERT = "INSERT INTO prestamo(N_Prestamo, Id_Lector, Id_Libro, Fecha_Prestamo, Fecha_Devuelto, Devuelto) VALUES(?,?,?,?,?,?)";
    private final String SQL_UPDATE= "UPDATE prestamo SET validado = ? WHERE prestamo.N_Prestamo = ?";
    private final String SQL_DELETE= "DELETE FROM prestamo WHERE N_Prestamo = ?";
    public int insert(int N_Prestamo, int Id_Lector, int Id_Libro, String Fecha_Prestamo, String Fecha_Devuelto, String Devuelto) {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;//no se utiliza en este ejercicio		
        int rows = 0; //registros afectados
        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_INSERT);
            stmt.setInt(1,N_Prestamo);
            stmt.setInt(2,Id_Lector);
            stmt.setInt(3,Id_Libro);
            stmt.setString(4, Fecha_Prestamo);
            stmt.setString(5, Fecha_Devuelto);
            stmt.setString(6, Devuelto);
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
        public int update(String Validado ,int N_Prestamo) {
        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;
        try {
            conn = Conexion.getConnection();
            System.out.println("Ejecutando query:" + SQL_UPDATE);
            stmt = conn.prepareStatement(SQL_UPDATE); 
            stmt.setString(1, Validado);
            stmt.setInt(2,N_Prestamo);
            rows = stmt.executeUpdate();
            System.out.println("Registros actualizados:" + rows);
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
        public int delete(int N_Prestamo) {
        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;
        try {
            conn = Conexion.getConnection();
            System.out.println("Ejecutando query:" + SQL_DELETE);
            stmt = conn.prepareStatement(SQL_DELETE);
            stmt.setInt(1, N_Prestamo);
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
        public List<AtributosPrestamo> select(String Validado) {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        AtributosPrestamo prestamo = null;
        String SQL_SELECT= "SELECT N_Prestamo, Id_Reserva, Id_Lector, nombre, apellido, NombreLibro, Fecha_Prestamo, Fecha_Devuelto, validado FROM vistavalidarprestamo WHERE validado = '"+Validado+"' ORDER BY N_Prestamo";
        List<AtributosPrestamo> prestamos = new ArrayList<AtributosPrestamo>();
        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_SELECT);
            rs = stmt.executeQuery();
            while (rs.next()) {
                int N_Prestamo = rs.getInt(1);
                int Id_Reserva = rs.getInt(2);
                int Id_Lector = rs.getInt(3);
                String nombre = rs.getString(4);
                String apellido = rs.getString(5);
                String NombreLibro = rs.getString(6);
                String Fecha_Prestamo = rs.getString(7);
                String Fecha_Devuelto = rs.getString(8);
                String validado = rs.getString(9);
                prestamo = new AtributosPrestamo();
                prestamo.setN_Prestamo(N_Prestamo);
                prestamo.setId_Reserva(Id_Reserva);
                prestamo.setId_Lector(Id_Lector);
                prestamo.setNombre(nombre);
                prestamo.setApellido(apellido);
                prestamo.setNombreLibro(NombreLibro);
                prestamo.setFecha_Prestamo(Fecha_Prestamo);
                prestamo.setFecha_Devuelto(Fecha_Devuelto);
                prestamo.setValidado(validado);
                prestamos.add(prestamo);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            Conexion.close(rs);
            Conexion.close(stmt);
            Conexion.close(conn);
        }
        return prestamos;
    }
}
