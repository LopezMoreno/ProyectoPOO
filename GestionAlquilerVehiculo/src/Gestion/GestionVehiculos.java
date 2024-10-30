/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Gestion;

import vehiculos.Vehiculo;
import vehiculos.Marca;
import vehiculos.Tipo;

import java.util.ArrayList;
import java.util.List;

public class GestionVehiculos {
    private List<Vehiculo> vehiculos = new ArrayList<>();


     public void agregarVehiculo(Vehiculo vehiculo) {
        vehiculos.add(vehiculo);
    }

    // Eliminar un vehículo
    public void eliminarVehiculo(Vehiculo vehiculo) {
        if (vehiculo.getDisponibilidad() == 'D') {
            vehiculos.remove(vehiculo);
        }
    }

    // Obtener todos los vehículos
    public List<Vehiculo> obtenerTodosLosVehiculos() {
        return vehiculos;
    }

    // Filtrar vehículos por marca
    public List<Vehiculo> obtenerVehiculosPorMarca(Marca marca) {
        List<Vehiculo> resultado = new ArrayList<>();
        for (Vehiculo vehiculo : vehiculos) {
            if (vehiculo.getMarca().equals(marca)) {
                resultado.add(vehiculo);
            }
        }
        return resultado;
    }

    // Filtrar vehículos por tipo
    public List<Vehiculo> obtenerVehiculosPorTipo(Tipo tipo) {
        List<Vehiculo> resultado = new ArrayList<>();
        for (Vehiculo vehiculo : vehiculos) {
            if (vehiculo.getTipo().equals(tipo)) {
                resultado.add(vehiculo);
            }
        }
        return resultado;
    }
}
     
   