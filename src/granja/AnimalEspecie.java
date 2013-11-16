/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package granja;

/**
 *
 * @author alumno
 */
public class AnimalEspecie extends Animal{
    String CodigoAnimal;

    public String getCodigoAnimal() {
        return CodigoAnimal;
    }

    public void setCodigoAnimal(String CodigoAnimal) {
        this.CodigoAnimal = CodigoAnimal;
    }
            
         public AnimalEspecie(String vnombreAnimal,
                                String vespecie,
                                Float vpeso,
                                String vfechaNac,
                                String [] vobservaciones) {
             
             this.nombreAnimal = vnombreAnimal;
             this.especie = vespecie;
             this.peso = vpeso;
             this.fechaNac = vfechaNac;
             this.observaciones = vobservaciones;
             
         }
         
    
}
