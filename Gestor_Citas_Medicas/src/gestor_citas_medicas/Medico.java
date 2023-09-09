/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package citasreserva;

/**
 *
 * @author PC01
 */
public class Medico {
    private int idMedico;
    private Especialidad idEspecialidad; 
    private String Cedula;
    private String Nombre;
    private String Apellido;
    private int DNI;
    private String Sexo;
    private int Celular;
    private String Direccion;

    public Medico() {
    }

    public Medico(int idMedico, Especialidad idEspecialidad, String Cedula, String Nombre, String Apellido, int DNI, String Sexo, int Celular, String Direccion) {
        this.idMedico = idMedico;
        this.idEspecialidad = idEspecialidad;
        this.Cedula = Cedula;
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.DNI = DNI;
        this.Sexo = Sexo;
        this.Celular = Celular;
        this.Direccion = Direccion;
    }

    public int getIdMedico() {
        return idMedico;
    }

    public void setIdMedico(int idMedico) {
        this.idMedico = idMedico;
    }

    public Especialidad getIdEspecialidad() {
        return idEspecialidad;
    }

    public void setIdEspecialidad(Especialidad idEspecialidad) {
        this.idEspecialidad = idEspecialidad;
    }

    public String getCedula() {
        return Cedula;
    }

    public void setCedula(String Cedula) {
        this.Cedula = Cedula;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public int getDNI() {
        return DNI;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    public String getSexo() {
        return Sexo;
    }

    public void setSexo(String Sexo) {
        this.Sexo = Sexo;
    }

    public int getCelular() {
        return Celular;
    }

    public void setCelular(int Celular) {
        this.Celular = Celular;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    @Override
    public String toString() {
        return "Nombre y Apellido: " + Nombre +"  "+ Apellido +'\n'+ "Especialidad: " + 
                idEspecialidad.NombreEspecialidad +'\n'+ "Cedula: " + Cedula +'\n' 
                +  "DNI: " + DNI +'\n' + "Sexo: " + Sexo +'\n' + "Celular: " 
                + Celular +'\n'+ "Direccion: " + Direccion;
//    return  "Nombre: "+Nombre + "Apellido: "+ Apellido+ "Especialidad: " + idEspecialidad.NombreEspecialidad + "Cedula: " Cedula+ "DNI: " +DNI + " Sexo: " + Sexo + " Celular: " + Celular + " Direccion: " + Direccion;
//    return  "idMedico: " + idMedico + ", idEspecialidad: " + idEspecialidad.NombreEspecialidad +'\n'+ ", Cedula: " + Cedula + ", Nombre: " + Nombre + ", Apellido: " + Apellido +'\n'+ ", DNI: " + DNI + ", Sexo: " + Sexo + ", Celular: " + Celular + ", Direccion: " + Direccion;
    }
    
    
    
    
}
