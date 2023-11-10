package pa;
import pa.sorting.*;
public class Demo1 {

	public static void main(String[] args) {
		Country[] paises= {
				new Country("España"),
				new Country("Venezuela"),
				new Country("Francia"),
				new Country("Bélgica"),
				new Country("Holanda")};
		
		for(Country pais:paises) {
			System.out.print(pais.getName()+"  ");
		}
		System.out.println();
		System.out.println("Ordenado:");
		Sort.selectionSort(paises);//Ordena el vector
		for(Country pais:paises) {
			System.out.print(pais.getName()+"  ");
		}
		Grade[] notas= {
				new Grade(8.5),
				new Grade(4.5),
				new Grade(0.2),
				new Grade(5.0),
				new Grade(1.6)
		};
		System.out.println();
		for (Grade nota:notas) {
			System.out.print(nota.getValue() + "  ");
		}
		System.out.println();
		System.out.println("Ordenado");
		Sort.selectionSort(notas);
		for (Grade nota:notas) {
			System.out.print(nota.getValue() + "  ");
		}
		

	}}


