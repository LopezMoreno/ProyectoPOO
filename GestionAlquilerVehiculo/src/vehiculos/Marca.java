/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vehiculos;

/**
 *
 * @author Usuario
 */
public class Marca {
     private String nombre;
    private Gama gama;

    public Marca(String nombre, Gama gama) {
        this.nombre = nombre;
        this.gama = gama;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setGama(Gama gama) {
        this.gama = gama;
    }

    
    
    
    
    
    
    public void registrarMarca() {
          //Inserta logica para calculo
    }

    
    public String getNombre() { return nombre; }
    public Gama getGama() { return gama; }
}
