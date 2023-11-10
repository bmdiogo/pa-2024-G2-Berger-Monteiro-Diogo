package pa.repaso.ejercicio3.conHerencia;

public class Patinete extends Vehiculo {
   private boolean electrico;
   
   public Patinete (boolean tipo, int ruedas, String nombre) {
        super(nombre);
        electrico = tipo;
        numRuedas = ruedas;
   }
   
   @Override
   public String getDescripcion() {
      String mensaje = "   "+nombre+ " ";
      if (electrico) {
        mensaje= mensaje + " electrico\n" ;
      } else mensaje = mensaje + " manual\n";
      
      mensaje = mensaje + "   Número de ruedas del "+nombre+": " + numRuedas+"\n";
      return mensaje;
   }
 
}
