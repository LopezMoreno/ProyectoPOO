/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package alquiler;

import java.util.ArrayList;
import java.util.List;
import persona.Cliente;

public class HistorialAlquileres {
    
     private List<Alquiler> alquileres = new ArrayList<>();

    public void registrarAlquileres(Alquiler alquiler) {
        alquileres.add(alquiler);
    }

    public List<Alquiler> consultarAlquileres(Cliente cliente) {
        // Lógica para consultar alquileres
        return null;
    }

    public Alquiler buscarPorId(String idAlquiler) {
        for (Alquiler alquiler : alquileres) {
            if (alquiler.getIdAlquiler().equals(idAlquiler)) {
                return alquiler;
            }
        }
        return null;
    }
    
    
}
