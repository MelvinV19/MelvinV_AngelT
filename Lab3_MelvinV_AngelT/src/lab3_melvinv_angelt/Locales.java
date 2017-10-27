
package lab3_melvinv_angelt;

import java.util.ArrayList;


public class Locales {
    String nombre;
    int piso;
    ArrayList<Empleados> lista=new ArrayList();
    ArrayList<Productos> lista2=new ArrayList();
    String hora;

    public Locales() {
    }

    public Locales(String nombre, int piso, String hora) {
        this.nombre = nombre;
        this.piso = piso;
        this.hora = hora;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPiso() {
        return piso;
    }

    public void setPiso(int piso) {
        this.piso = piso;
    }

    public ArrayList<Empleados> getLista() {
        return lista;
    }

    public void setLista(ArrayList<Empleados> lista) {
        this.lista = lista;
    }

    public ArrayList<Productos> getLista2() {
        return lista2;
    }

    public void setLista2(ArrayList<Productos> lista2) {
        this.lista2 = lista2;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    @Override
    public String toString() {
        return "Locales{" + "nombre=" + nombre + ", piso=" + piso + ", lista=" + lista + ", lista2=" + lista2 + ", hora=" + hora + '}';
    }
    
}
