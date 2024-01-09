package pa;

import java.util.ArrayList;
import java.util.Scanner;

import pa.Peticion;


/**
 * Un ascensor tendrá los siguientes atributos:
 * - peticiones: es una colección ilimitada de objetos de tipo Peticion, y contiene todas las peticiones
 * de los usuarios que hay en la planta en la que el ascensor se ha detenido y a abierto sus puertas.
 * - peticiones_validas: es una colección ilimitada de objetos de tipo Petición, y contiene las peticiones
 * válidas (son las peticiones de las personas que finalmente subirán al ascensor)
 * - piso_actual: es un entero que representa el piso en el que se encuentra actualmente el ascensor
 * - lector_peticiones: de tipo Scanner, usaremos este objeto para leer los pisos de destino de las personas
 * que están esperando para subir al ascensor.
 * - IMPORTANTE: el ascensor puede recorrer un náximo de 20 pisos, y puede llevar a 4 personas como máximo.
 */
public class Ascensor {
	//declaración de atributos. Son todos privados.
	private final static int PISOS=20;
	private final static int PERSONAS=4;
	private ArrayList<Peticion> peticiones;
	private ArrayList<Peticion> peticiones_validas;
	private int piso_actual;
	private Scanner lector;
	
	public Ascensor(AccesoDatos obj) {
		piso_actual=0;
		peticiones=new ArrayList<>();
		peticiones_validas=new ArrayList<>();
		lector=new Scanner(System.in);
	}

	
	/**
	 * El método nuevo_aviso recibe una petición por parámetro, y devuelve el mensajes de error
	 * asociado a dicha petición, cuyo valor dependerá de:
	 * a) si es una petición válida pero ya está el ascensor lleno, el mensaje será:
	 *    "- El usuario que ha pulsado X ya no cabe\n" (siendo X el número de piso de destino)
	 * b) si es una petición con un valor de piso de destino incorrecto (fuera del rango de
	 *    pisos que puede recorrer el ascensor, el mensaje será:
	 *    "- El usuario que ha pulsado X ha introducido un valor incorrecto\n"
	 * c) si el usuario ya está en la planta a la que ha solicitado ir, el mensaje será:   
	 *    "- El usuario que ha pulsado X ya está en esa planta\n"
	 * El mensaje de error de cada petición será una línea de texcto que se concatenará con los mensajes 
	 * de invocaciones previas     
	 */
	private String nuevo_aviso(Peticion p) {
		String mensaje_error = null;
		if (p.getPiso_destino()<0||p.getPiso_destino()>PISOS) {
			mensaje_error= "- El usuario que ha pulsado "+ p.getPiso_destino()+" ha introducido un valor incorrecto\n";
		}
		if(p.getPiso_destino()==piso_actual) {
			mensaje_error="- El usuario que ha pulsado "+ p.getPiso_destino()+" ya está en esa planta\n";
		}
		if (peticiones_validas.size()==PERSONAS) {
			mensaje_error= "- El usuario que ha pulsado"+ p.getPiso_destino()+" ya no cabe\n";
		}
		//cada nuevo aviso se añadirá
		
		return mensaje_error;
	}
	
	/**
	 * El método leer_peticiones usa la clase Scanner para leer los números de piso
	 * a los que quieren ir cada una de las personas. Dichos valores los introducirá el usuario
	 * por teclado. Los números de piso de destino serán enteros. Para poder deteminar el 
	 * final la entrada, usaremos el carácter 'A', que incluiremos al final.
	 * Por ejemplo: 3 5 10 12 A
	 *              representan las peticiones 3, 5, 10 y 12.
	 * 	
	 */
	public int leer_peticiones() {
		System.out.println("\n---------------------------------");
		System.out.println("Estoy en el piso: " +piso_actual); //aquí añadiremos el piso_actual);
		System.out.println("Puertas abiertas. Espero peticiones: ");
		
		//aquí leemos los pisos de destino. Usaremos los métodos hasNextInt() y nextInt() de la clase Scanner
		//para cada dato leido crearemos el objeto Peticion correspondiente, y lo añadiremos a la lista
		//de peticiones del ascensor.
		
		//usaremos el método nextLine() cuando ya no queden enteros por leer, de esta forma
		//"leeremos" el carácter 'A' y el retorno de carro
		//lector_peticiones.nextLine();
		
		while (lector.hasNextInt()) {
			int piso=lector.nextInt();
			Peticion e=new Peticion(piso);
			peticiones.add(e);
	        }
		
		 
			System.out.println(peticiones);
			lector.nextLine();
			return peticiones.size();
	}
		
		
		
	
	
