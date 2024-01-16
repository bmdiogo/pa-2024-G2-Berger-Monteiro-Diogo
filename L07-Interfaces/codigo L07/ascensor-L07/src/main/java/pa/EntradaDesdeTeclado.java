package pa;
import java.util.ArrayList;
import java.util.Scanner;

public class EntradaDesdeTeclado implements AccesoDatos {
	private Scanner lector_peticiones;
	
	public EntradaDesdeTeclado() {
		lector_peticiones=new Scanner(System.in); //usar la entrada es inicializar el scanner
	}

	@Override
	public int[] obtenerDatos() {
		ArrayList<Integer> datos= new ArrayList<Integer>();
		int [] v=null;
		int valor;
		while(lector_peticiones.hasNextInt()) {
			valor=lector_peticiones.nextInt();
			datos.add(valor);
		}
		v=new int[datos.size()];// Hay que pasarlo a array, lo inicializamos con el tamaño del arraylist
		for(int i=0;i<datos.size();i++) {
			v[i]=datos.get(i);
		}
		System.out.println(" Peticiones Leídas");
		for(int i=0;i<v.length;i++) {
			System.out.print(" " + v[i]+", ");
		}
		System.out.println(" "+v[v.length-1]+" ");
		//Si el usuario introduce A, devuelve un array de longitud 0
		
		return v;
		
		
		
		
		
		
		
	}
	

}
