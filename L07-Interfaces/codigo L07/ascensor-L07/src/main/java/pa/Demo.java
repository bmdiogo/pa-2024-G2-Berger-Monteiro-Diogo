package pa;

import pa.*;

public class Demo {

	public static void main(String[] args) {
		if(args[0]=="fichero") {
			EntradaDesdeFichero.obtenerDatos();
			
		}
		else {
			EntradaDesdeTerminal.obtenerDatos();
			
		}

		       int num_peticiones, num_peticiones_con_avisos;
		      
		       /* ejemplos de PETICIONES:
		          -8  22  15  0  7  10  2  6  1  A
		           0   3   3  3  4  A
		           3   2   3  0  0  A
		           1    0   3  -2  17   17 A
		           3    3   5   5   3 A
		           1    1   1   1  10   12 A
		           5    7 A
		           A              //termina el programa
		           -8 -5  33  A   //termina el programa
		        */
		       
		       // Version sin interfaces
		       
		       Ascensor ascensor = new Ascensor(); 
		       do {
		    	   num_peticiones= ascensor.leer_peticiones();
			       num_peticiones_con_avisos = ascensor.seleccionar_peticiones_validas();
			       System.out.println("\"Número total de peticiones: "+X", Peticiones rechazadas: "+Y" .")
			       ascensor.llevar_personas_a_sus_destinos();
		       }  while (num_peticiones!= num_peticiones_con_avisos);
		       
		       System.out.println("\nAscensor inactivo.");      
		    }
		    
		}

	

