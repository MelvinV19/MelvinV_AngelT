
package lab3_melvinv_angelt;


public class Empleados extends Persona {
    String hora;
    int productos;

    public Empleados() {
    }
    
    public Empleados(String hora, int productos) {
        this.hora = hora;
        this.productos = productos;
    }

    public Empleados(String hora, int productos, String usuario, String password, String correo, String nombre, String id, String fecha) {
        super(usuario, password, correo, nombre, id, fecha);
        this.hora = hora;
        this.productos = productos;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public int getProductos() {
        return productos;
    }

    public void setProductos(int productos) {
        this.productos = productos;
    }

    @Override
    public String toString() {
        return "Empleados{" + "hora=" + hora + ", productos=" + productos + '}';
    }
    
}
