package pa.servidor;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import pa.MailItem;
import pa.datos.*;

public class MailServerSocket {
	private MailServer servidorCorreo;
	public MailServerSocket() {
		ArrayList<MailItem> lista=new ArrayList<>();
		lista=Mensajes.mensajesPrueba1;
	}
	public void servirMensajes(String nombre,ObjectOutputStream msgs) {
		try {
			
		 FileOutputStream fileOut=new FileOutputStream("fichero.txt");
		 ObjectOutputStream oos= new ObjectOutputStream(fileOut);
		  oos.writeObject(msgs);
	}
		catch(IOException e){
			e.printStackTrace();
			
		}
			
		}

	public static void main(String[] args) {
		 
	}

}
