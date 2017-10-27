
package lab3_melvinv_angelt;


public class Localescomida extends Locales{
    int numempleados;

    public Localescomida() {
    }

    public Localescomida(int numempleados) {
        this.numempleados = numempleados;
    }

    public Localescomida(int numempleados, String nombre, int piso, String hora) {
        super(nombre, piso, hora);
        this.numempleados = numempleados;
    }
    
    
    
}
