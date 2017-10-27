
package lab3_melvinv_angelt;


public class Juguetes extends Productos{
    String tipo;

    public Juguetes() {
    }

    public Juguetes(String tipo) {
        this.tipo = tipo;
    }

    public Juguetes(String tipo, int precio, String descripcion, String marca, int descuento) {
        super(precio, descripcion, marca, descuento);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Juguetes{" + "tipo=" + tipo + '}';
    }
    
}
