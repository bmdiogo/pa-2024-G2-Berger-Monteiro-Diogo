package pa.repaso.ejercicio3.conClasesAbstractas;

import pa.repaso.ejercicio3.conHerencia.*;
import java.util.ArrayList;

public class PruebaSinPolimorfismo {
  
   public static void main(String[] args) {      
      System.out.println("Ejecutamos las pruebas sobre las clases:");
      ArrayList<Turismo> turismos;
      ArrayList<Patinete> patinetes;
      
      turismos = new ArrayList<>();
      patinetes = new ArrayList<>();
      
      Turismo coche= new Turismo("Turismo Seat Ibiza");
      turismos.add(coche);

      coche = new Turismo("Turismo Audi 5"); 
      coche.setNumMatricula("PAA 2021");
      coche.setNumRuedas(8);
      turismos.add(coche);
      
      Patinete patin = new Patinete(false, 4, "Patinete del Corte Inglés");
      patinetes.add(patin);
      
      patin = new Patinete(true, 2, "Patinete de Amazon");
      patinetes.add(patin);
      
      /* Aquí t NO es una variable polimórfica por que siempre referencia
         a objetos del mismo tipo */
      for (Turismo t:turismos) {
          System.out.println(t.getDescripcion());
      }
      
      /* Aquí t NO es una variable polimórfica por que siempre referencia
         a objetos del mismo tipo */
      for (Patinete a:patinetes) {
          System.out.println(a.getDescripcion());
      }
      
   }
}

