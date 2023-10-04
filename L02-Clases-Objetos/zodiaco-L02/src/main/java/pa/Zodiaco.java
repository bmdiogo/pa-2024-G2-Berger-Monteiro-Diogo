
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
    	
    	switch (mes) {
    	case 1,3,5,7,8,10,12:
    		if (dia>0 && dia<=31) {
     		   return true;
     	   }
     	   else {
     		   return false;
     		   }
    	
    	case 2:
    		if(dia>0 && dia<29) {
    			return true;
    		}
    		else {
    			return false;
    		}
    	case 4,6,9,11:
    		if (dia>0 && dia<=30) {
    			return true;
    		}
    		else {
    			return false;
    		}
    		}
		return false;
    	
    	
        
       
    }
 
    /**
     * Devuelve el nombre del signo asociado al día y mes de nacimiento, o el mensaje "Fecha inválida"   
    */
    public String obtener_signo() {
    	if (fecha_valida()) {
    	switch(mes) {
    	case 1:
			if (dia<21) {
				signo="Capricornio";
			}
			else {
				signo="Acuario";
			}
			break;
		case 2:
			if (dia<20) {
				signo="Acuario";
			}
			else {
				signo="Piscis";
			}
			break;
		case 3:
			if (dia<21) {
				signo="Piscis";
			}
			else {
				signo="Aries";
			}
			break;
		case 4:
			if (dia<21) {
				signo="Aries";
			}
			else {
				signo="Tauro";
			}
			break;
		case 5:
			if (dia<22) {
				signo="Tauro";
			}
			else {
				signo="Géminis";
			}
			break;
		case 6:
			if (dia<22) {
				signo="Géminis";
			}
			else {
				signo="Cáncer";
			}
			break;
		case 7:
			if (dia<24) {
				signo="Cáncer";
			}
			else {
				signo="Leo";
			}
			break;
		case 8:
			if (dia<24) {
				signo="Leo";
			}
			else {
				signo="Virgo";
			}
			break;
		case 9:
			if (dia<24) {
				signo="Virgo";
			}
			else {
				signo="Libra";
			}
			break;
		case 10:
			if (dia<24) {
				signo="Libra";
			}
			else {
				signo="Escorpio";
			}
			break;
		case 11:
			if (dia<23) {
				signo="Escorpio";
			}
			else {
				signo="Sagitario";
			}
			break;
		case 12:
			if (dia<22) {
				signo="Sagitario";
			}
			else {
				signo="Capricornio";
			}
			break;
	}
	}
else {
	signo="Fecha inválida";
}
return signo;
}    
}