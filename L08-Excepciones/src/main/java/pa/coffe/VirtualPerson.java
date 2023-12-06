package pa.coffe;

import pa.excepciones.TooColdException;
import pa.excepciones.TooHotException;

public class VirtualPerson  {
	private static final int TOO_COLD=35;
	private static final int TOO_HOT=85;
	private String name;
	public VirtualPerson(String name) {
		
		this.name = name;
	}
	public VirtualPerson() {}
	public String getName() {
		return name;
	}
	public void drinkCoffee(CoffeeCup cup) throws TooColdException,TooHotException {
		
		System.out.println(name+ " : me voy a tomar un café ");
		if (cup.getTemperature()<=TOO_COLD){
			throw new TooColdException(name + " :El café está a " + cup.getTemperature()+"grados: Demasiado FRÍO");
		}
		if (cup.getTemperature()>= TOO_HOT) {
			throw new TooHotException (name + " :El café está a " + cup.getTemperature()+"grados: Demasiado CALIENTE");
	}

}}

