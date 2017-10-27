
package lab3_melvinv_angelt;

import java.util.ArrayList;


public class Localescomida extends Locales{
    int numempleados;
    ArrayList<Comida>comida=new ArrayList();
    public Localescomida() {
    }

    public Localescomida(int numempleados) {
        this.numempleados = numempleados;
    }

    public Localescomida(int numempleados, String nombre, int piso, String hora) {
        super(nombre, piso, hora);
        if(numempleados<=1){
            this.numempleados = numempleados;
        }    
    }

    public int getNumempleados() {
        return numempleados;
    }

    public void setNumempleados(int numempleados) {
        if(numempleados<=1){
            this.numempleados = numempleados;
        }    
    }

    public ArrayList<Comida> getComida() {
        return comida;
    }

    public void setComida(ArrayList<Comida> comida) {
        this.comida = comida;
    }
    public void adicion(Comida comida){
        this.comida.add(comida);
    }

    @Override
    public String toString() {
        return "Localescomida" +"\n"+ "numero de empleados: " + numempleados + "\n";
    }
    
    
}
