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
import java.util.Date;
import java.util.UUID;



public class Entrenador extends Empleado{
    private int n_horas_reservadas;
    private int n_horas_libres;

    public Entrenador(String dni, String nombre, Date fecha_nacimiento, float salario, String telefono, UUID id, String tipo_empleado, String usuario, String contrasena, int n_horas_reservadas, int n_horas_libres) {
        super(dni, nombre, fecha_nacimiento, salario, telefono, id, tipo_empleado,usuario, contrasena);
        this.n_horas_reservadas=n_horas_libres;
        this.n_horas_libres=n_horas_libres;    
        
    }
}
