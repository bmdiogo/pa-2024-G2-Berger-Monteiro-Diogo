package pa;

/**
 * Cada petición se caracteriza por un piso de destino (piso_destino) y un identificador (id),
 * ambos de tipo entero. Los valores de los dos atributos NO se podrán cambiar, pero sí consultar.
 * En el caso del identificador, su valor no se pasará como parámetro en el constructor, sino que 
 * se asignará automáticamente, comenzando con el valor 0, y cada nueva petición verá incrementado 
 * en 1 su valor de id.
 */
public class Peticion {
	//los atributos se llamarán "piso_destino" e "id" y son privados.
	private int piso_destino;
	private int id;
	private static int nextId=0;
	
	public Peticion(int piso) {
		this.piso_destino=piso;
		this.id= nextId;
		nextId++;	
		}
	
	public int getPiso_destino() {
		return piso_destino;
	}
	
	public int getId() {
		return id;
	}
	
	
}
