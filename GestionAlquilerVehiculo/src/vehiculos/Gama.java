/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vehiculos;

/**
 *
 * @author Usuario
 */
public class Gama {
     private String nombre;
    private double coeficientePrecio;

    public Gama(String nombre, double coeficientePrecio) {
        this.nombre = nombre;
        this.coeficientePrecio = coeficientePrecio;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCoeficientePrecio(double coeficientePrecio) {
        this.coeficientePrecio = coeficientePrecio;
    }

    @Override
    public String toString() {
        return "Gama{" + "nombre=" + nombre + ", coeficientePrecio=" + coeficientePrecio + '}';
    }

   
    
    
    public String getNombre() { return nombre; }
    public double getCoeficientePrecio() { return coeficientePrecio; }
}