	/**
	 * Este método analiza todas y CADA UNA de las peticiones de la lista peticiones,
	 * de forma que:
	 * - una petición será válida si el piso de destino está dentro del rango de pisos 0..20 y
	 * 	 el piso de destino es diferente al piso actual.
	 * - si la petición es válida, y la persona cabe en el ascensor, entonces dicha petición se añade
	 *   a la lista peticiones_validas
	 * - si la petición no es válida, entonces se genera un nuevo aviso mensaje de aviso, que se
	 * 	 añade (concatena) a los avisos de peticiones anteriores.
	 * - cada petición, una vez analizada para ver si es válida o no, se borra de la lista de peticiones.
	 * 
	 * El método, después seleccionar las peticiones válidas y obtener la lista peticiones_validas
	 * mostrará por pantalla el mensaje:
	 * "Entran en el ascensor las personas que van a los pisos: x, y, z, ...", en donde x, y, z, ...
	 * son los pisos de destino, separados por comas, de las personas que finalmente entran en el 
	 * ascensor (como máximo serán 4)
	 * 
	 * Si hay peticiones no válidas, el método imprime por pantalla:
	 * "AVISOS" + todos los avisos asociados a cada petición no válida, y que estarán almacenados
	 * en una variable de tipo String. (ver traza de ejecución)
	 * 
	 * El método devuelve el número de avisos que se han generado, que serán tantos como peticiones
	 * no válidas haya
	 */
	public int seleccionar_peticiones_validas () {
		int numavisos=0;
		String avisos = ""; //aquí vamos concatenando todos los avisos de todas las peticiones no válidas
		//analizamos una a una todas las peticiones pasadas por parámetro
		//mostramos los pisos de destino de las personas que han subido al ascensor
		//mostramos los avisos, si los hay
		//devolvemos el número de avisos (peticiones no válidas)
		while(!peticiones.isEmpty()) {
			Peticion p=peticiones.get(0);
			if(p.getPiso_destino()>=0 && p.getPiso_destino()<=PISOS &&p.getPiso_destino()!=piso_actual && peticiones_validas.size()<=PERSONAS) {
			 peticiones_validas.add(p);
			}
			else {
				avisos+=nuevo_aviso(p);
				numavisos++;
			}
			
		}
		System.out.println(avisos);
		return numavisos;
	}
	
	
	/**
	 * Este método pone en marcha el ascensor para llevar a cada uno de sus ocupantes a los
	 * pisos de destino que han solicitado, las cuales serán las peticiones de la lista
	 * peticiones_validas. 
	 * 
	 * El método imprime el mensaje: "Cerrando puertas. Estamos en el piso: X", siendo X
	 * el piso actual en el que se encuentra el ascensor.
	 * Las peticiones se van antendiendo de una en una, y PARA CADA petición:
	 * - si se solicita ir a un piso más alto que el actual, se mostrará el mensaje:
	 *     "Subiendo a una persona la planta Y" (siendo Y la planta de destino solicitada
	 * - si se solicita ir a un piso inferior al actual, se mostrará el mensaje:
	 *     "Bajando a una persona la planta Y" 
	 * - si la petición anterior a la actual ha solicitado la misma planta, entonces se 
	 *   mostrará el mensaje: 
	 *    "La siguiente persona también puede bajar"  
	 * - Después de procesar CADA petición, ésta se ELIMINARÁ de la lista peticiones_validas
	 * - El ascensor actualizará su posición actual cada vez que suba o baje a la planta de destino.        
	 */
	public void llevar_personas_a_sus_destinos() {	
			System.out.println("Cerrando puertas. Estamos en el piso: "+piso_actual );
			while(!peticiones_validas.isEmpty()) {
				if (peticiones_validas.get(0).getPiso_destino()>piso_actual) {
					System.out.println("Subiendo a una persona la planta"+peticiones_validas.get(0).getPiso_destino());
					
				}
				else {
				 if (peticiones_validas.get(0).getPiso_destino()<piso_actual) {
					System.out.println("Bajando a una persona la planta"+peticiones_validas.get(0).getPiso_destino());
				 }
				 else  {
					System.out.println("La siguiente persona también puede bajar" );
					
				}
			}
				piso_actual=peticiones_validas.get(0).getPiso_destino();
				peticiones_validas.remove(0);
	}
			
	
	
	

	}}
