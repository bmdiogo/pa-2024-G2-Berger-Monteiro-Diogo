/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pa.repaso.ejercicio4.personas1;

/**
 *
 * @author eli
 */
public class Ejemplo1 {
    
    public static void main(String[] args) {
       
      /* Ejercicio propuesto: implementa un código de forma que, a partir 
        de una colección de personas, imprima por pantalla un listado con sus
        nombres.
      */  
      
      String[] nombres_personas = {"Juan", "Felipe", "Marta", "Lucas"};
      int num_personas= nombres_personas.length;
            
      //Creamos el array de Personas
      Persona[] personas = new Persona [num_personas];
      for (int i=0; i< num_personas; i++) {
    	  personas[i]= new Persona();
    	  personas[i].setNombre(nombres_personas[i]);
      }
      
      System.out.println("Listado de nombres");
      //ahora imprimimos los nombres de las 4 personas
      for (Persona persona: personas) {
    	  System.out.println("  - "+persona.getNombre());
      }
                             
    }
    

}
