package Datos;

import Domain.AtributosMulta;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class VistaMultaJDBC {

    private String SQL_SELECT = "SELECT Id_Lector, nombre, apellido, Id_Libro, Titulo, Fecha_Prestamo, Fecha_Devuelto, Fecha_Retornado, total FROM detalleprestamo WHERE total > 0";

    public List<AtributosMulta> select() {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        AtributosMulta multa = null;
        List<AtributosMulta> multas = new ArrayList<AtributosMulta>();
        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_SELECT);
            rs = stmt.executeQuery();
            while (rs.next()) {
                int Id_Lector = rs.getInt(1);
                String Nombre = rs.getString(2);
                String Apellido = rs.getString(3);
                int Id_Libro = rs.getInt(4);
                String Titulo = rs.getString(5);
                String Fecha_Prestamo = rs.getString(6);
                String Fecha_Devuelto = rs.getString(7);
                String Fecha_Retornado = rs.getString(8);
                int Total = rs.getInt(9);
                multa = new AtributosMulta();
                multa.setId_lector(Id_Lector);
                multa.setNombre(Nombre);
                multa.setApellido(Apellido);
                multa.setId_Libro(Id_Libro);
                multa.setTitulo(Titulo);
                multa.setFecha_Prestamo(Fecha_Prestamo);
                multa.setFecha_Devuelto(Fecha_Devuelto);
                multa.setFecha_Retornado(Fecha_Retornado);
                multa.setTotal(Total);
                multas.add(multa);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            Conexion.close(rs);
            Conexion.close(stmt);
            Conexion.close(conn);
        }
        return multas;
    }
}
