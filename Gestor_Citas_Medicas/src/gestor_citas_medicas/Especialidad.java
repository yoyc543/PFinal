/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package citasreserva;

/**
 *
 * @author PC01
 */
public class Especialidad {
    int idEspecialidad;
    String NombreEspecialidad;

    public Especialidad() {
    }

    public Especialidad(int idEspecialidad, String NombreEspecialidad) {
        this.idEspecialidad = idEspecialidad;
        this.NombreEspecialidad = NombreEspecialidad;
    }

    
    
    
    
    
    public int getIdEspecialidad() {
        return idEspecialidad;
    }

    public void setIdEspecialidad(int idEspecialidad) {
        this.idEspecialidad = idEspecialidad;
    }

    public String getNombreEspecialidad() {
        return NombreEspecialidad;
    }

    public void setNombreEspecialidad(String NombreEspecialidad) {
        this.NombreEspecialidad = NombreEspecialidad;
    }

    @Override
    public String toString() {
        return  "Especialidad: " + idEspecialidad + ", NombreEspecialidad: " +'\n' + NombreEspecialidad;
    }
    
    
    
}
