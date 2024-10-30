/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persona;

/**
 *
 * @author Usuario
 */
public class Cliente extends Persona {
    private String tipoCliente;
    private boolean esPersonaJuridica;

    public Cliente(String nombre, String direccion, String telefono, String email) {
        super(nombre, direccion, telefono, email);
    }

    public String getTipoCliente() {
        return tipoCliente;
    }

    public void setTipoCliente(String tipoCliente) {
        this.tipoCliente = tipoCliente;
    }

    public boolean isEsPersonaJuridica() {
        return esPersonaJuridica;
    }

    public void setEsPersonaJuridica(boolean esPersonaJuridica) {
        this.esPersonaJuridica = esPersonaJuridica;
    }

        
    
    
    
    public void registrarCliente() {
        // Lógica para registrar cliente
    }

    public void actualizarDatosCliente() {
        // Lógica para actualizar datos de cliente
    }
}
    
