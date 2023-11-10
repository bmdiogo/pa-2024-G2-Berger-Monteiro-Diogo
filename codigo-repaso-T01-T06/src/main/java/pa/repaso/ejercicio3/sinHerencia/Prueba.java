package pa.repaso.ejercicio3.sinHerencia;

public class Prueba {
  
   public static void main(String[] args) {      
      System.out.println("Ejecutamos las pruebas sobre las clases:"); 
      
      Vehiculo v1 = new Vehiculo("Vehiculo");
      System.out.println(v1.getDescripcion());
      
      Turismo coche1= new Turismo("Turismo Seat Ibiza"); 
      System.out.println(coche1.getDescripcion());

      Turismo coche2 = new Turismo("Turismo Audi 5"); 
      coche2.setNumMatricula("PAA 2021");
      coche2.setNumRuedas(8);
      System.out.println(coche2.getDescripcion());
      
      Patinete patin1 = new Patinete(false, 4, "Patinete del Corte Inglés");
      System.out.println(patin1.getDescripcion());
      
      Patinete patin2 = new Patinete(true, 2, "Patinete de Amazon");
      System.out.println(patin2.getDescripcion());
      
   }
}

