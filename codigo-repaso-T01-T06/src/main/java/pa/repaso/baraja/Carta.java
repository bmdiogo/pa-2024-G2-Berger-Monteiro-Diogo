package pa.repaso.baraja;

public class Carta {
    private int numero;
    private String palo;
    
    public Carta(int numero, String palo) {
        this.numero = numero;
        this.palo = palo;
    }
    
    public int numero() {
        return numero;
    }

    public String palo() {
        return palo;
    }
}
