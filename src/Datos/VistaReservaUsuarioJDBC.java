package Datos;

import Domain.AtributosVistaReservaUsuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class VistaReservaUsuarioJDBC {

    public List<AtributosVistaReservaUsuario> select(int Id_Lector, String EstadoPrestamo) {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        AtributosVistaReservaUsuario estadosReserva = null;
        String SQL_SELECT = "SELECT Id_Reserva, Id_Lector, nombre, apellido, Titulo, Fecha_Prestamo, Fecha_Devuelto, EstadoPrestamo FROM vistareservasusuario WHERE Id_Lector = "+Id_Lector+" && EstadoPrestamo = '"+EstadoPrestamo+"'";
        List<AtributosVistaReservaUsuario> EstadoLibro = new ArrayList<AtributosVistaReservaUsuario>();
        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_SELECT);
            rs = stmt.executeQuery();
            while (rs.next()) {
 
                int Id_Reserva = rs.getInt(1);
                int Id_Lector2 = rs.getInt(2);
                String nombre = rs.getString(3);
                String apellido = rs.getString(4);
                String Titulo = rs.getString(5);
                String Fecha_Prestamo = rs.getString(6);
                String Fecha_Devuelto = rs.getString(7);
                estadosReserva = new AtributosVistaReservaUsuario();
                estadosReserva.setId_Reserva(Id_Reserva);
                estadosReserva.setId_Lector(Id_Lector2);
                estadosReserva.setNombre(nombre);
                estadosReserva.setApellido(apellido);
                estadosReserva.setTitulo(Titulo);
                estadosReserva.setFecha_Prestamo(Fecha_Prestamo);
                estadosReserva.setFecha_Devuelto(Fecha_Devuelto);
                estadosReserva.setEstadoPrestamo(EstadoPrestamo);
                EstadoLibro.add(estadosReserva);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            Conexion.close(rs);
            Conexion.close(stmt);
            Conexion.close(conn);
        }
        return EstadoLibro;
    }

}
