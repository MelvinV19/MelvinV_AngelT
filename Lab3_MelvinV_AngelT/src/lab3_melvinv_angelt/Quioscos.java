
package lab3_melvinv_angelt;

import java.util.ArrayList;


public class Quioscos extends Locales{
    ArrayList<Productos>productoq =new ArrayList();
    String nombre;

    public Quioscos() {
    }

    public Quioscos(String nombre) {
        this.nombre = nombre;
    }

    public Quioscos(String nombre, int piso, String hora) {
        super(nombre, piso, hora);
        this.nombre = nombre;
    }
    

    public ArrayList<Productos> getProducto() {
        return productoq;
    }

    public void setProducto(ArrayList<Productos> lista) {
        this.productoq = productoq;
    }
    public void adicion(Productos producto){
        productoq.add(producto);
    }

    public ArrayList<Productos> getProductoq() {
        return productoq;
    }

    public void setProductoq(ArrayList<Productos> productoq) {
        this.productoq = productoq;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Quioscos"+"\n"+"nombre: "+nombre +"\n"+ "productos: " + lista + "\n";
    }
    
    
}
