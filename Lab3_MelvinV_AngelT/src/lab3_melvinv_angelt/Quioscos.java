
package lab3_melvinv_angelt;

import java.util.ArrayList;


public class Quioscos extends Locales{
    Tiendas t= new Tiendas();

    public Tiendas getT() {
        return t;
    }

    public void setT(Tiendas t) {
        this.t = t;
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
    
}
