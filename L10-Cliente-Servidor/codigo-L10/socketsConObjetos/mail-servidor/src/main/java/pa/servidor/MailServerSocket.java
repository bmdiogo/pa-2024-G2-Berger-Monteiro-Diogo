package pa.servidor;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.ArrayList;

import pa.MailItem;
import pa.datos.*;

public class MailServerSocket {
	private ArrayList<MailItem> servidorCorreo;
	public MailServerSocket() {
		this.servidorCorreo=Mensajes.mensajesPrueba1;
	}
	public void servirMensajes(String nombre,ObjectOutputStream msg) {
		try {
			ArrayList<MailItem> mensajes=new ArrayList<>();
		
			for (MailItem m:servidorCorreo) {
				if (m.getFrom()==nombre) {
					mensajes.add(m);
				
			}
			System.out.println("Enviando "+mensajes.size()+" mensajes para: "+nombre);
			msg.writeObject(mensajes);

			
	}
		}
			
		catch(IOException e){
			e.printStackTrace();
			
		}
			
		}
	public void recibirMensajes(String nombre,ObjectOutputStream out,ObjectInputStream in) throws IOException,ClassNotFoundException {
		try {
			out.writeUTF("Pedimos los datos\n");
			out.flush();
			out.writeUTF( "\"Destinatario mensaje: ");
			out.flush();
			String destinatario=in.readUTF();
			out.writeUTF("Escriba su mensaje entre comillas dobles y con un sólo retorno de carro al final:(\n)");
			out.flush();
			String msg=in.readUTF();
			out.writeUTF("Mensaje de: "+nombre+"/n"+msg);
			out.flush();
			MailItem recibido=new MailItem(nombre,destinatario,msg);
			out.writeUTF("Mensaje recibido");
			out.flush();
			servidorCorreo.add(recibido);
			out.writeUTF("Mensaje añadido con éxito");
			out.flush();
		}
		
		
	 catch(IOException e) {
			throw e;}
		}
		
	
		
		

	public static void main(String[] args) throws IOException {
		int port = 6066;
		final int MILISEG_ESPERA=120000;
		try(ServerSocket server=new ServerSocket(port);) {
			 System.out.println("Servidor de correo en marcha en el puerto: "+server.getLocalPort());
			 server.setSoTimeout(MILISEG_ESPERA);

			try(
				Socket client=server.accept();
				ObjectOutputStream out=new ObjectOutputStream(client.getOutputStream());
				ObjectInputStream in=new ObjectInputStream(client.getInputStream());){
				System.out.println("Acabo de conectar con el puerto: "+client.getRemoteSocketAddress());
				String nombre_cliente=in.readUTF();
				out.writeUTF("Hola"+nombre_cliente);
				out.writeUTF("Indique la operación a realizar:\n 1. consultar mensajes recibidos \n 2. enviar un mensaje \n Teclee opción: (para terminar teclee cualquier otro valor)");
				out.flush();
				MailServerSocket mss=new MailServerSocket();
				int opcion=in.readInt();
				while(opcion==1||opcion==2) {
				if(in.readInt()==1) {
					mss.servirMensajes(nombre_cliente,out);
					out.writeUTF("Indique la operación a realizar:\n 1. consultar mensajes recibidos \n 2. enviar un mensaje \n Teclee opción: (para terminar teclee cualquier otro valor)");
					out.flush();

					opcion=in.readInt();
				 }
				else if(in.readInt()==2) {
					mss.recibirMensajes(nombre_cliente, out, in);
					out.writeUTF("Indique la operación a realizar:\n 1. consultar mensajes recibidos \n 2. enviar un mensaje \n Teclee opción: (para terminar teclee cualquier otro valor)");
					out.flush();

					opcion=in.readInt();
				}
				
				}
					System.out.println("Servidor detenido");
					client.close();}
			 catch(ClassNotFoundException c) {
					c.getMessage();
					}
			catch(SocketTimeoutException s) {
				 System.out.println("Socket timed out!");
	             System.out.println("No se ha recibido ninguna petición de conexión en "
	                             +(MILISEG_ESPERA/1000)+" segundos");
	         }
				 catch(IOException e) {
					 e.printStackTrace();
				 }
		
		
		
		
		
		
		}
		
		
		
	

		
		
		
		
		
				 
	}

	}
