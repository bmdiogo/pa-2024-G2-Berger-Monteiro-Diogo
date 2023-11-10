package pa.repaso.ejercicio3.conHerencia;

public class Vehiculo  {
   protected int numRuedas;
   protected String nombre;
   
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
      return "   " + nombre+" con " + numRuedas + " ruedas\n ";
   }
}

