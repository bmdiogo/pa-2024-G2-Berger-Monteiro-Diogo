package pa.hospital;
import pa.hospital.ConInterfaz.*;
public class DemoConInterfaz {

	public static void main(String[] args) {
		final IGestion q1=new Quirofano();
		final IGestion q2=new Quirofano();
		final 	IGestion q3=new Quirofano();
		q1.reservar();
		q2.reservar();
		q3.reservar();
		q1.anular();
		q2.anular();
		q3.anular();
		IGestion s1= new SalaVideo();
		IGestion s2= new SalaVideo();
		IGestion s3= new SalaVideo();
		s1.reservar();
		s2.reservar();
		s3.reservar();
		s1.anular();
		s2.anular();
		s3.anular();

		
		

	}

}
