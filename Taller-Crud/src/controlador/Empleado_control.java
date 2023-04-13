package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import modelo.Empleado;
import modelo.EmpleadoDTO;
import vista.Vista_empleado;

public class Empleado_control implements ActionListener {

    private Empleado modelo;
    private EmpleadoDTO consultas;
    private Vista_empleado vista;

    public Empleado_control(Empleado modelo, EmpleadoDTO consultas, Vista_empleado vista) {
        this.modelo = modelo;
        this.consultas = consultas;
        this.vista = vista;
        this.vista.btnGuardar.addActionListener(this);
        this.vista.btnModificar.addActionListener(this);
        this.vista.btnEliminar.addActionListener(this);
        this.vista.btnLimpiar.addActionListener(this);
    }

    

    public void iniciavista() {

        vista.setTitle("empleados");
        vista.setLocationRelativeTo(null);
        vista.txtId.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == vista.btnGuardar) {
            
            
            modelo.setNombres(vista.txtNombres.getText());
            modelo.setApellidos(vista.txtApellidos.getText());
            modelo.setCedula(Integer.parseInt(vista.txtCedula.getText()));

            if (consultas.registrar(modelo)) {
                JOptionPane.showMessageDialog(null, "Registro Guardado");
                limpiar();
            } else {
                JOptionPane.showMessageDialog(null, "Error al Guardar");
                limpiar();
            }
        }

        if (e.getSource() == vista.btnModificar) {
            modelo.setId_empleado(Integer.parseInt(vista.txtId.getText()));
            
            modelo.setNombres(vista.txtNombres.getText());
            modelo.setApellidos(vista.txtApellidos.getText());
            modelo.setCedula(Integer.parseInt(vista.txtCedula.getText()));

            if (consultas.modificar(modelo)) {
                JOptionPane.showMessageDialog(null, "Registro Modificado");
                limpiar();
            } else {
                JOptionPane.showMessageDialog(null, "Error al Modificar");
                limpiar();
            }
        }

        if (e.getSource() == vista.btnEliminar) {
            modelo.setId_empleado(Integer.parseInt(vista.txtId.getText()));

            if (consultas.eliminar(modelo)) {
                JOptionPane.showMessageDialog(null, "Registro Eliminado");
                limpiar();
            } else {
                JOptionPane.showMessageDialog(null, "Error al Eliminar");
                limpiar();
            }
        }

        if (e.getSource() == vista.btnLimpiar) {
            limpiar();
        }
    }

    public void limpiar() {
        vista.txtId.setText(null);
        
        vista.txtNombres.setText(null);
        vista.txtApellidos.setText(null);
        vista.txtCedula.setText(null);
    }
}