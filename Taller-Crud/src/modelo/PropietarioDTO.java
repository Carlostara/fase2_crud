package modelo;

import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.SQLException;

public class PropietarioDTO extends Conexion {

    public boolean Guardardatos(Propietario pro) {

        PreparedStatement ps = null;
        Connection con = getconexion();

        String sql = "INSERT INTO propietario(nombres,apellidos, direccion,telefono, cedula,carta_propiedad)VALUES (?,?,?,?,?,?)";

        try {
            ps = con.prepareStatement(sql);           
            ps.setString(1, pro.getNombres());
            ps.setString(2, pro.getApellidos());
            ps.setString(3, pro.getDireccion());
            ps.setString(4, pro.getTelefono());
            ps.setInt(5, pro.getCedula());  
            ps.setBoolean(6, pro.isCarta_de_propiedad());
            ps.execute();
            return true;

        } catch (SQLException ex) {

            System.err.println(ex);
            return false;
        } finally {

            try {
                con.close();
            } catch (SQLException ex) {
                 System.err.println(ex);
            }

        }

    }
    public boolean modificar(Propietario pro) {
        PreparedStatement ps = null;
        Connection con = getconexion();

        String sql = "UPDATE propietario SET nombres=?,apellidos=?,direccion=?, telefono=?,cedula=?,carta_propiedad=? WHERE id_propietario=? ";

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, pro.getNombres());
            ps.setString(2, pro.getApellidos());
            ps.setString(3, pro.getDireccion());
            ps.setString(4, pro.getTelefono());
            ps.setInt(5, pro.getCedula());
            ps.setBoolean(6, pro.isCarta_de_propiedad());
            ps.setInt(6, pro.getId_propietario());
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
    
    public boolean eliminar(Propietario pro) {
        PreparedStatement ps = null;
        Connection con = getconexion();

        String sql = "DELETE FROM propietario WHERE id_propietario=? ";

        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, pro.getId_propietario());
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


