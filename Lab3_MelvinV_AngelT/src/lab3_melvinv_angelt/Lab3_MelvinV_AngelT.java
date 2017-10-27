package lab3_melvinv_angelt;

import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Lab3_MelvinV_AngelT {

    public static void main(String[] args) {
<<<<<<< HEAD
        
        ArrayList lista=new ArrayList();

        Scanner input= new Scanner(System.in);
        
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
        
        String opcion="";
        while (!opcion.equals("e")){//Inicio while
            opcion=JOptionPane.showInputDialog(""
=======
        Localescomida l=new Localescomida();
        ArrayList lista = new ArrayList();

        Scanner input = new Scanner(System.in);
        String opcion = "";
        ArrayList<Persona> per = new ArrayList<Persona>();
        ArrayList<Locales> locales = new ArrayList<Locales>();
        ArrayList<Productos> producto = new ArrayList<Productos>();

        while (!opcion.equals("e")) {//Inicio while
            opcion = JOptionPane.showInputDialog(""
>>>>>>> ce6bd6d80362e722c4dbd8459dea93c902d279e9
                    + "a - Log in\n"
                    + "b - Registrarse in\n"
                    + "e - Salir\n"
                    + "");

            if (opcion.equals("a"))//Login
            {
<<<<<<< HEAD
                String login= "";
                while (!login.equals("d")){//while login
                    login=JOptionPane.showInputDialog(""
                    + "a - Socio\n"
                    + "b - Clientes in\n"
                    + "c - Empleados\n"
                    + "d - Regresar al menú principal\n"
                    + "");
                    
                    if (login.equals("a"))//Login socio
=======
                String op2 = "";
                while (!op2.equals("f")) {
                    op2 = JOptionPane.showInputDialog(""
                            + "a - Socio\n"
                            + "b - Clientes in\n"
                            + "c - Empleados\n"
                            + "d - mostar locales\n"
                            + "e - mostrar productos\n"
                            + "f-Volver al menu principal\n");

                    if (op2.equals("a"))//Login socio
>>>>>>> ce6bd6d80362e722c4dbd8459dea93c902d279e9
                    {
                        int socOpt = Integer.parseInt(JOptionPane.showInputDialog("Ingrese opción: \n"
                                + "1 - Agregar"
                                + "2 - Modificar"
                                + "3 - Eliminar"));

                        if (socOpt == 1)//Socios opción 1
                        {
                            int agregarSoc = Integer.parseInt(JOptionPane.showInputDialog(
                                    "Ingrese opción: \n"
                                    + "1 - Tiendas"
                                    + "2 - Productos"));

                            if (agregarSoc == 1)// agregar tiendas
                            {
                                //nombre, piso, lista empleados, horario, tipo,
                                System.out.println("Ingrese nombre del local: ");
                                String nombre = input.next();

                                System.out.println("Ingrese número de piso: ");
                                int piso = input.nextInt();

                                System.out.println("Ingrese el hora del local: ");
                                String hora = input.next();

                                System.out.println("1 - Tiendas");
                                System.out.println("2 - Quioscos");
                                System.out.println("3 - Local de comida");
                                System.out.println("Ingrese número del tipo de local a agregar");

                                int opcionAgregar = input.nextInt();

                                if (opcionAgregar == 1)//Agregar tiendas
                                {
                                    int a;
                                    System.out.println("Ingrese el tamaño de la tienda: ");
                                    a = input.nextInt();

                                    locales.add(new Tiendas(a, nombre, piso, hora));

                                }//fin Agregar tiendas

                                if (opcionAgregar == 2)//Agregar Kioskos
                                {
                                    int a;
                                    System.out.println("Ingrese posición de la tienda que desea hacer quiosco: ");
                                    a = input.nextInt();

                                    String nombreK = locales.get(a).getNombre();

                                    locales.add(new Quioscos(nombreK));

                                }//fin Agregar Kioskos

                                if (opcionAgregar == 3)//Agregar comida
                                {
                                    int a;
                                    System.out.println("Ingrese la cantidad de empleados: ");
                                    a = input.nextInt();
                                    char x = 's';
                                    do {
                                        System.out.println("Ingrese posicion de la comida que desea agregar al local ");
                                        int pos = input.nextInt();
                                        while (!(producto.get(pos) instanceof Comida)) {
                                            System.out.println("Este no es una comida,ingrese nueva posicion");
                                            pos = input.nextInt();
                                        }
                                        ((Localescomida)locales.get(locales.size())).adicion(producto.get(pos));
                                        System.out.println("Desea añadir otra comida s/n?");
                                        x = input.next().charAt(0);
                                    } while (x == 's' || x == 'S');
                                    locales.add(new Localescomida(a));

                                }//fin Agregar comida

                            }//fin agregar tiendas
                            else {
                                System.out.println("Ingrese precio del producto");
                                int precio = input.nextInt();
                                System.out.println("Ingrese descripcion del producto");
                                String descripcion = input.nextLine();
                                descripcion = input.nextLine();
                                System.out.println("Ingrese marca del producto");
                                String marca = input.next();
                                System.out.println("Ingrese cuanto descuento tiene el producto");
                                int descuento = input.nextInt();
                                System.out.println("1.Ropa");
                                System.out.println("2.juguetes");
                                System.out.println("3.comida");
                                System.out.println("Ingrese numero de posicion que desea agregar");
                                int pos = input.nextInt();
                                switch (pos) {
                                    case 1:
                                        System.out.println("Ingrese talla de la ropa");
                                        int talla = input.nextInt();
                                        System.out.println("Ingrese el genero de la ropa");
                                        String sexo = input.next();
                                        producto.add(new Ropa(talla, sexo));
                                        break;
                                    case 2:
                                        System.out.println("1. rompecabezas");
                                        System.out.println("2. carro");
                                        System.out.println("3. otro");
                                        System.out.println("Ingrese numero del tipo de juguete");
                                        int tip = input.nextInt();
                                        if (tip == 1) {
                                            String tipo = "rompecabezas";
                                            producto.add(new Juguetes(tipo));
                                        }
                                        if (tip == 2) {
                                            String tipo = "Carro";
                                            producto.add(new Juguetes(tipo));
                                        }
                                        if (tip == 3) {
                                            System.out.println("Ingrese como es el tipo de su juguete");
                                            String tipo = input.next();
                                            producto.add(new Juguetes(tipo));
                                        }

                                        break;
                                    case 3:
                                        System.out.println("Ingrese fecha de caducidad de la comida");
                                        String fecha = input.next();
                                        producto.add(new Comida(fecha));
                                        break;
                                }
                                //precio, descripcion, marca, descuento, tipo
                            }

                        }//Socios opción 1
                        if (socOpt == 2) {
                            int op;
                            System.out.println("1.modificar tienda");
                            System.out.println("2.modificar producto");
                            System.out.println("Ingrese numero que desea modificar");
                            op = input.nextInt();
                            switch (op) {
                                case 1:
                                    int pos;
                                    System.out.println("Ingrese posicion que desea modificar");
                                    pos = input.nextInt();
                                    locales.remove(pos);
                                    //nombre, piso, lista empleados, horario, tipo,
                                    System.out.println("Ingrese nombre del local: ");
                                    String nombre = input.next();

                                    System.out.println("Ingrese número de piso: ");
                                    int piso = input.nextInt();

                                    System.out.println("Ingrese el hora del local: ");
                                    String hora = input.next();

                                    System.out.println("1 - Tiendas");
                                    System.out.println("2 - Quioscos");
                                    System.out.println("3 - Local de comida");
                                    System.out.println("Ingrese número del tipo de local a agregar");

                                    int opcionAgregar = input.nextInt();

                                    if (opcionAgregar == 1)//Agregar tiendas
                                    {
                                        int a;
                                        System.out.println("Ingrese el tamaño de la tienda: ");
                                        a = input.nextInt();
                                        locales.add(pos, new Tiendas(a, nombre, piso, hora));

                                    }//fin Agregar tiendas

                                    if (opcionAgregar == 2)//Agregar Kioskos
                                    {
                                        int a;
                                        System.out.println("Ingrese posición de la tienda que desea hacer quiosco: ");
                                        a = input.nextInt();

                                        String nombreK = locales.get(a).getNombre();

                                        locales.add(pos, new Quioscos(nombreK));

                                    }//fin Agregar Kioskos

                                    if (opcionAgregar == 3)//Agregar comida
                                    {
                                        int a;
                                        System.out.println("Ingrese la cantidad de empleados: ");
                                        a = input.nextInt();

                                        locales.add(pos, new Localescomida(a));

                                    }//fin modificar tienda
                                    break;
                                case 2:
                                    int pos2;
                                    System.out.println("Ingrese posicion que desea modificar");
                                    pos2 = input.nextInt();
                                    producto.remove(pos2);
                                    System.out.println("Ingrese precio del producto");
                                    int precio = input.nextInt();
                                    System.out.println("Ingrese descripcion del producto");
                                    String descripcion = input.nextLine();
                                    descripcion = input.nextLine();
                                    System.out.println("Ingrese marca del producto");
                                    String marca = input.next();
                                    System.out.println("Ingrese cuanto descuento tiene el producto");
                                    int descuento = input.nextInt();
                                    System.out.println("1.Ropa");
                                    System.out.println("2.juguetes");
                                    System.out.println("3.comida");
                                    System.out.println("Ingrese numero de posicion que desea agregar");
                                    int posi = input.nextInt();
                                    switch (posi) {
                                        case 1:
                                            System.out.println("Ingrese talla de la ropa");
                                            int talla = input.nextInt();
                                            System.out.println("Ingrese el genero de la ropa");
                                            String sexo = input.next();
                                            producto.add(new Ropa(talla, sexo));
                                            break;
                                        case 2:
                                            System.out.println("1. rompecabezas");
                                            System.out.println("2. carro");
                                            System.out.println("3. otro");
                                            System.out.println("Ingrese numero del tipo de juguete");
                                            int tip = input.nextInt();
                                            if (tip == 1) {
                                                String tipo = "rompecabezas";
                                                producto.add(new Juguetes(tipo));
                                            }
                                            if (tip == 2) {
                                                String tipo = "Carro";
                                                producto.add(new Juguetes(tipo));
                                            }
                                            if (tip == 3) {
                                                System.out.println("Ingrese como es el tipo de su juguete");
                                                String tipo = input.next();
                                                producto.add(new Juguetes(tipo));
                                            }

                                            break;
                                        case 3:
                                            System.out.println("Ingrese fecha de caducidad de la comida");
                                            String fecha = input.next();
                                            producto.add(new Comida(fecha));
                                            break;
                                    }
                                //precio, descripcion, marca, descuento, tipo

                            }//fin modificar tienda

                        }
                        if (socOpt == 3) {
                            System.out.println("1.Eliminar tienda");
                            System.out.println("2.Eliminar producto");
                            System.out.println("Ingrese numero de lo que desea elminiar");
                            int num = input.nextInt();
                            switch (num) {
                                case 1:
                                    System.out.println("Ingrese la posicion de la tienda que desea elminar");
                                    int pos = input.nextInt();
                                    locales.remove(pos);
                                    break;
                                case 2:
                                    System.out.println("Ingrese la posicion de producto que desea eliminar");
                                    int pos2 = input.nextInt();
                                    producto.remove(pos2);
                                    break;

                            }

                        }

                    }// final login socio
<<<<<<< HEAD
                    
                
                
                
                
                
                }//fin while login
                
                }//fin opción login
                
=======
                    if (op2.equals("b")) {

                    }
                    if (op2.equals("c")) {

                    }
                    if (op2.equals("d")) {
                        System.out.println(locales);
                    }
                    if (op2.equals("e")) {
                        System.out.println(producto);
                    }

                }

            }
            if (opcion.equals("b")) {
                System.out.println("ingrese nombre de usuario");
                String usuario = input.next();
                System.out.println("Ingrese password");
                String password = input.next();
                System.out.println("Ingrese correo");
                String correo = input.next();
                System.out.println("Ingrese su nombre");
                String nombre = input.next();
                System.out.println("Ingrese su id");
                String id = input.next();
                System.out.println("Ingrese su fecha de naciemiento");
                String fecha = input.next();
                System.out.println("1.Cliente");
                System.out.println("2.Empleado");
                System.out.println("Ingrese numero de tipo de usuario");
                int tipo = input.nextInt();
                switch (tipo) {
                    case 1:
                        System.out.println("Ingrese cuanto dinero tiene");
                        int dinero = input.nextInt();
                        per.add(new Clientes(dinero));
                        break;
                    case 2:
                        System.out.println("Ingrese su hora de trabajo");
                        String hora = input.next();
                        System.out.println("Ingrese numeros que ha vendido");
                        int productos = input.nextInt();
                        per.add(new Empleados(hora, productos));
                        break;
                }

            }

>>>>>>> ce6bd6d80362e722c4dbd8459dea93c902d279e9
        }//fin while menu

    }//final main

}
