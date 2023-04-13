
package main;



import controlador.Empleado_control;
import controlador.Propietario_ctrl;
import modelo.Empleado;
import modelo.EmpleadoDTO;

import modelo.Propietario;
import modelo.PropietarioDTO;
import vista.Gestion_propietario;
import vista.Vista_empleado;




public class Fase2 {

    
    public static void main(String[] args) {
        
        
      
      Propietario modelo_p = new Propietario();
      PropietarioDTO consultas_p = new PropietarioDTO();
      Gestion_propietario v_pro = new Gestion_propietario();
      
      Propietario_ctrl ctrl= new Propietario_ctrl(modelo_p,consultas_p,v_pro);
      ctrl.iniciavista();
      v_pro.setVisible(true);
      
    
   
        
   
      
      
    }
    
}
