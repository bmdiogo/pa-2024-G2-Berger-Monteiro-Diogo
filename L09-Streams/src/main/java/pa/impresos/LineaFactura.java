package pa.impresos;

import java.time.LocalDate;

public class LineaFactura {
	private String idCliente;
	private String servicio;
	private LocalDate date;
	private Float importe;
	
	public LineaFactura(String nombre, String serv,LocalDate fecha,Float imp) {
		idCliente=nombre;
		servicio=serv;
		date=fecha;
		importe=imp;
	}

	public String getIdCliente() {
		return idCliente;
	}

	public String getServicio() {
		return servicio;
	}

	public LocalDate getDate() {
		return date;
	}

	public Float getImporte() {
		return importe;
	}
	
	
}
