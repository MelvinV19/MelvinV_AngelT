
package lab3_melvinv_angelt;

import java.util.ArrayList;


public class Quioscos extends Locales{
    ArrayList<Productos>productoq =new ArrayList();

    public Quioscos() {
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

    @Override
    public String toString() {
        return "Quioscos"+"\n" + "productos: " + lista + "\n";
    }
    
    
}
