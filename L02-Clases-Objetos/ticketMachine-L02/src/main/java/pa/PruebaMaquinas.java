/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pa;


public class PruebaMaquinas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    	TicketMachine m1=new TicketMachine(20);
    	TicketMachine m2=new TicketMachine(30);
    	TicketMachine m3=new TicketMachine(40);
    	System.out.println("\nMaquina1. Precio ticket = "+m1.getPrice());
    	System.out.println("\nMaquina2. Precio ticket = "+m2.getPrice());  	
    	System.out.println("\nMaquina3. Precio ticket = "+m3.getPrice()); 
    	System.out.println("\nMaquina1. Insertamos 10.");
    	System.out.println("\nMaquina1. Insertamos 5.");
    	m1.insertMoney(10);
    	m1.insertMoney(5);
    	System.out.println("\nMaquina1. Monedas insertadas: " + m1.getBalance());
    	System.out.println("\nMaquina1. Solicitamos ticket.");
    	m1.printTicket();
    	System.out.println("\nMaquina2. Insertamos 10.");
    	System.out.println("\nMaquina2. Insertamos 30.");
    	m2.insertMoney(10);
    	m2.insertMoney(30);
    	System.out.println("\nMaquina2. Monedas insertadas: " + m2.getBalance());
    	System.out.println("\nMaquina2. Solicitamos ticket.");
    	m2.printTicket();
    	System.out.println("\nMaquina3. Insertamos 20.");
    	System.out.println("\nMaquina3. Insertamos20.");
    	m3.insertMoney(20);
    	m3.insertMoney(20);
    	System.out.println("\nMaquina3. Monedas insertadas: " + m3.getBalance());
    	System.out.println("\nMaquina3. Solicitamos ticket.");
    	m3.printTicket();
    	System.out.println("\nMaquina2. Insertamos 20.");
    	m2.insertMoney(20);
    	System.out.println("\nMaquina2. Monedas insertadas: " + m2.getBalance());
    	System.out.println("\nMaquina2. Solicitamos ticket.");
    	m2.printTicket();
    	
    	System.out.println("Total recaudado por Máquina 1: " +m1.getTotal());
    	System.out.println("Total recaudado por Máquina 2: " +m2.getTotal());
    	System.out.println("Total recaudado por Máquina 3: " +m3.getTotal());
    	System.out.println("\nMaquina2. Insertamos 80.");
    	m2.insertMoney(80);
    	System.out.println("\nMaquina2. Monedas insertadas: " + m2.getBalance());
    	System.out.println("Solicitamos devolución.");
    	m2.refundBalance();
    	System.out.println("\nTotal recaudado por Máquina 1: " +m1.getTotal());
    	System.out.println("Total recaudado por Máquina 2: " +m2.getTotal());
    	System.out.println("Total recaudado por Máquina 3: " +m3.getTotal());
    }
    
}
