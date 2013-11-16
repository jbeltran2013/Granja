/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package granja;

/**
 *
 * @author alumno
 */
public class Alimento extends Dieta {
    String NombreDieta;
    String TipoAlimento;
    String UnidadMedida;
    String [] ValoresNutricional;
    String [] [] NutrienteCantidad;
    
    
    public Alimento( Float vCantidadAlimento,
                     Float vCantidadAgua){
    
         this.CantidadAlimento = vCantidadAlimento;
         this.CantidadAgua = vCantidadAgua;
        
    }
    

    public String getNombreDieta() {
        return NombreDieta;
    }

    public void setNombreDieta(String NombreDieta) {
        this.NombreDieta = NombreDieta;
    }

    public String[][] getNutrienteCantidad() {
        return NutrienteCantidad;
    }

    public void setNutrienteCantidad(String[][] NutrienteCantidad) {
        this.NutrienteCantidad = NutrienteCantidad;
    }

    public String getTipoAlimento() {
        return TipoAlimento;
    }

    public void setTipoAlimento(String TipoAlimento) {
        this.TipoAlimento = TipoAlimento;
    }

    public String getUnidadMedida() {
        return UnidadMedida;
    }

    public void setUnidadMedida(String UnidadMedida) {
        this.UnidadMedida = UnidadMedida;
    }

    public String[] getValoresNutricional() {
        return ValoresNutricional;
    }

    public void setValoresNutricional(String[] ValoresNutricional) {
        this.ValoresNutricional = ValoresNutricional;
    }
    
    
    
}
