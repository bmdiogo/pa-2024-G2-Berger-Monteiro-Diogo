package pa.hospital.ConInterfaz;

public class SalaVideo implements IGestion {
	private String sala;
	private static int nextId=0;
	public SalaVideo() {
		sala="Sala de Vídeo-"+ nextId;
		nextId++;
		
	}
	public String getSala() {
		return sala;
	}
	@Override
	public void reservar() {
		System.out.println("Reservando Sala de video-" +sala);		
	}
	@Override
	public void anular() {
		System.out.println("Anulando Sala de video-" +sala);
		
	}
}
