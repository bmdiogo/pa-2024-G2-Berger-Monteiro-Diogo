package pa;

/**
 * TicketMachine models a naive ticket machine that issues
 * flat-fare tickets.
 * The price of a ticket is specified via the constructor.
 * It is a naive machine in the sense that it trusts its users
 * to insert enough money before trying to print a ticket.
 * It also assumes that users enter sensible amounts.
 *
 * @author David J. Barnes and Michael Kölling
 * @version 2016.02.29
 */
public class TicketMachine
{
    // The price of a ticket from this machine.
    private int price;
    // The amount of money entered by a customer so far.
    private int balance;
    // The total amount of money collected by this machine.
    private int total;
    // Lo que sobra o falta
    private int x;

   

    /**
     * Create a machine that issues tickets of the given price.
     * Note that the price must be greater than zero, and there
     * are no checks to ensure this.
     */
    public TicketMachine(int cost)
    {
        price = cost;
        balance = 0;
        total = 0;
   
    }

    /**
     * Return the price of a ticket.
     */
    public int getPrice()
    {
        return price;
    }

    /**
     * Return the amount of money already inserted for the
     * next ticket.
     */
    public int getBalance()
    {
        return balance;
    }

    /**
     * Receive an amount of money from a customer.
     */
    public void insertMoney(int amount)
    {
        balance = balance + amount;
    }
    

    /**
     * Print a ticket.
     * Update the total collected and
     * reduce the balance to zero.
     */
    public void printTicket()
    {  // comprobaciones
      if (balance==price) {
        System.out.println("##################");
        System.out.println("# Ticket");
        System.out.println("# " + price + " cents.");
        System.out.println("##################");
        System.out.println();
        total= total + price;//añadir el precio del ticket a las ganancias
        balance=0;//no hay cambio
      }
      else if(balance>price) {
    	  x=balance-price;
        	System.out.println("Le sobran " + x + "céntimos. Puede solicitar la devolución");
        	System.out.println("##################");
            System.out.println("# Ticket");
            System.out.println("# " + price + " cents.");
            System.out.println("##################");
            System.out.println();
            total= total + price;//añadir el precio del ticket a las ganancias
            balance=x;// el cambio
        }
      else {
    	  x= price - balance;
    	  System.out.println("Introduzca al menos " + x + " centimos mas");
      }
        	

        // Update the total collected with the balance.
        total = total + balance;
        // Clear the balance.
        balance = 0;
    }  
    
    
    public int getTotal() {
        return total;
    }
    public void refundBalance() {
    	balance=0;
    }
}
    
