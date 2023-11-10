package pa.repaso.ejercicio3.sinHerencia;

public class Vehiculo  {
   private int numRuedas;
   private String nombre;
   
   public Vehiculo (String nombre) {
       numRuedas=0;
       this.nombre = nombre;
   }

   public int getNumRuedas() {
      return numRuedas; 
   }

   public void setNumRuedas(int valor) { 
      numRuedas = valor;
   }

   public String getDescripcion() {
      return "   " + nombre+" con " + numRuedas + " ruedas";
   }
}

