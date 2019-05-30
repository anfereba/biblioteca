package Datos;

import Domain.AtributosVistaDevolverLibro;
import java.sql.*;
import java.util.*;

public class VistaDevolverLibroJDBC {

    private String SQL_SELECT = "SELECT Id_Costeo, N_Prestamo, Id_Libro, Id_Reserva, nombre, "
            + "apellido, NombreLibro, Fecha_Prestamo, Fecha_Devuelto, Fecha_Retornado FROM vistadevolverlibro";;
    public List<AtributosVistaDevolverLibro> select() {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        AtributosVistaDevolverLibro Devolverlibro = null;
        List<AtributosVistaDevolverLibro> DevolverLibros = new ArrayList<AtributosVistaDevolverLibro>();
        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_SELECT);
            rs = stmt.executeQuery();
            while (rs.next()) {
                int Id_Costeo = rs.getInt(1);
                int N_Prestamo = rs.getInt(2);
                int Id_Libro = rs.getInt(3);
                int Id_Reserva = rs.getInt(4);
                String Nombre = rs.getString(5);
                String Apellido = rs.getString(6);
                String NombreLibro = rs.getString(7);
                String Fecha_Prestamo = rs.getString(8);
                String Fecha_Devuelto = rs.getString(9);
                String Fecha_Retornado = rs.getString(10);
                Devolverlibro = new AtributosVistaDevolverLibro();
                Devolverlibro.setId_Costeo(Id_Costeo);
                Devolverlibro.setN_Prestamo(N_Prestamo);
                Devolverlibro.setId_Libro(Id_Libro);
                Devolverlibro.setId_Reserva(Id_Reserva);
                Devolverlibro.setNombre(Nombre);
                Devolverlibro.setApellido(Apellido);
                Devolverlibro.setNombreLibro(NombreLibro);
                Devolverlibro.setFecha_Prestamo(Fecha_Prestamo);
                Devolverlibro.setFecha_Devuelto(Fecha_Devuelto);
                Devolverlibro.setFecha_Retornado(Fecha_Retornado);
                DevolverLibros.add(Devolverlibro);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            Conexion.close(rs);
            Conexion.close(stmt);
            Conexion.close(conn);
        }
        return DevolverLibros;
    }
    public int DevolverLibro(String Fecha_Retornado, int Id_Costeo){
       String SQL_UPDATE = "UPDATE costeo SET Fecha_Retornado = ? WHERE Id_Costeo = ?";
       Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;
        try {
            conn = Conexion.getConnection();
            System.out.println("Ejecutando query:" + SQL_UPDATE);
            stmt = conn.prepareStatement(SQL_UPDATE);
            stmt.setString(1, Fecha_Retornado);
            stmt.setInt(2, Id_Costeo);
            rows = stmt.executeUpdate();
            System.out.println("Registros actualizados:" + rows);
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            Conexion.close(stmt);
            Conexion.close(conn);
        }
        return rows;
    }
}
