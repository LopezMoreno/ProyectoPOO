/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vehiculos;

/**
 *
 * @author Usuario
 */
public class Tipo {
    private String nombre;

    public Tipo(String nombre) {
        this.nombre = nombre;
    }

    public void registrarTipo() {
        // Insertar metodo de registro 
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

        
    
    @Override
    public String toString() {
        return "Tipo{" + "nombre=" + nombre + '}';
    }

    
    
    public String getNombre() { return nombre; }
}

