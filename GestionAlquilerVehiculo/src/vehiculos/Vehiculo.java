package vehiculos;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Usuario
 */
public class Vehiculo {
     private String modelo;
    private String matricula;
    private char disponibilidad;
    private Marca marca;
    private Tipo tipo;
    private Precio precio;

    public Vehiculo(String modelo, String matricula, char disponibilidad, Marca marca, Tipo tipo, Precio precio) {
        this.modelo = modelo;
        this.matricula = matricula;
        this.disponibilidad = disponibilidad;
        this.marca = marca;
        this.tipo = tipo;
        this.precio = precio;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setDisponibilidad(char disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    
    
    
    
    
    
    
    // Métodos
    public void agregarVehiculo(Vehiculo vehiculo) {
        // Lógica para agregar vehículo
    }

    public double obtenerPrecioPorDia() {
        return precio.calcularPrecioPorDia();
    }

    public double obtenerPrecioPorHora() {
        return precio.calcularPrecioPorHora();
    }

    public Precio getPrecio() {
        return precio;
    }

    public void setPrecio(Precio precio) {
        this.precio = precio;
    }


    
    
    
    
    public String getModelo() { return modelo; }
    public String getMatricula() { return matricula; }
    public char getDisponibilidad() { return disponibilidad; }
    public Marca getMarca() { return marca; }
    public Tipo getTipo() { return tipo; }
}
