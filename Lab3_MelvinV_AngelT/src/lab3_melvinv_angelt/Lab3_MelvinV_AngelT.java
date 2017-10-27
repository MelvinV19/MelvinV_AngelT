
package lab3_melvinv_angelt;

import java.util.ArrayList;
import javax.swing.JOptionPane;


public class Lab3_MelvinV_AngelT {

   
    public static void main(String[] args) {
        
        
        
        ArrayList lista=new ArrayList();
        
        String opcion="";
        
        while (!opcion.equals("e")){
            opcion=JOptionPane.showInputDialog(""
                    + "a - Log in\n"
                    + "b - Registrarse in\n"
                    + "e - Salir\n"
                    
                    + "");
            
            if (opcion.equals("a"))
            {
                int p;
                p=Integer.parseInt(JOptionPane.showInputDialog("Ingrese opción: \n"+
                        "1 - Socio"+
                        "2 - Clientes"));
                
                if (p==1)
                {
                    JOptionPane.showInputDialog("Ingrese opción: \n"+
                        "1 - Locales"+
                        "2 - Personas");
                }
                
                if (p==2)
                {
                    
                }
                
                else{
                    JOptionPane.showMessageDialog(null,"Ingrese la opción correcta");
                }
            }
            
            if (opcion.equals("b"))
            {
                
            }
            
            
        }
        
    }
    
}
