
package lab3_melvinv_angelt;


public class Tiendas extends Locales{
    int tam;

    public Tiendas() {
    }

    public Tiendas(int tam) {
        this.tam = tam;
    }

    public Tiendas(int tam, String nombre, int piso, String hora) {
        super(nombre, piso, hora);
        this.tam = tam;
    }

    public int getTam() {
        return tam;
    }

    public void setTam(int tam) {
        if(tam<=18){
           this.tam = tam; 
        }
    }

    @Override
    public String toString() {
        return "Tiendas"+"\n" + "tam: " + tam + "\n";
    }
    
}
