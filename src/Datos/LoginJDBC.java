package Datos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginJDBC {

    public boolean correcto = false;
    private final String SQL_INSERT = "INSERT INTO estudiante(CC, Nombre, Apellido, Direccion, Carrera, Fecha_Nac, telefono, email, password) VALUES(?,?,?,?,?,?,?,?,?)";

    public int insert(long CC, String Nombre, String Apellido, String Direccion, String Carrera, String Fecha_Nac, long telefono, String email, String Password) {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;//no se utiliza en este ejercicio
        int rows = 0; //registros afectados
        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_INSERT);
            stmt.setLong(1, CC);
            stmt.setString(2, Nombre);
            stmt.setString(3, Apellido);
            stmt.setString(4, Direccion);
            stmt.setString(5, Carrera);
            stmt.setString(6, Fecha_Nac);
            stmt.setLong(7, telefono);
            stmt.setString(8, email);
            stmt.setString(9, Password);
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

    public String searchName(String email) {
        String Busqueda_Nombre = null;
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        try {
            conn = Conexion.getConnection();
            String SQL_SEARCH = "SELECT nombre,apellido FROM estudiante WHERE email = '" + email + "'";
            stmt = conn.prepareStatement(SQL_SEARCH);
            rs = stmt.executeQuery();
            if (rs.next()) {
                String nombre = rs.getString("nombre");
                String apellidos = rs.getString("apellido");
                Busqueda_Nombre = (nombre + " " + apellidos);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            Conexion.close(rs);
            Conexion.close(stmt);
            Conexion.close(conn);
        }
        return Busqueda_Nombre;
    }

    public String SearchRegistredUser(String email, String Password) {
        String Busqueda_Usuario = null;
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        try {
            conn = Conexion.getConnection();
            String SQL_SEARCH_USER = "SELECT nombre,email,password from estudiante WHERE email = '" + email + "' && password = '" + Password + "'";
            stmt = conn.prepareStatement(SQL_SEARCH_USER);
            rs = stmt.executeQuery();
            if (rs.next()) {
                Busqueda_Usuario = "Usuario encontrado";
            } else {
                Busqueda_Usuario = "Usuario NO encontrado";
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            Conexion.close(rs);
            Conexion.close(stmt);
            Conexion.close(conn);
        }
        return Busqueda_Usuario;
    }

    public String searchIdLector(String email) {
        String Busqueda_Id = null;
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        try {
            conn = Conexion.getConnection();
            String SQL_SEARCH = "SELECT Id_Lector FROM estudiante WHERE email = '" + email + "'";
            stmt = conn.prepareStatement(SQL_SEARCH);
            rs = stmt.executeQuery();
            if (rs.next()) {
                String Id_Lector = rs.getString("Id_Lector");
                Busqueda_Id = (Id_Lector);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            Conexion.close(rs);
            Conexion.close(stmt);
            Conexion.close(conn);
        }
        return Busqueda_Id;
    }

    public String searchCC(String email) {
        String Busqueda_CC = null;
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        try {
            conn = Conexion.getConnection();
            String SQL_SEARCH = "SELECT CC FROM estudiante WHERE email = '" + email + "'";
            stmt = conn.prepareStatement(SQL_SEARCH);
            rs = stmt.executeQuery();
            if (rs.next()) {
                String CC = rs.getString("CC");
                Busqueda_CC = (CC);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            Conexion.close(rs);
            Conexion.close(stmt);
            Conexion.close(conn);
        }
        return Busqueda_CC;
    }

    public String searchDireccion(String email) {
        String Busqueda_Direccion = null;
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        try {
            conn = Conexion.getConnection();
            String SQL_SEARCH = "SELECT direccion FROM estudiante WHERE email = '" + email + "'";
            stmt = conn.prepareStatement(SQL_SEARCH);
            rs = stmt.executeQuery();
            if (rs.next()) {
                String Direccion = rs.getString("direccion");
                Busqueda_Direccion = (Direccion);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            Conexion.close(rs);
            Conexion.close(stmt);
            Conexion.close(conn);
        }
        return Busqueda_Direccion;
    }

    public String searchCarrera(String email) {
        String Busqueda_Carrera = null;
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        try {
            conn = Conexion.getConnection();
            String SQL_SEARCH = "SELECT carrera FROM estudiante WHERE email = '" + email + "'";
            stmt = conn.prepareStatement(SQL_SEARCH);
            rs = stmt.executeQuery();
            if (rs.next()) {
                String Carrera = rs.getString("carrera");
                Busqueda_Carrera = (Carrera);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            Conexion.close(rs);
            Conexion.close(stmt);
            Conexion.close(conn);
        }
        return Busqueda_Carrera;
    }

    public String searchFechaNac(String email) {
        String Busqueda_FechaNac = null;
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        try {
            conn = Conexion.getConnection();
            String SQL_SEARCH = "SELECT Fecha_Nac FROM estudiante WHERE email = '" + email + "'";
            stmt = conn.prepareStatement(SQL_SEARCH);
            rs = stmt.executeQuery();
            if (rs.next()) {
                String Fecha_Nac = rs.getString("Fecha_Nac");
                Busqueda_FechaNac = (Fecha_Nac);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            Conexion.close(rs);
            Conexion.close(stmt);
            Conexion.close(conn);
        }
        return Busqueda_FechaNac;
    }

    public String searchTelefono(String email) {
        String Busqueda_Telefono = null;
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        try {
            conn = Conexion.getConnection();
            String SQL_SEARCH = "SELECT telefono FROM estudiante WHERE email = '" + email + "'";
            stmt = conn.prepareStatement(SQL_SEARCH);
            rs = stmt.executeQuery();
            if (rs.next()) {
                String Telefono = rs.getString("telefono");
                Busqueda_Telefono = (Telefono);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            Conexion.close(rs);
            Conexion.close(stmt);
            Conexion.close(conn);
        }
        return Busqueda_Telefono;
    }

    public String searchNombre(String email) {
        String Busqueda_Nombre = null;
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        try {
            conn = Conexion.getConnection();
            String SQL_SEARCH = "SELECT nombre FROM estudiante WHERE email = '" + email + "'";
            stmt = conn.prepareStatement(SQL_SEARCH);
            rs = stmt.executeQuery();
            if (rs.next()) {
                String Nombre = rs.getString("nombre");
                Busqueda_Nombre = (Nombre);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            Conexion.close(rs);
            Conexion.close(stmt);
            Conexion.close(conn);
        }
        return Busqueda_Nombre;
    }

    public String searchApellido(String email) {
        String Busqueda_Apellido = null;
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        try {
            conn = Conexion.getConnection();
            String SQL_SEARCH = "SELECT apellido FROM estudiante WHERE email = '" + email + "'";
            stmt = conn.prepareStatement(SQL_SEARCH);
            rs = stmt.executeQuery();
            if (rs.next()) {
                String Apellido = rs.getString("apellido");
                Busqueda_Apellido = (Apellido);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            Conexion.close(rs);
            Conexion.close(stmt);
            Conexion.close(conn);
        }
        return Busqueda_Apellido;
    }

}
