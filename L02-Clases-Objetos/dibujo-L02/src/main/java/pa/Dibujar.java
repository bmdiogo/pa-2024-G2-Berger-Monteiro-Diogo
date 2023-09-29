/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pa;


public class Dibujar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //String s
    	Circle sol;//def de la variable se pot poner Circle sol = new Circle();
    	Square azul= new Square();
    	Square verde =new Square();
    	Square rosa = new Square();
    	sol=new Circle();
    	Triangle rojo=new Triangle();
    	Triangle rojoo=new Triangle();

    	
    	azul.changeColor("blue");
    	azul.moveHorizontal(-230);
    	azul.moveVertical(40);
    	
    	verde.changeColor("green");
    	verde.moveHorizontal(60);
    	verde.moveVertical(40);
    	
    	sol.moveVertical(-60);
    	
    	rojo.moveHorizontal(-100);
    	rojo.moveVertical(-35);
    	
    	rojoo.moveHorizontal(190);
    	rojoo.moveVertical(-35);
    	
    	rosa.changeColor("magenta");
    	rosa.moveHorizontal(-230);
       
    	
    	
    	sol.makeVisible();
    	azul.makeVisible();
    	verde.makeVisible();
    	rojo.makeVisible();
    	rojoo.makeVisible();
    	rosa.makeVisible();

    	System.out.println("\n\n Ejercicio pendiente de realizar \n\n");
        
    }
    
}
