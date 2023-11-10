package pa.sorting;

import pa.interfaces.IOrdenable;

/**
 * Write a description of class Contry here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Country implements IOrdenable
{
    // instance variables - replace the example below with your own
    private String name;

    /**
     * Constructor for objects of class Contry
     */
    public Country(String name)
    {
        // initialise instance variables
        this.name = name;
    }
    
    public String getName() {
        return name;
    }

	@Override
	public boolean menorQue(IOrdenable iordenable1) {
		// Lo ordenamos por nombre
		Country pais=(Country) iordenable1; //cast introduce iordenable y lo trata como un Country
		return  (name.compareTo(pais.getName())<0) ;//sacar el if, no cal crear variable, el compareto devuelve el bool

		
		
	}

   
}
