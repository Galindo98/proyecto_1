/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Agenda_contactos;

/**
 *
 * @author Jose Galindo
 */
public class persona {
    String nombre;
    String numero;
    String correo;
    persona(String nombre,String numero,String correo){
        this.nombre=nombre;
        this.numero=numero;
        this.correo=correo;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }
    
}
