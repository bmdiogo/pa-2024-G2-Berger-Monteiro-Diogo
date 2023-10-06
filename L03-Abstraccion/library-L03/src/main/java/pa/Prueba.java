/**
 * Prueba del código Book(préstamos)
 * dioguin
 */
package pa;

public class Prueba {
	
	public static void main(String[] args) {
		Book lib1=new Book("George R.R. Martin","Juego de Tronos",1300);
		Book lib2= new Book("Umberto Eco","El nombre de la Rosa",987);
		Book lib3= new Book("Christian Jacq","Tutankamon",876);
		System.out.println("Creados los tres libros");
		lib1.setRefNumber("01");
		lib2.setRefNumber("001");
		lib3.setRefNumber("0003");
		lib1.printDetails();
		lib2.printDetails();
		lib3.printDetails();
		
		lib1.setRefNumber("0001");
		lib2.setRefNumber("0002");
		lib1.printDetails();
		lib2.printDetails();
		lib1.prestar();
		lib1.prestar();
		lib2.prestar();
		lib1.mostrarVecesPrestado();
		lib2.mostrarVecesPrestado();
		lib3.mostrarVecesPrestado();
		
		
		
	}
	
	
	

}
