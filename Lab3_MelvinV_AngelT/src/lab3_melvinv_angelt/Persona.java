
package lab3_melvinv_angelt;


public class Persona {
    String usuario;
    String password;
    String correo;
    String nombre;
    String id;
    String fecha;

    public Persona() {
    }

    public Persona(String usuario, String password, String correo, String nombre, String id, String fecha) {
        this.usuario = usuario;
        this.password = password;
        this.correo = correo;
        this.nombre = nombre;
        this.id = id;
        this.fecha = fecha;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Persona"+"\n" + "usuario: " + usuario +"\n"+ "password: " + password +"\n" +"correo: " + correo +"\n"+ "nombre: " + nombre +"\n" +"id: " + id + "\n"+"fecha: " + fecha + "\n";
    }
    
}
