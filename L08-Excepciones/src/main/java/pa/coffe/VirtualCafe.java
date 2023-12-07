package pa.coffe;

import java.util.ArrayList;

import pa.excepciones.TooColdException;
import pa.excepciones.TooHotException;

public class VirtualCafe {
	private String name;
	private ArrayList<VirtualPerson> clientes;
	private double ganancias=0.0;
	private static final double PRECIO_CAFE=2.00;
	private static final double PROPINA=0.50;
	public String getName() {
		return name;
	}
	public ArrayList<VirtualPerson> getClientes() {
		return clientes;
	}
	public double getGanancias() {
		return ganancias;
	}
	public VirtualCafe(String name) {
		this.name = name;
		System.out.println("La cafetería " +name+" abre sus puertas.");
		this.clientes=new ArrayList<>();
	}
	
	public int getNumberClientes() {
		return clientes.size();
	}
	private void cobrarCafe(boolean propina) {
		double cobrado;
		if (propina==true) {
			cobrado=PRECIO_CAFE+PROPINA;			
		}
		else {
			cobrado=PRECIO_CAFE;
		}
		ganancias+=cobrado;
		System.out.println("Cobrado:"+ cobrado+" euros");
	}
	public void addClient(VirtualPerson cliente, boolean nuevoCliente) {
		clientes.add(cliente);
		if (nuevoCliente) {
			System.out.println("El cliente " +cliente.getName()+" ha entrado en la cafetería " + name);
		}
	}
	public boolean serveCustormer(VirtualPerson cust, CoffeeCup cup) {
		System.out.println("Hola Cliente " + cust.getName()+",aquí tiene su café.");
		boolean segundo=false;
		try {
			cust.drinkCoffee(cup);
			System.out.println(cust.getName()+":el café está en su punto. Gracias!!");
			return segundo;
			
		} catch (TooColdException  e) {
			System.out.println(cust.getName()+": Tráigame otro café");
			segundo=true;
			e.printStackTrace();
			return segundo;
		}
		catch (TooHotException e) {
			System.out.println(cust.getName()+":No le dejaré propina");
			e.printStackTrace();
			segundo=false;
			return segundo;
		}
	}
	public VirtualPerson getNextClient() {
		if (clientes.size()>=1) {
			VirtualPerson nextClient=clientes.get(0);
			clientes.remove(0);
			return nextClient;
		}
		else
			return null;
	}

}
