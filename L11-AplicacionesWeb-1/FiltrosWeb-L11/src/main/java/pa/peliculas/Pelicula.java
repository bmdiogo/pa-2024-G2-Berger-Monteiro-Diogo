package pa.peliculas;

public class Pelicula {
private String nombre;
private int numvotos;
public Pelicula(String nombre,int voto) {
	this.nombre=nombre;
	this.numvotos=voto;
}
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public int getNumvotos() {
	return numvotos;
}
public void setNumvotos(int numvotos) {
	this.numvotos = numvotos;
}

}
