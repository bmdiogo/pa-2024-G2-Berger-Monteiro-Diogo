package pa;

import java.util.ArrayList;

import pa.coffe.*;

public class Demo_Coffee {

	public static void main(String[] args) {
		String[] tempss= {"aaa","","20","95", "75", "18", "35.7", "55"};
		ArrayList<CoffeeCup> cafes=new ArrayList<>();
		for(String valor:tempss) {
			try {
			int temp=Integer.parseInt(valor);
			CoffeeCup cafe=new CoffeeCup(temp);
			cafes.add(cafe);
			 System.out.println("La entrada con valor: " + temp + " es correcta");
			
		}
			catch(NumberFormatException e){
				System.out.println("El valor no es valido");
			}
		}
	    System.out.println(cafes);
	    VirtualCafe dg=new VirtualCafe("Dolche Gusto");
		
	    String[] clientes = {"", "Roberto","Verónica","Alberto","María"};
	    for(String cliente:clientes) {
	    	VirtualPerson p=new VirtualPerson(cliente);
	    	dg.addClient(p, true);
	    }
	    System.out.println("Tenemos que atender a los siguientes clientes: ");
	    for(VirtualPerson c:dg.getClientes()) {
	    	
	    	System.out.println("-"+c.getName());
	    	
	    }
	   while(cafes.size()!=0) {
	    	if(dg.serveCustomer(dg.getNextClient(),cafes.get(0))) {
	    		dg.cobrarCafe(true);
	    		
	    	};
	    	cafes.remove(0);
	    }
	    System.out.println(dg.getGanancias());

	}


}
