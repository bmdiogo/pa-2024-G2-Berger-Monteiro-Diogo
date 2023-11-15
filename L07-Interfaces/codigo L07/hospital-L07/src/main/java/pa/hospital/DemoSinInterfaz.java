package pa.hospital;
import pa.hospital.SinInterfaz.*;

public class DemoSinInterfaz {

	public static void main(String[] args) {
		GestionSalasHospital gestion= new GestionSalasHospital();
		Quirofano q1= new Quirofano("Q1");
		Quirofano q2=new Quirofano("Q2");
		SalaVideo s1=new SalaVideo("S1");
		SalaVideo s2=new SalaVideo("S2");
		gestion.reservarQuirofano(q1);
		gestion.reservarQuirofano(q2);
		gestion.reservarSala(s1);
		gestion.reservarSala(s2);
		
		gestion.anularSala(s1);
		gestion.anularSala(s2);
		gestion.anularQuirofano(q1);
		gestion.anularQuirofano(q2);
			

	}

}
