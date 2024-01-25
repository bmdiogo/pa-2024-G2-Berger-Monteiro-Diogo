package pa.cliente;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Scanner;

import pa.MailItem;
public class MailClientSocket {
	public MailClientSocket() {};

	public void enviarmensajes(String nombre,ObjectInputStream in,ObjectOutputStream out,Scanner sc)throws IOException {
		try {
			
			System.out.println(in.readUTF());//pide destinatario
			sc=new Scanner(System.in);
			out.writeUTF(sc.nextLine());//escribe destinatario
			System.out.println(in.readUTF());//pide msg
			out.writeUTF(sc.nextLine());//escribe msg
			System.out.println(in.readUTF());
			
			
			
		}
		catch(IOException e) {
			throw e;
		}
	}
	public void recibirMensajes(String nombre,ObjectInputStream in) throws IOException, ClassNotFoundException {
		try{ArrayList<MailItem> readObject = (ArrayList<MailItem>) in.readObject();
		ArrayList<MailItem> mensajes=readObject;
		int num=mensajes.size();
		System.out.println("Mensajes recibidos = "+num);
		if(num!=0) {
			System.out.println(nombre+"Aquí tienes tus mensajes");
			for(int i=0;i<num;i++) {
				System.out.println("Leyendo mensaje "+i);
				mensajes.get(i).print();
			}
		}
		else {
			System.out.println("No tienes nuevos mensajes");
		}
		
	}
		catch(ClassNotFoundException c){
			c.getMessage();
		}
		catch(IOException e) {
			throw e;
		}}
		
		
	
	
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		String servername="localhost";
		int port=6066;
		try(Socket client=new Socket(servername,port);
				ObjectInputStream in =new 	ObjectInputStream(client.getInputStream());
				ObjectOutputStream out=new ObjectOutputStream(client.getOutputStream());) {
			System.out.println("Intentando conectar con el servidor"+ client.getRemoteSocketAddress()+"en el puerto"+client.getPort());
			Scanner sc=new Scanner(System.in);
			System.out.println("Introduce tu nombre: ");
			String nombre=sc.nextLine();
			out.writeUTF(nombre);
			out.flush();
			System.out.println(in.readUTF());//lee el menú de opciones
			MailClientSocket mcs= new MailClientSocket();
			int opcion=sc.nextInt();
			out.writeInt(opcion);
			out.flush();
			if (opcion==1) {
				mcs.recibirMensajes(nombre, in);
				}
			else if(opcion==2) {
				mcs.enviarmensajes(nombre, in, out, sc);
			}
			else {
				client.close();
			}
					
		}
				

	}

}
