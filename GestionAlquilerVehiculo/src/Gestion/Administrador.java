/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Gestion;

import persona.Persona;

/**
 *
 * @author Usuario
 */
public class Administrador extends Persona {
    private String idAdministrador;
    private String nivelAcceso;
    private boolean puedeGestionarVehiculos;
    private boolean puedeGestionarClientes;
    private boolean puedeGestionarAlquileres;

    public Administrador(String nombre, String direccion, String telefono, String email) {
        super(nombre, direccion, telefono, email);
    }

    public String getIdAdministrador() {
        return idAdministrador;
    }

    public void setIdAdministrador(String idAdministrador) {
        this.idAdministrador = idAdministrador;
    }

    public String getNivelAcceso() {
        return nivelAcceso;
    }

    public void setNivelAcceso(String nivelAcceso) {
        this.nivelAcceso = nivelAcceso;
    }

    public boolean isPuedeGestionarVehiculos() {
        return puedeGestionarVehiculos;
    }

    public void setPuedeGestionarVehiculos(boolean puedeGestionarVehiculos) {
        this.puedeGestionarVehiculos = puedeGestionarVehiculos;
    }

    public boolean isPuedeGestionarClientes() {
        return puedeGestionarClientes;
    }

    public void setPuedeGestionarClientes(boolean puedeGestionarClientes) {
        this.puedeGestionarClientes = puedeGestionarClientes;
    }

    public boolean isPuedeGestionarAlquileres() {
        return puedeGestionarAlquileres;
    }

    public void setPuedeGestionarAlquileres(boolean puedeGestionarAlquileres) {
        this.puedeGestionarAlquileres = puedeGestionarAlquileres;
    }

    
    
    
    
    
    
    public void gestionarVehiculos() {
     //Inserta logica para calculo
    }

    public void gestionarClientes() {
        //Inserta logica para calculo
    }

    public void gestionarAlquileres() {
        // Lógica para gestionar alquileres
    }

    private void actualizarDatosAdministrador() {
         //Inserta logica para calculo
    }

    public boolean validarAcceso(String operacion) {
         //Inserta logica para calculo
        return false;
    }
    
    
    
    
}
