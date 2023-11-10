package pa.repaso.baraja;

import java.util.ArrayList;

public class Baraja {
    ArrayList<Carta> cartas;
    int numCartas;
    
    
    public Baraja(int maxCartas) {
        cartas = new ArrayList<> ();
        numCartas = maxCartas;
    }
    
    public void addCarta (Carta c) {
        if (cartas.size() < numCartas) {
            cartas.add(c);
        }
    }
    /**
       * Método que mezcla las cartas de la baraja dividiéndola en
       * dos montones y a continuación se intercalan las cartas de cada montón
       * Esta versión usa un ArrayList para cada uno de los dos montones
    */
    public void mezclar_version1() {
        ArrayList<Carta> mitad1, mitad2, mezcladas;
        int medio = cartas.size()/2;
      
        mitad1 = new ArrayList<>();
        for (int i=0; i<medio;i++) {
            mitad1.add(cartas.get(i));
        }
        mitad2 = new ArrayList<>();
        for (int i=medio; i<cartas.size(); i++) {
            mitad2.add(cartas.get(i));
        }
        mezcladas = new ArrayList<>();
        
        for (int i=0; i< mitad1.size(); i++) {
           mezcladas.add(mitad1.get(i));
           mezcladas.add(mitad2.get(i));
        }
        if (cartas.size()%2 ==1) {
            mezcladas.add(mitad2.get(mitad2.size()-1));
        }
        cartas = mezcladas;        
    } 
    
    /**
       * Método que mezcla las cartas de la baraja dividiéndola en
       * dos montones y a continuación se intercalan las cartas de cada montón
       * Esta versión usa un único ArrayList
    */
    public void mezclar_version2() {
        ArrayList<Carta> mezcladas;
        int mitad;
        
        mitad = cartas.size()/2; 
        mezcladas = new ArrayList<>();
        for (int i=0; i< mitad; i++) {
            mezcladas.add(cartas.get(i));
            mezcladas.add(cartas.get(mitad+i));
        }
        
        if (cartas.size()%2 ==1) {
            mezcladas.add(cartas.get(cartas.size()-1));
        }
        cartas = mezcladas;   
    }
    
    public void imprimir(String optionalText) {
        System.out.println("\n -- Cartas "+optionalText+":");
        for(Carta c:cartas) {
            System.out.println(" "+c.numero()+ "-"+c.palo());
        }
        System.out.println();
    }
    
}
