package pa.repaso.baraja;

import java.util.Scanner;

public class Demo {
	Scanner sc = new Scanner(System.in);
	
    public static void main(String[] args) {
        Baraja b, otraBaraja;
        Demo demo = new Demo();
              
        //creamos una baraja española de 40 cartas (sin 8s ni 9s)    
        b = demo.crearBarajaEspañolaDe40Cartas();
        b.imprimir(" (baraja b (antes de mezclar)");
        demo.pausarEjecucion();
        //barajamos usando el algoritmo 1
        b.mezclar_version1();
        b.imprimir(" (baraja b mezclada con version 1)");
        demo.pausarEjecucion();
        
        /*********************************************/
        
        //creamos otra baraja española de 40 cartas (sin 8s ni 9s)
        otraBaraja = demo.crearBarajaEspañolaDe40Cartas();
        otraBaraja.imprimir(" (otraBaraja (antes de mezclar)");
        demo.pausarEjecucion();
        //barajamos usando el algoritmo 2 (el resultado debe ser idéntico al algoritmo1
        otraBaraja.mezclar_version2();
        otraBaraja.imprimir(" (otraBaraja mezclada con version 2)");  
        demo.pausarEjecucion();
        
        demo.cerrarTerminal();
        
    }
    
    /**
     * Método para pausar la ejecución hasta que se pulse el retorno de carro
     * Este método no puede invocarse directamente desde el main() porque main() es
     * un método estático. Tendremos que crear una instancia de Demo para usarlo
     * Para poder invocar directamente a este método desde main() podríamos
     * haber creado el método pausarEjecución() como "static"
     */
    public void pausarEjecucion() {
        System.out.println("Pulse retorno para continuar ...");
        sc.nextLine(); //pausamos hasta que se pulse \n
    }
    
    public void cerrarTerminal() {
        sc.close();
    }
    
    /**
     * Método que usamos para crear una baraja española de 40 cartas
     * con los palos: oros, copas, espadas y bastos, y sin ochos ni nueves
     * @return un objeto de tipo Baraja con las cartas correspondientes
     * a la baraja española de 40 cartas.
     * El método debe ser estático porque se invoca desde main() que es 
     * un método estático.
     */
    public  Baraja crearBarajaEspañolaDe40Cartas() {
        String palo="";
        Carta c;
        
        Baraja b = new Baraja(40);
        
        for (int i=1; i<=4; i++) {  
            switch(i) {
                case 1: palo= "Oros"; break;
                case 2: palo= "Bastos"; break;
                case 3: palo= "Espadas"; break;
                case 4: palo= "Copas";
            }
        
            for (int j=1; j<=7; j++) {
               c=new Carta(j,palo);  
               b.addCarta(c);
            }
            for (int j=10; j<=12; j++) {
               c=new Carta(j,palo);  
               b.addCarta(c);
            }
        }
        return b;
    }
}
