package pa.repaso.ejercicio3.sinHerencia;

public class Turismo {

   private String numMatricula;
   private int numRuedas;
   private String nombre;

  
   public Turismo(String nombre) { 
      this.nombre = nombre;
      numRuedas = 4; 
      numMatricula = "Sin matricular";
   }

   public void setNumMatricula(String valor) {
      numMatricula = valor;
   }
   
   public int getNumRuedas() {
      return numRuedas; 
   }

   public void setNumRuedas(int valor) { 
      numRuedas = valor;
   }

   public String getDescripcion() {
      return "   "+nombre+" con número de matrícula: " + numMatricula + "\n"+
              "   Número de ruedas del "+nombre+ " : " + numRuedas+"\n";
   }

}

