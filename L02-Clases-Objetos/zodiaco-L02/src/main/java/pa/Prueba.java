
package pa;

public class Prueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    	
    	Zodiaco fecha1= new Zodiaco(23,9);
    	Zodiaco fecha2= new Zodiaco(9,40);
        Zodiaco fecha3= new Zodiaco(-3,8);
        Zodiaco fecha4= new Zodiaco(23,11);
        Zodiaco fecha5= new Zodiaco(21,1);
        Zodiaco fecha6= new Zodiaco(23,8);
        System.out.println(fecha1.getDia() +","+fecha1.getMes()+"---->"+fecha1.obtener_signo());
        System.out.println(fecha2.getDia() +","+fecha2.getMes()+"---->"+fecha2.obtener_signo());
        System.out.println(fecha3.getDia() +","+fecha3.getMes()+"---->"+fecha3.obtener_signo());
        System.out.println(fecha4.getDia() +","+fecha4.getMes()+"---->"+fecha4.obtener_signo());
        System.out.println(fecha5.getDia() +","+fecha5.getMes()+"---->"+fecha5.obtener_signo());
        System.out.println(fecha6.getDia() +","+fecha6.getMes()+"---->"+fecha6.obtener_signo());

    }
}    