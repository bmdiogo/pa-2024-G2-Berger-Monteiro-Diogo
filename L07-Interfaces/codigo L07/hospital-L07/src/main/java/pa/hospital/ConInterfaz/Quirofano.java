package pa.hospital.ConInterfaz;

public class Quirofano implements IGestion {
private String id;
private static int nextId=0;
public Quirofano() {
	id="Quirofano-"+nextId;
	nextId++;
}
public String getId() {
	return id;
}
@Override
public void reservar() {
	System.out.println("Reservando quirofano " + id);
	
}
@Override
public void anular() {
	System.out.println("Anulando quirofano " + id);
	
}
}
