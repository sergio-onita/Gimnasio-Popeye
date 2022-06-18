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

public class Actividad {

    private UUID id;
    private String nombre;
    private String horario;
    private int aforo_max;
    private String sala;

    public Actividad(UUID id, String nombre, String horario, String sala) {
        this.id = id;
        this.nombre = nombre;
        this.horario = horario;
        this.sala = sala;
        setAforo_max();

    }

    public void setAforo_max() {
        switch (this.sala) {
            case "sala_fuerza":
                this.aforo_max = 25;
                break;
            case "sala_fitness":
                this.aforo_max = 15;
                break;
            case "sala_piscina":
                this.aforo_max = 50;
                break;
            case "sala_zumba":
                this.aforo_max = 20;
                break;
            case "sala_cardio":
                this.aforo_max = 20;
                break;
            default:
                break;
        }
    }

    public UUID getId() {
        return id;
    }

    
    public String getNombre() {
        return nombre;
    }

    public String getHorario() {
        return horario;
    }

    public String getSala() {
        return sala;
    }

    public int getAforo_max() {
        return aforo_max;
    }
}
