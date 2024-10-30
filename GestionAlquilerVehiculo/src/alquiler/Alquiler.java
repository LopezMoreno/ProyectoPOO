/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package alquiler;

import vehiculos.Vehiculo;
import persona.Cliente;
public class Alquiler {
     private String idAlquiler;
    private String fechaInicio;
    private String fechaFin;
    private double costo;
    private Vehiculo vehiculo;
    private Cliente cliente;
    private String fuente;

    public Alquiler(String idAlquiler, String fechaInicio, String fechaFin, double costo, Vehiculo vehiculo, Cliente cliente, String fuente) {
        this.idAlquiler = idAlquiler;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.costo = costo;
        this.vehiculo = vehiculo;
        this.cliente = cliente;
        this.fuente = fuente;
    }

    
    
    public String getIdAlquiler() {
        return idAlquiler;
    }

    public void setIdAlquiler(String idAlquiler) {
        this.idAlquiler = idAlquiler;
    }

    public String getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public String getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(String fechaFin) {
        this.fechaFin = fechaFin;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public String getFuente() {
        return fuente;
    }

    public void setFuente(String fuente) {
        this.fuente = fuente;
    }

    
    
    
    
    
    // Métodos
    public void registrarAlquiler() { 
    //Inserta logica para calculo
    }
    public void finalizarAlquiler() { 
    //Inserta logica para calculo
    }
    public void calcularCosto() { 
    //Inserta logica para calculo   
    }
}

