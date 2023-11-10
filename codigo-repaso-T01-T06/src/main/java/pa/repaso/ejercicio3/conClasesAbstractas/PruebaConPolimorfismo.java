package pa.repaso.ejercicio3.conClasesAbstractas;

import pa.repaso.ejercicio3.conHerencia.*;
import java.util.ArrayList;

public class PruebaConPolimorfismo {
  
   public static void main(String[] args) {      
      System.out.println("Ejecutamos las pruebas sobre las clases:");
      ArrayList<Vehiculo> vehiculos;
      
      /* la variable vehiculos ES POLIMÓRFICA porque contiene referencias
         a objetos de tipos diferentes */
      vehiculos = new ArrayList<>();
      
      Turismo coche= new Turismo("Turismo Seat Ibiza");
      vehiculos.add(coche);

      coche = new Turismo("Turismo Audi 5"); 
      coche.setNumMatricula("PAA 2021");
      coche.setNumRuedas(8);
      vehiculos.add(coche);
      
      Patinete patin = new Patinete(false, 4, "Patinete del Corte Inglés");
      vehiculos.add(patin);
      
      /* el método add() es polimórfico porque puede aplicarse sobre objetos
         de tipo diferente */
      
      patin = new Patinete(true, 2, "Patinete de Amazon");
      vehiculos.add(patin);
      
      /* la variable a es polimórfica porque referencia a objetos de 
         tipos difeentes */
      for (Vehiculo a:vehiculos) {
          System.out.println(a.getDescripcion());
      }
   }
}

