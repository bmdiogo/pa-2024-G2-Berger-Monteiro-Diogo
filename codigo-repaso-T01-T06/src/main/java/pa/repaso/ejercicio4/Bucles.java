package pa.repaso.ejercicio4;

/**
 * Write a description of class ClaseConErrores here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bucles
{   
    public void bucleQueNOFunciona() {
       int [] lista_enteros = new int[5];
       
       /* un bucle for-each no puede utilizarse para modificar el valor de los
         elementos del array, solamente podemos consultar dicho valor
       */  
       for (int entero: lista_enteros) {
           entero = 5;  
       } 
             
       //se mostrarán por pantalla "0 0 0 0 0"
       for (int entero: lista_enteros) {
           System.out.print(" "+entero+" ");
        }           
    }
    
    public void bucleQueFunciona() {
       int [] lista_enteros = new int[5];
       
       for (int i=0; i<5; i++) {
           lista_enteros[i] = 5;  
       }
       
       //se mostrarán por pantalla "5 5 5 5 5"
       for (int i=0; i<5; i++) {
           System.out.print(" "+lista_enteros[i]+" ");
        }            
    }
    
    
    /* Para abortar la ejecución de este método tienes que hacerlo pulsando sobre
       el icono con forma de cuadrado situado a la izquierda de la vista Output
     */  
    public void bucleInfinito() {
       int [] lista_enteros = new int[5];
       
       System.out.println("Atención: voya ejecutar un bucle infinito");
       System.out.println("Para detener el programa puedes hacerlo pulsando sobre el cuadrado rojo, ");
       System.out.println("que verás en la barra superior de iconos de la vista Console");
       
       int j=0;
       
       /*este bucle nunca termina porque no incrementamos el valor de j
         Siempre actualiza el valor de la posición 0 de la lista de enteros
        */ 
       while (j< 5) {
           lista_enteros[j] = 5;  
       } 
      
       
       /* Nunca se ejecutará este bucle, por lo que el método no mostrará 
          nada por pantalla */
       for (int i=0; i<5; i++) {
           System.out.print(" "+lista_enteros[i]+" ");
        }       
    }
    
    public static void main(String args[]) {
        
        Bucles bucles = new Bucles();
     
        System.out.println("Voy a ejecutar el bucle que no funciona. Se mostrarán valores cero");
        bucles.bucleQueNOFunciona();
        System.out.println("\n----------------------------------------\n");
        
        System.out.println("Voy a ejecutar el bucle que funciona");
        bucles.bucleQueFunciona();
        System.out.println("\n----------------------------------------\n");
        
        bucles.bucleInfinito();        
    }
    
    
}
