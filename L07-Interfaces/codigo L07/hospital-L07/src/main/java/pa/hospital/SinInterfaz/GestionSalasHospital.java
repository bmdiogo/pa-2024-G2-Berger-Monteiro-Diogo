package pa.hospital.SinInterfaz;

public class GestionSalasHospital {
   public void reservarQuirofano(Quirofano quir) {
	   System.out.println("Reservando quirofano " +quir.getNum());
   }
   public void anularQuirofano(Quirofano quir) {
	   System.out.println("Anulando reserva de quirofano " +quir.getNum());
   }
   public void reservarSala(SalaVideo num) {
	   System.out.println("Reservando sala de video " +num.getSala());}
   public void anularSala(SalaVideo num) {
	   System.out.println("Anulando reserva de sala " +num.getSala());
   }
}
