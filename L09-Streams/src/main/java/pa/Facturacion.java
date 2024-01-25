package pa;
import java.util.ArrayList;
import java.util.Arrays;

import pa.impresos.*;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.Console;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.time.LocalDate;
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
		int intentos=1;
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
			puede=false;
			break;
		}
		
		
		
	}
		return puede;
		
}
	public ArrayList<LineaFactura> leerLineas(String fichero) {
		String linea;
		try (BufferedReader in =
				new BufferedReader(
					new FileReader("src/main/resources/datosLineas.txt"))){
				
				linea = in.readLine();
				ArrayList<LineaFactura> lineas = new ArrayList<>();
				while (linea != null) {
					String[] atributos = new String[5];
					for (int i=0; i<5; i++) {
						
						if (linea==null) {
							break;
						}
						atributos[i] = linea;
						linea = in.readLine();
					}
					if (linea==null) {
						break;
					}
					
					LineaFactura l1 = new LineaFactura(atributos[0], atributos[1], 
							LocalDate.parse(atributos[2]), Float.parseFloat(atributos[3]));
					lineas.add(l1);
				}
				generarFacturas(lineas);
				return lineas;
		} catch (IOException ex) {
			System.out.println("ERROR: "+ex.getMessage());
		}
		return null;
	}
	public void guardarFicheroFacturas() throws FileNotFoundException, IOException {
		String datafile="src/main/java/resources/factura.dat";
		try(ObjectOutputStream out=
				new ObjectOutputStream(new BufferedOutputStream(
						new FileOutputStream(datafile)))){
			out.writeObject("Guardando Facturas");
			for(int i=0;i<listaFacturas.size();i++) {
				out.writeObject(listaFacturas.get(i));
				out.writeObject("Guardada factura"+listaFacturas.get(i).getId());
			}
			}
		catch(FileNotFoundException e) {
			e.getMessage();
		}
		catch(IOException o) {
			o.printStackTrace();
		}
	}
		public void imprimirFacturas() {
			int count=1;
			for (Factura l : listaFacturas) {// for each
				
				try (BufferedWriter out =
						new BufferedWriter(
								new FileWriter("src/main/resources/destino" + count + ".txt"))) {
						out.write('a');
						out.newLine();
						out.write("Id factura: " + l.getId()
								+ "Fecha: " + l.getFecha());
						out.newLine();
						out.write("Cliente: " + l.getCliente());
						out.newLine();
						out.write(String.format("%-14s%-16s%-10s","Fecha","Servicio","Importe"));
						out.newLine();
						out.write(String.format("%-14s%-16s%-10s","-","-","-").replace(' ','-'));
						out.newLine();
						for (LineaFactura li : l.getLineas()) {
							out.write(String.format("%-14s", li.getDate().toString()));
							out.write(String.format("%-16s", li.getServicio()));
							out.write(String.format("%-10s", li.getImporte().toString()));
							out.newLine();
						}
						out.write("Total importe: " + l.getTotal().toString());
						
				} catch (IOException ex) {
					System.out.println("ERROR: "+ex.getMessage());
				}
				count++;
				
			}
			System.out.println("Fin de la escritura");
					
		}
			
	
	public void leerFicheroFacturas() throws FileNotFoundException, IOException, ClassNotFoundException {
		String file="src/main/java/resources/factura.dat";
		LocalDate fecha;
	try(ObjectInputStream in=new ObjectInputStream(
			new BufferedInputStream(
					new FileInputStream(file)))){
		fecha=(LocalDate) in.readObject();
		while(true) {
		Factura	fac=(Factura) in.readObject();
			System.out.println("Factura leida: ");
			System.out.println(fecha.toString());
			System.out.println("Cliente: "+fac.getCliente());
			System.out.println("Total factura= "+fac.getTotal());
			ArrayList<LineaFactura> lineass=new ArrayList<LineaFactura>();
			lineass=fac.getLineas();
			System.out.println("Número de lineas: "+lineass.size());
			for(LineaFactura l:lineass) {
				System.out.println("Servicio: "+l.getServicio()+" "+l.getDate()+l.getImporte());
			}
		}
	}
		
	}
	

  public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
	 try {
		  
		    

		    Facturacion f1= new Facturacion();
		   boolean login= f1.login();
		   if (login) {
				ArrayList<LineaFactura> lineas = new ArrayList<>();
				lineas = f1.leerLineas("src/main/resources/datosLineas.txt");
				System.out.println("IMPRIMIENDO FACTURAS AL FICHERO CARACTERES");
				f1.imprimirFacturas();
				System.out.println("IMPRIMIENDO FACTURAS AL FICHERO BYTES");
				f1.guardarFicheroFacturas();
				f1.leerFicheroFacturas();
			}
		}
	 catch(FileNotFoundException f) {
		 f.getMessage();
	 }
	 catch(IOException e) {
		 e.printStackTrace();
	 }

  }}
  


