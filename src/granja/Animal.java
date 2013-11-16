/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package granja;

/**
 *
 * @author alumno
 */
public abstract class Animal {
    String nombreAnimal;
    String especie;
    Float peso;
    String fechaNac;
    String [] observaciones;

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(String fechaNac) {
        this.fechaNac = fechaNac;
    }

    public String getNombreAnimal() {
        return nombreAnimal;
    }

    public void setNombreAnimal(String nombreAnimal) {
        this.nombreAnimal = nombreAnimal;
    }

    public String[] getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String[] observaciones) {
        this.observaciones = observaciones;
    }

    public Float getPeso() {
        return peso;
    }

    public void setPeso(Float peso) {
        this.peso = peso;
    }
    
    
}
