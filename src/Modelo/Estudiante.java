/*
 * Autor: Daniel Somarribas Quir�s
 * b57072
 * 2016
 */
package Modelo;

/**
 *
 * @author sqdan
 */
public class Estudiante {
    private String cedula;
    private String nombre;
    private String lugar;

    public Estudiante(String cedula, String nombre, String lugar) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.lugar = lugar;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }
    
    public String getInfo()
    {
        String info = "Cédula: "+cedula
                +"\nNombre: "+nombre
                +"\nLugar: "+lugar;
        
        return info;
    }
}
