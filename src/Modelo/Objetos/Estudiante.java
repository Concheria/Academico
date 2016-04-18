/*
 * Autor: Daniel Somarribas Quir�s
 * b57072
 * 2016
 */
package Modelo.Objetos;

/**
 *
 * @author sqdan
 */
public class Estudiante {
    private String cedula;
    private String nombre;
    private String lugar;

    /**
     *
     * @param cedula
     * @param nombre
     * @param lugar
     */
    public Estudiante(String cedula, String nombre, String lugar) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.lugar = lugar;
    }

    /**
     *
     * @return
     */
    public String getCedula() {
        return cedula;
    }

    /**
     *
     * @param cedula
     */
    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    /**
     *
     * @return
     */
    public String getNombre() {
        return nombre;
    }

    /**
     *
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     *
     * @return
     */
    public String getLugar() {
        return lugar;
    }

    /**
     *
     * @param lugar
     */
    public void setLugar(String lugar) {
        this.lugar = lugar;
    }
    
    /**
     *
     * @return
     */
    public String getInfo()
    {
        String info = "Cédula: "+cedula
                +"\nNombre: "+nombre
                +"\nLugar: "+lugar;
        
        return info;
    }
}
