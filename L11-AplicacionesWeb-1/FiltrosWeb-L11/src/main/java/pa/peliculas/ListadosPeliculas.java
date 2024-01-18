package pa.peliculas;
import java.util.ArrayList;
public class ListadosPeliculas {
String[] pelis= {"Peli1","Peli2","Peli3","Peli4","Peli5","Peli6","Peli7","Peli8","Peli9","Peli10"};
int[] votos= {100, 350, 435, 800, 98, 220, 600, 850, 927, 689};
public ListadosPeliculas() {};

	public ArrayList<Pelicula> peliculasDisponibles(){
		ArrayList<Pelicula> a=new ArrayList<>();
		for(int i=0;i<pelis.length;i++) {
			Pelicula b=new Pelicula(pelis[i],votos[i]);
			a.add(b);
		}
		return a;
	}
	public String[] peliculasMasVotadas(ArrayList<Pelicula> lista) {
		  // Ordenar la lista de películas por número de votos de mayor a menor (burbuja)
        for (int i = 0; i < lista.size() - 1; i++) {
            for (int j = 0; j < lista.size() - 1 - i; j++) {
                if (lista.get(j).getNumvotos() < lista.get(j + 1).getNumvotos()) {
                    // Intercambiar las películas si el voto de la película actual es menor que el de la siguiente
                    Pelicula temp = lista.get(j);
                    lista.set(j, lista.get(j + 1));
                    lista.set(j + 1, temp);
                }
            }
        }

        // Seleccionar las tres primeras películas (o menos si hay menos de tres)
        String[] peliculasmas = new String[3];
        for (int i = 0; i < 3; i++) {
            peliculasmas[i] = lista.get(i).getNombre();
        }

        return peliculasmas;
    }
		
	public String[] peliculasMenosVotadas(ArrayList<Pelicula> lista) {
		  for (int i = 0; i < lista.size() - 1; i++) {
	            for (int j = 0; j < lista.size() - 1 - i; j++) {
	                if (lista.get(j).getNumvotos() > lista.get(j + 1).getNumvotos()) {
	                    // Intercambiar las películas si el voto de la película actual es mayor que el de la siguiente
	                    Pelicula temp = lista.get(j);
	                    lista.set(j, lista.get(j + 1));
	                    lista.set(j + 1, temp);
	                }
	            }
	        }

	        // Seleccionar las tres primeras películas (o menos si hay menos de tres)
	        String[] peliculasmenos = new String[3];
	        for (int i = 0; i < 3; i++) {
	            peliculasmenos[i] = lista.get(i).getNombre();
	        }

	        return peliculasmenos;
	}
	
				
	}
	

