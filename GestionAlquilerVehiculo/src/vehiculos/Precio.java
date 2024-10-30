/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vehiculos;



public class Precio {
    

    private double precioBasePorHora;
    private double precioBasePorDia;
    private Marca marca;

    public Precio(double precioBasePorHora, double precioBasePorDia, Marca marca) {
        this.precioBasePorHora = precioBasePorHora;
        this.precioBasePorDia = precioBasePorDia;
        this.marca = marca;
    }

    // Calcular precio por hora
    public double calcularPrecioPorHora() {
        
        //Inserta logica para calculo
        return precioBasePorHora;
    }

    // Calcular precio por día
    public double calcularPrecioPorDia() {
           //Inserta logica para calculo
        return precioBasePorDia;
    }

    public double getPrecioBasePorHora() {
        //Inserta logica para calculo
        return precioBasePorHora;
    }

    public void setPrecioBasePorHora(double precioBasePorHora) {
        //Inserta logica para calculo
        this.precioBasePorHora = precioBasePorHora;
    }

    public double getPrecioBasePorDia() {
        
        return precioBasePorDia;
    }

    public void setPrecioBasePorDia(double precioBasePorDia) {
        this.precioBasePorDia = precioBasePorDia;
    }

    
    
    @Override
    public String toString() {
        return "Precio{" + "precioBasePorHora=" + precioBasePorHora + ", precioBasePorDia=" + precioBasePorDia + ", marca=" + marca + '}';
    }

    
    
    public void actualizarPrecioBase(double nuevoPrecioHora, double nuevoPrecioDia) {
        this.precioBasePorHora = nuevoPrecioHora;
        this.precioBasePorDia = nuevoPrecioDia;
    }
}
    

