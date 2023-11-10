package pa.repaso.ejercicio3.conHerencia;

public class Turismo extends Vehiculo{

   private String numMatricula;
  
   public Turismo(String nombre) { 
      super(nombre);
      numRuedas = 4; 
      numMatricula = "Sin matricular";
   }

   public void setNumMatricula(String valor) {
      numMatricula = valor;
   }
   
   
   @Override
   public String getDescripcion() {

      return  "   "+nombre+" con número de matrícula: " + numMatricula + "\n"+
              "   Número de ruedas del "+nombre+ " : " + numRuedas+"\n";
   }

}

