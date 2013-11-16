/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package granja;

/**
 *
 * @author alumno
 */
public abstract class Dieta {
     Float CantidadAlimento;
     Float CantidadAgua;

    public Float getCantidadAgua() {
        return CantidadAgua;
    }

    public void setCantidadAgua(Float CantidadAgua) {
        this.CantidadAgua = CantidadAgua;
    }

    public Float getCantidadAlimento() {
        return CantidadAlimento;
    }

    public void setCantidadAlimento(Float CantidadAlimento) {
        this.CantidadAlimento = CantidadAlimento;
    }
     
}
