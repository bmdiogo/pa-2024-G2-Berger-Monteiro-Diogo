package pa.repaso.ejercicio3.sinHerencia;

public class Patinete {
   private boolean electrico;
   private int numRuedas;
   private String nombre;
   
   public Patinete (boolean tipo, int ruedas, String nombre) {
        electrico = tipo;
        numRuedas = ruedas;
        this.nombre = nombre;
   }
   
   public int getNumRuedas() {
      return numRuedas; 
   }

   public void setNumRuedas(int valor) { 
      numRuedas = valor;
   }

   // This method overrides a method from the superclass
   public String getDescripcion() {
      String mensaje = "   "+nombre+ " ";
      if (electrico) {
        mensaje= mensaje + " electrico\n" ;
      } else mensaje = mensaje + " manual\n";
      
      mensaje = mensaje + "   Número de ruedas del "+nombre+": " + numRuedas+"\n";
      return mensaje;
   }
 
}
