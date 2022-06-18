/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.UUID;
/**
 *
 * @author b
 */
public class Util {

    private static ArrayList<Socio> arraySocios = new ArrayList<>();
    private static ArrayList<Empleado> arrayEmpleados = new ArrayList<>();
    private static ArrayList<Actividad> arrayActividades = new ArrayList<>();   
    private static ArrayList<Actividad> arrayActividadModificada = new ArrayList<>();
    private static ArrayList<ServiciosAdicionales> arrayServicios_adicionales = new ArrayList<>();
    private static HashMap<String, Empleado> zonasLimpieza = new HashMap<String, Empleado>();
    private static HashMap<Empleado, String> turnosLimpieza = new HashMap<Empleado, String>();
    private static ArrayList<Monitor> arrayMonitores = new ArrayList<>();
    
    public static ArrayList<Actividad> getArrayActividadModificada(){
        return arrayActividadModificada;
    }
    
    public static void altaActividadModificada(Actividad actividad) {
        if (!arrayActividadModificada.contains(actividad)) {
            arrayActividadModificada.add(actividad);
        }
    }
    
    public static void asignarTurno(Empleado e, String turno) {
        turnosLimpieza.put(e, turno);
    }

    public static String getTurno(Empleado e) {
        return turnosLimpieza.get(e);
    }

    public static HashMap<String, Empleado> getZonasLimpieza() {
        return zonasLimpieza;
    }

    public static void asignarZonaLimpieza(String zona, Empleado limpiador) {
        zonasLimpieza.put(zona, limpiador);
    }

    public static Empleado verLimpiadorAsignado(String zona) {
        return zonasLimpieza.get(zona);
    }

    public static String verZonaAsignada(Empleado limpiador) {
        for (String zona : zonasLimpieza.keySet()) {
            Empleado aux = zonasLimpieza.get(zona);
            if (aux.equals(limpiador)) {
                return zona;
            }
        }
        return null;
    }

    public static Empleado buscarEmpleado(String usuario) {
        for (Empleado e : arrayEmpleados) {
            if (e.getUsuario().equals(usuario)) {
                return e;
            }
        }
        return null;
    }

    public static Empleado buscarEmpleado2(String nombre) {
        for (Empleado e : arrayEmpleados) {
            if (e.getNombre().equals(nombre)) {
                return e;
            }
        }
        return null;
    }

    public static Actividad buscarActividad(String nombre) {
        for (Actividad e : arrayActividades) {
            if (e.getNombre().equals(nombre)) {
                return e;
            }
        }
        return null;
    }
  
    public static ArrayList<Monitor> getInicializarMonitores(){
        for (int i = 0; i < arrayEmpleados.size(); i++) {
            if (arrayEmpleados.get(i).getTipoEmpleado().equals("Monitor")){
                arrayMonitores.add((Monitor) arrayEmpleados.get(i));
            }
        }
        return arrayMonitores;
    }
    
    public static ArrayList<Actividad> getArrayActividades() {
        return arrayActividades;
    }

    public static ArrayList<ServiciosAdicionales> getArrayServicios_adicionales() {
        return arrayServicios_adicionales;
    }

    public static ArrayList<Socio> getArraySocios() {
        return arraySocios;
    }

    public static ArrayList<Empleado> getArrayEmpleado() {
        return arrayEmpleados;
    }

    public static int inicioSesion(String usuario, String contrasena) {
        int numero = -2;

        for (int i = 0; i < arrayEmpleados.size(); i++) {
            if ((arrayEmpleados.get(i).getUsuario().equals(usuario)) && (arrayEmpleados.get(i).getContrasena().equals(contrasena))) {
                if (arrayEmpleados.get(i).getTipoEmpleado() == "Monitor") {
                    numero = 1;
                } else if (arrayEmpleados.get(i).getTipoEmpleado() == "Recepcionista") {
                    numero = 2;
                } else if (arrayEmpleados.get(i).getTipoEmpleado() == "Entrenador") {
                    numero = 3;
                } else if (arrayEmpleados.get(i).getTipoEmpleado() == "Limpiador") {
                    numero = 4;
                } else if (arrayEmpleados.get(i).getTipoEmpleado() == "Director") {
                    numero = -1;
                }
            }

        }
        for (int i = 0; i < arraySocios.size(); i++) {
            if ((arraySocios.get(i).getUsuario().equals(usuario)) && (arraySocios.get(i).getContrasena().equals(contrasena))) {
                numero = 5;
            }
        }

        return numero;
    }

    public static boolean altaEmpleado(Empleado empleado) {
        if (!arrayEmpleados.contains(empleado)) {
            arrayEmpleados.add(empleado);
            return true;
        } else {
            return false;
        }
    }

    public static boolean altaSocio(Socio socio) {
        if (!arraySocios.contains(socio)) {
            arraySocios.add(socio);
            return true;
        } else {
            return false;
        }
    }

    public static void bajaEmpleado(Empleado empleado) {
        if (arrayEmpleados.contains(empleado)) {
            arrayEmpleados.remove(empleado);
        }
    }

    public static void bajaActividad(Actividad actividad) {
        if (arrayActividades.contains(actividad)) {
            arrayActividades.remove(actividad);
        }
    }

    public static void registrar_Servicios_adicionales(ServiciosAdicionales servicios_adicionales) {
        arrayServicios_adicionales.add(servicios_adicionales);
    }

    public static void altaActividad(Actividad actividad) {
        if (!arrayActividades.contains(actividad)) {
            arrayActividades.add(actividad);
        }
    }

    public static Socio buscarSocioId(UUID id) {
        int longitud = arraySocios.size(); 
        for (int i = 0; i < longitud; i++) { 
            if (arraySocios.get(i).getId().equals(id)) { 
                return arraySocios.get(i);
            }
        }
        return null;
    }

    public static void bajaSocio(Socio socio) {
            arraySocios.remove(socio);

    }
}
