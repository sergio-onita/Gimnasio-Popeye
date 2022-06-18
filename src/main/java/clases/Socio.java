/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author User
 */
import java.util.UUID;

public class Socio {
    
    private String nombre;
    private String telefono;
    private String mail;
    private String n_cuenta_bancaria;
    private UUID id;
    private boolean alta;
    private String usuario;
    private String contrasena;
    private Empleado entrenador;
    
    public Socio (String usuario, String contrasena, String nombre, String telefono, String mail, String n_cuenta_bancaria, UUID id) {
        this.usuario=usuario;
        this.contrasena=contrasena;
        this.nombre=nombre;
        this.telefono=telefono;
        this.mail=mail;
        this.n_cuenta_bancaria=n_cuenta_bancaria;
        this.id=id;
        this.alta = true;
        this.entrenador=null;
    }

    public Socio() {
    }

    public String getNombre() {
        return nombre;
    }
    

    public String getMail() {
        return mail;
    }

    public Empleado getEntrenador() {
        return entrenador;
    }

    public void setEntrenador(Empleado entrenador) {
        this.entrenador = entrenador;
    }

    
    public void darAlta(){
        this.alta = true;
    }
    
    public void darBaja(){
        this.alta = false;
    }
    public String getUsuario(){
        return usuario;
    }

    public String getContrasena(){
        return contrasena;
    }
    
    public UUID getId(){
        return id;
    }
    
    public String getTelefono() {
        return telefono;
    }    
    public String getCuenta() {
        return n_cuenta_bancaria;
    }
    public String toString(){
        return this.usuario + "," + this.contrasena + "," + this.nombre + "," + this.telefono + "," + this.mail + "," + this.n_cuenta_bancaria + "," + this.id;
    }
}
