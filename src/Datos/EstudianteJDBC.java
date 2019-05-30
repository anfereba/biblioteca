package Datos;
import Domain.AtributosEstudiante;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EstudianteJDBC {
    public boolean correcto = false;
    private final String SQL_INSERT = "INSERT INTO estudiante(Id_Lector, CI, Nombre, Apellido, Direccion, Carrera, Fecha_Nac, email) VALUES(?,?,?,?,?,?,?,?)";
    private final String SQL_UPDATE = "UPDATE estudiante SET CC=?, nombre=?, apellido=?, Direccion=?, carrera=?, Fecha_Nac=?, Telefono=?, email=?, Password=?, Id_EstadoEstudiante=? WHERE Id_Lector=?";
    private final String SQL_DELETE = "DELETE FROM estudiante WHERE Id_Lector = ?";
    private final String SQL_SELECT = "SELECT Id_Lector, CC, Nombre, Apellido, Direccion, Carrera, Fecha_Nac, telefono, email, password, Id_EstadoEstudiante FROM estudiante ORDER BY Id_Lector";

    public int insert(int Id_Lector, int CI, String Nombre, String Apellido, String Direccion, String Carrera, String Fecha_Nac, String email) {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;//no se utiliza en este ejercicio		
        int rows = 0; //registros afectados
        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_INSERT);
            stmt.setInt(1, Id_Lector);
            stmt.setInt(2, CI);
            stmt.setString(3, Nombre);
            stmt.setString(4, Apellido);
            stmt.setString(5, Direccion);
            stmt.setString(6, Carrera);
            stmt.setString(7, Fecha_Nac);
            stmt.setString(8, email);
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

    public int update(int CC, String Nombre, String Apellido, String Direccion, String Carrera, String Fecha_Nac, long telefono, String email, String Password, int Id_Estadoestudiante, int Id_Lector) {
        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;
        try {
            conn = Conexion.getConnection();
            System.out.println("Ejecutando query:" + SQL_UPDATE);
            stmt = conn.prepareStatement(SQL_UPDATE);
            stmt.setInt(1, CC);
            stmt.setString(2, Nombre);
            stmt.setString(3, Apellido);
            stmt.setString(4, Direccion);
            stmt.setString(5, Carrera);
            stmt.setString(6, Fecha_Nac);
            stmt.setLong(7, telefono);
            stmt.setString(8, email);
            stmt.setString(9, Password);
            stmt.setInt(10, Id_Estadoestudiante);
            stmt.setInt(11, Id_Lector);
            rows = stmt.executeUpdate();
            correcto = true;
            System.out.println("Registros actualizados:" + rows);
        } catch (SQLException e) {
            e.printStackTrace();
            correcto = false;
        } finally {
            Conexion.close(stmt);
            Conexion.close(conn);
        }
        return rows;
    }

    public int delete(int Id_Lector) {
        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;
        try {
            conn = Conexion.getConnection();
            System.out.println("Ejecutando query:" + SQL_DELETE);
            stmt = conn.prepareStatement(SQL_DELETE);
            stmt.setInt(1, Id_Lector);
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

    public List<AtributosEstudiante> select() {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        AtributosEstudiante estudiante = null;
        List<AtributosEstudiante> estudiantes = new ArrayList<AtributosEstudiante>();
        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_SELECT);
            rs = stmt.executeQuery();
            while (rs.next()) {
                int Id_Lector = rs.getInt(1);
                long CC = rs.getLong(2);
                String Nombre = rs.getString(3);
                String Apellido = rs.getString(4);
                String Direccion = rs.getString(5);
                String Carrera = rs.getString(6);
                String Fecha_Nac = rs.getString(7);
                long telefono = rs.getLong(8);
                String email = rs.getString(9);
                String Password = rs.getString(10);
                int Id_EstadoEstudiante = rs.getInt(11);
                estudiante = new AtributosEstudiante();
                estudiante.setId_Lector(Id_Lector);
                estudiante.setCI(CC);
                estudiante.setNombre(Nombre);
                estudiante.setApellido(Apellido);
                estudiante.setDireccion(Direccion);
                estudiante.setCarrera(Carrera);
                estudiante.setFecha_Nac(Fecha_Nac);
                estudiante.setTelefono(telefono);
                estudiante.setEmail(email);
                estudiante.setPassword(Password);
                estudiante.setId_EstadoEstudiante(Id_EstadoEstudiante);
                estudiantes.add(estudiante);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            Conexion.close(rs);
            Conexion.close(stmt);
            Conexion.close(conn);
        }
        return estudiantes;
    }
    public List<AtributosEstudiante> BuscarEstudiante(String param1, String param2) {
        String SQL_SELECT = "SELECT Id_Lector, CC, Nombre, Apellido, Direccion, Carrera, Fecha_Nac, telefono, email, password, Id_EstadoEstudiante FROM estudiante WHERE "+param1+" = '"+param2+"'";
        System.out.println(SQL_SELECT);
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        AtributosEstudiante estudiante = null;
        List<AtributosEstudiante> estudiantes = new ArrayList<AtributosEstudiante>();
        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_SELECT);
            rs = stmt.executeQuery();
            while (rs.next()) {
                int Id_Lector = rs.getInt(1);
                long CC = rs.getLong(2);
                String Nombre = rs.getString(3);
                String Apellido = rs.getString(4);
                String Direccion = rs.getString(5);
                String Carrera = rs.getString(6);
                String Fecha_Nac = rs.getString(7);
                long telefono = rs.getLong(8);
                String email = rs.getString(9);
                String Password = rs.getString(10);
                int Id_EstadoEstudiante = rs.getInt(11);
                estudiante = new AtributosEstudiante();
                estudiante.setId_Lector(Id_Lector);
                estudiante.setCI(CC);
                estudiante.setNombre(Nombre);
                estudiante.setApellido(Apellido);
                estudiante.setDireccion(Direccion);
                estudiante.setCarrera(Carrera);
                estudiante.setFecha_Nac(Fecha_Nac);
                estudiante.setTelefono(telefono);
                estudiante.setEmail(email);
                estudiante.setPassword(Password);
                estudiante.setId_EstadoEstudiante(Id_EstadoEstudiante);
                estudiantes.add(estudiante);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            Conexion.close(rs);
            Conexion.close(stmt);
            Conexion.close(conn);
        }
        return estudiantes;
    }

}
