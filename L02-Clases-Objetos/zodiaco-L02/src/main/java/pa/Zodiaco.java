
package pa;


public class Zodiaco {
    private int dia;
    private int mes;
    private String signo;
    
    public Zodiaco(int dia, int mes) {
        this.dia = dia;
        this.mes = mes;
        signo = "Desconocido";
    }

    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }
    
    /**
     * Devuelve cierto si la fecha es válida ¨(día: 1..31, mes:1..12), y
       falso en caso contrario   
    */  
    private boolean fecha_valida() {
        
       return false;
    }
 
    /**
     * Devuelve el nombre del signo asociado al día y mes de nacimiento, o el mensaje "Fecha inválida"   
    */
    public String obtener_signo() {
        
        return "";
    }    
}
