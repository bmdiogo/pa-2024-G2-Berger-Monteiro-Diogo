package pa.impresos;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;

public class Factura implements Serializable {
	private int id;
	private LocalDate fecha;
	private String cliente;
	private ArrayList<LineaFactura> lineas;
	private Float total;
	static int ultimoID=1;
	private static final long serialVersionUID=1L;
	private final static int MAXLINEAS=6;
	public Factura(String nom) {
		id=ultimoID;
		cliente=nom;
		fecha=LocalDate.now();
		lineas=new ArrayList<>();
		total=(float) 0.0;
		ultimoID++;
	}
	public ArrayList<LineaFactura> getLineas() {
		return lineas;
	}
	public void setLineas(ArrayList<LineaFactura> lineas) {
		this.lineas = lineas;
	}
	public Float getTotal() {
		return total;
	}
	public void setTotal(Float total) {
		this.total = total;
	}
	public int getId() {
		return id;
	}
	public LocalDate getFecha() {
		return fecha;
	}
	public String getCliente() {
		return cliente;
	}
	
	public int addLinea(LineaFactura lineaf) {
		if(lineas.size()<MAXLINEAS) {
			lineas.add(lineaf);
			total+=lineaf.getImporte();
			return lineas.size();
		}
		else {
			return -1;
		}
	}
	
	

}
