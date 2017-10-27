/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3_melvinv_angelt;


public class Ropa extends Productos{
    int talla;
    String sexo;

    public Ropa() {
    }

    public Ropa(int talla, String sexo) {
        this.talla = talla;
        this.sexo = sexo;
    }

    public Ropa(int talla, String sexo, int precio, String descripcion, String marca, int descuento) {
        super(precio, descripcion, marca, descuento);
        this.talla = talla;
        this.sexo = sexo;
    }

    public int getTalla() {
        return talla;
    }

    public void setTalla(int talla) {
        this.talla = talla;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return "Ropa" + "\n"+"talla: " + talla + "\n"+"sexo: " + sexo + "\n";
    }
    
}
