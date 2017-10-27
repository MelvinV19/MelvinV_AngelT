
package lab3_melvinv_angelt;


public class Comida extends Productos{
    String fecha;

    public Comida() {
    }

    public Comida(String fecha) {
        this.fecha = fecha;
    }

    public Comida(String fecha, int precio, String descripcion, String marca, int descuento) {
        super(precio, descripcion, marca, descuento);
        this.fecha = fecha;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Comida"+"\n" + "fecha=" + fecha + "\n";
    }
    
    
}
