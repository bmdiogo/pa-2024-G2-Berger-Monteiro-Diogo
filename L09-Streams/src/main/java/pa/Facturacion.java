package pa;
import java.util.ArrayList;
import java.util.Arrays;

import pa.impresos.*;
import java.io.Console;
public class Facturacion {
	private ArrayList<Factura> listaFacturas;
	public Facturacion(){
		listaFacturas=new ArrayList<>();
	}
	public ArrayList<Factura> getFacturas(){
		return listaFacturas;
	}
	public Factura buscarFactura(String nombre ) {
		Factura devuelve=null;
		for (Factura f:listaFacturas) {
			if (f.getCliente()==nombre) {
				devuelve=f;
			}
		}
		return devuelve;
	}
	
	
	public void generarFacturas(ArrayList<LineaFactura> lista) {
		Factura f=null;
		for (LineaFactura l:lista) {
			f=buscarFactura(l.getIdCliente());
			if(f!=null) {
				listaFacturas.add(f);
			}
			else {
				f=new Factura(l.getIdCliente());
				listaFacturas.add(f);
			}
		
			
		}
	}
	public boolean login() {
		boolean puede=false;
		final  int MAXINTENTOS=3;
		char[] passValue= {'f','a','c','t','u','r','a'};
		String loginValue="usuario";
		String login;
		char[] password;
		int intentos=0;
		while(intentos<MAXINTENTOS) {
		Console c=System.console();
		if(c!=null) {
			login=c.readLine("Introduzca sus credenciales: ");
			password=c.readPassword("Introduzca su contraseña: ");//se usa Arrays
			if((Arrays.equals(password, passValue)&&loginValue.equals(login))){
				c.writer().println("Valid Credentials");
				puede=true;
			}
			else {
				c.writer().println("Invalid login or password");
				intentos++;
			}
		}
		else {
			System.out.println("Console not available, debes ejecutar desde el terminal");
		}
		
		
		
	}
		return puede;
}

  public static void main(String[] args) {
	 c= new
  }
  
}

