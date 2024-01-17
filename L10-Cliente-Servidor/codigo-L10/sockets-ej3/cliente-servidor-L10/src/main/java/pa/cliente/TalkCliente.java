package pa.cliente;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;
import java.util.regex.Pattern;
 
public class TalkCliente {

	public static void main(String[] args) {
		 String serverName = "localhost";

	      int port = 6066;
	      
	      System.out.println("Client says: Intentando conectar con " 
	                          + serverName + " en el puerto " + port);
	      try (Socket client = new Socket(serverName, port); 
	    	   DataOutputStream out = 
	    			  new DataOutputStream(client.getOutputStream());
	           DataInputStream in = 
	        		  new DataInputStream(client.getInputStream());	    		  
	          ) {
	         
	          System.out.println("Client says: Acabo de conectar con " 
	                       + client.getRemoteSocketAddress());
	          Scanner sc = new Scanner(System.in);
	          /*El mensaje puede incluir espacios en blanco
	          y termina con un retorno de carro*/
	          sc.useDelimiter(Pattern.compile("\\n"));
	          sc.next(); //leemos el mensaje del cliente
	         //Escribimos un mensaje al servidor
	         out.writeUTF("Hola desde " + client.getLocalSocketAddress());
	          while(sc.next()!="Bye") {
	        	  out.writeUTF(sc.next());
	         //leemos el mensaje del servidor
	         System.out.println("Server says: " + in.readUTF());
	          }
	      }catch(IOException e) {
	        //  e.printStackTrace();
	        System.out.println("Conexión rechazada: ( "+e.getMessage()+ ")");
	      }
	      
	      System.out.println("\nEl cliente termina");
	    }


	}


