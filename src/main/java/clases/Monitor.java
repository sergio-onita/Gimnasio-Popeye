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
import java.util.ArrayList;
import java.util.Date;
import java.util.UUID;

public class Monitor extends Empleado{  
    
        private Actividad actividad;
        private double puntuaciones;
        
        public Monitor (String dni, String nombre, Date fecha_nacimiento, float salario, String telefono, UUID id, String tipo_empleado, String usuario, String contrasena, Actividad actividad, double puntuaciones){
                super(dni,nombre,fecha_nacimiento,salario,telefono,id,tipo_empleado,usuario,contrasena);
                this.actividad=actividad;
                this.puntuaciones=puntuaciones;
                
        }
        
        public Actividad getTipoActividad(){
            return actividad;
        }
        
        public double getPuntuaciones(){
            return puntuaciones;
        }
}
