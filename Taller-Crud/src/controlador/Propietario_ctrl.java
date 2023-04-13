package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import modelo.Propietario;
import modelo.PropietarioDTO;
import vista.Gestion_propietario;

public class Propietario_ctrl implements ActionListener {

    private final Propietario modelo_p;
    private final PropietarioDTO consultas_p;
    private final Gestion_propietario v_pro;

    public Propietario_ctrl(Propietario modelo_p, PropietarioDTO consultas_p, Gestion_propietario v_pro) {
        this.modelo_p = modelo_p;
        this.consultas_p = consultas_p;
        this.v_pro = v_pro;
        this.v_pro.btnGuardar.addActionListener(this);
        this.v_pro.btnActualizar.addActionListener(this);
        this.v_pro.btnEliminar.addActionListener(this);
        this.v_pro.btnLimpiar.addActionListener(this);
    }

    public void iniciavista() {

        v_pro.setTitle("propietarios");
        v_pro.setLocationRelativeTo(null);
        v_pro.txtId.setVisible(false);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == v_pro.btnGuardar) {
            modelo_p.setNombres(v_pro.txtNombres.getText());
            modelo_p.setApellidos(v_pro.txtApellidos.getText());
            modelo_p.setDireccion(v_pro.txtDireccion.getText());
            modelo_p.setTelefono(v_pro.txtTelefono.getText());
            modelo_p.setCedula(Integer.parseInt(v_pro.txtCedula.getText()));
            modelo_p.setCarta_de_propiedad(Boolean.parseBoolean(v_pro.txtCarta.getText()));
            if (consultas_p.Guardardatos(modelo_p)) {
                JOptionPane.showMessageDialog(null, "Registro Guardado");
                limpiar();
            } else {
                JOptionPane.showMessageDialog(null, "Error al Guardar");
                limpiar();
            }
        }

        if (e.getSource() == v_pro.btnActualizar) {
            modelo_p.setId_propietario(Integer.parseInt(v_pro.txtId.getText()));
            modelo_p.setNombres(v_pro.txtNombres.getText());
            modelo_p.setApellidos(v_pro.txtApellidos.getText());
            modelo_p.setDireccion(v_pro.txtDireccion.getText());
            modelo_p.setTelefono(v_pro.txtTelefono.getText());
            modelo_p.setCedula(Integer.parseInt(v_pro.txtCedula.getText()));
            

            if (consultas_p.modificar(modelo_p)) {
                JOptionPane.showMessageDialog(null, "Registro Modificado");
                limpiar();
            } else {
                JOptionPane.showMessageDialog(null, "Error al Modificar");
                limpiar();
            }
        }

        if (e.getSource() == v_pro.btnEliminar) {
            modelo_p.setId_propietario(Integer.parseInt(v_pro.txtId.getText()));

            if (consultas_p.eliminar(modelo_p)) {
                JOptionPane.showMessageDialog(null, "Registro Eliminado");
                limpiar();
            } else {
                JOptionPane.showMessageDialog(null, "Error al Eliminar");
                limpiar();
            }
        }

        if (e.getSource() == v_pro.btnLimpiar) {
            limpiar();
        }
    }

    public void limpiar() {
        v_pro.txtId.setText(null);
        v_pro.txtNombres.setText(null);
        v_pro.txtApellidos.setText(null);
        v_pro.txtDireccion.setText(null);
        v_pro.txtTelefono.setText(null);
        v_pro.txtCedula.setText(null);
    }
}


