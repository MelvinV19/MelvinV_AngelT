
package lab3_melvinv_angelt;

import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;


public class Lab3_MelvinV_AngelT {

   
    public static void main(String[] args) {
        
        ArrayList lista=new ArrayList();

        Scanner input= new Scanner(System.in);
        String opcion="";
        String usuario="admin";
        String password="Pass1234";
        String emailAdmin="socio01@email.com";
        String id="0001";
        String fecha="27/10/2017";
        
        ArrayList <Persona> per= new ArrayList<Persona>();
        ArrayList <Locales> locales= new ArrayList<Locales>();
        ArrayList <Productos> producto= new ArrayList<Productos>();
        
        //default socio
        //per.add(new Persona(usuario,password,emailAdmin,id,fecha));
        
        while (!opcion.equals("e")){
            opcion=JOptionPane.showInputDialog(""
                    + "a - Log in\n"
                    + "b - Registrarse in\n"
                    + "e - Salir\n"
                    + "");
            
            if (login.equals("a"))//Login
            {
                
                while (!login.equals("e")){
                    opcion=JOptionPane.showInputDialog(""
                    + "a - Log in\n"
                    + "b - Registrarse in\n"
                    + "e - Salir\n"
                    + "");
                
                
                
                
                
                
                
                int p;
                p=Integer.parseInt(JOptionPane.showInputDialog("Ingrese opción: \n"+
                        "1 - Socio"+
                        "2 - Clientes"+
                        "3 - Empleados"));
                
                if (p==1)//socio
                {
                    int socOpt = Integer.parseInt(JOptionPane.showInputDialog("Ingrese opción: \n"+
                        "1 - Agregar"+
                        "2 - Modificar"+
                        "3 - Eliminar"));
                    
                    if (socOpt==1)//Socios opción 1
                    {
                        int agregarSoc = Integer.parseInt(JOptionPane.showInputDialog(
                        "Ingrese opción: \n"+
                        "1 - Tiendas"+
                        "2 - Productos"));
                        
                        if(agregarSoc==1)// agregar tiendas
                        {
                            //nombre, piso, lista empleados, horario, tipo,
                            System.out.println("Ingrese nombre del local: ");
                            String nombre = input.nextLine();
                            nombre = input.nextLine();
                            
                            System.out.println("Ingrese número de piso: ");
                            int piso = input.nextInt();
                            
                            System.out.println("Ingrese el hora del local: ");
                            String hora = input.next();
                            
                            System.out.println("1 - Tiendas");
                            System.out.println("2 - Quioscos");
                            System.out.println("3 - Local de comida");
                            System.out.println("Ingrese número del tipo de local a agregar");
                            
                            int opcionAgregar = input.nextInt();
                            
                            if ( opcionAgregar ==1)//Agregar tiendas
                            {
                                int a;
                                System.out.println("Ingrese el tamaño de la tienda: ");
                                a = input.nextInt();
                                
                                locales.add(new Tiendas(a,nombre,piso,hora));
                                System.out.println(locales);
                            }//fin Agregar tiendas
                            
                            if ( opcionAgregar ==2)//Agregar Kioskos
                            {
                                int a;
                                System.out.println("Ingrese posición de la tienda que desea hacer quiosco: ");
                                a = input.nextInt();
                                
                                String nombreK = locales.get(a).getNombre();
                                
                                locales.add(new Quioscos(nombreK));
                                
                                
                            }//fin Agregar Kioskos
                            
                            if ( opcionAgregar ==3)//Agregar comida
                            {
                                int a;
                                System.out.println("Ingrese la cantidad de empleados: ");
                                a = input.nextInt();
                                
                                locales.add(new Localescomida(a));
                            }//fin Agregar comida
                            
                            
                            
                            
                        }//fin agregar tiendas
                            
                            
                        else 
                        {
                            //precio, descripcion, marca, descuento, tipo
                        }
                            
                        
                        
                    }
                                        
                    
                }
                
                if (p==2)//cliente
                {
                    
                }
                
                if (p==3)//empleado
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
