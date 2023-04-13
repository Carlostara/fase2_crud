
package controlador;



import vista.Login;






public class Controlador {
   
    private Login login;
    
    
    //constructor

    
    public Controlador(Login login){
    
         this.login = login;
    
    }

    public void iniciar() {
        login.setTitle("iniciar");
        login.setLocationRelativeTo(null);
        login.setVisible(true);
    }

 
    
}
