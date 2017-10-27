
package lab3_melvinv_angelt;

import java.util.ArrayList;


public class Clientes extends Persona{
    ArrayList<Productos> lista=new ArrayList();
    int dinero;

    public Clientes() {
    }

    public Clientes(int dinero) {
        this.dinero = dinero;
    }

    public Clientes(int dinero, String usuario, String password, String correo, String nombre, String id, String fecha) {
        super(usuario, password, correo, nombre, id, fecha);
        this.dinero = dinero;
    }

    public ArrayList<Productos> getLista() {
        return lista;
    }

    public void setLista(ArrayList<Productos> lista) {
        this.lista = lista;
    }

    public int getDinero() {
        return dinero;
    }

    public void setDinero(int dinero) {
        this.dinero = dinero;
    }

    @Override
    public String toString() {
        return "Clientes " + "\n"+"comprados: " + lista + "dinero: " + dinero + "\n";
    }
    
}
