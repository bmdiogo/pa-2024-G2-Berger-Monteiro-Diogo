/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pa.repaso.ejercicio4.personas2;

/**
 * Ejemplo2 con un for mejorado
 * 
 * @author eli
 */
public class Ejemplo2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] nombres = {"Maria", "Jose", "Ana", "Roberto", "Miguel", "Laura"};
        int[] edades = {14, 24, 18, 11, 7, 25};
        Persona[] grupo = new Persona[6];
 
        for (int i = 0; i< grupo.length; i++){
           grupo[i] = new Persona(nombres[i], edades[i]);
        }
        
        System.out.println("Listado de grupo de personas mayores de edad:");
        System.out.println("    Nombre      Edad");
        for (Persona p: grupo) {
            if (p.getEdad() >=18) {
                System.out.printf("%10s%10d%n", p.getNombre(),p.getEdad());
            }    
        }
    
    }
    
}
