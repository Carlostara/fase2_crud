package modelo;

import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.SQLException;



public class EmpleadoDTO extends Conexion {
    
   public boolean registrar(Empleado emp) {
        PreparedStatement ps = null;
        Connection con = getconexion();

        String sql = "INSERT INTO empleado (  nombres, apellidos , cedula) VALUES(?,?,?)";

        try {
            ps = con.prepareStatement(sql);
            
           
            ps.setString(1, emp.getNombres());
            ps.setString(2, emp.getApellidos());
            ps.setInt(3, emp.getCedula());
            ps.execute();
            return true;
        } catch (SQLException e) {
            System.err.println(e);
            return false;
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                System.err.println(e);
            }
        }
    }
     public boolean modificar(Empleado emp) {
        PreparedStatement ps = null;
        Connection con = getconexion();

        String sql = "UPDATE empleado SET nombres=?, apellidos=?, cedula=? WHERE id_empleado=? ";

        try {
            ps = con.prepareStatement(sql);
            
            ps.setString(1, emp.getNombres());
            ps.setString(2, emp.getApellidos());
            ps.setInt(3, emp.getCedula());
            ps.setInt(4, emp.getId_empleado());
            ps.execute();
            return true;
        } catch (SQLException e) {
            System.err.println(e);
            return false;
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                System.err.println(e);
            }
        }
    }
    
    public boolean eliminar(Empleado emp) {
        PreparedStatement ps = null;
        Connection con = getconexion();

        String sql = "DELETE FROM empleado WHERE id=? ";

        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, emp.getId_empleado());
            ps.execute();
            return true;
        } catch (SQLException e) {
            System.err.println(e);
            return false;
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                System.err.println(e);
            }
        }
    }

    
    
}
    

