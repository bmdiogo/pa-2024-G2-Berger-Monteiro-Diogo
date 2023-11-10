/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pa.repaso.ejercicio4.listadosPacientes;

/**
 *
 * @author eli
 */
public class Paciente {
    String nombre;
    /*número de veces que el paciente a ido a la consulta cada día
     totalVisitas[0]= veces que ha asistido el lunes ...
     totalVisitas[4]= veces que ha asistido el viernes
    */
    int[] totalVisitas=new int[5];  
   
    public Paciente(String nombre) {
        this.nombre = nombre;
        for (int i=0; i< totalVisitas.length; i++) {
           totalVisitas[i] = 0; 
        }
    }
    
    public void registrarVisita(int dia) {
        if ((dia >=0) && (dia <=4)) {
          totalVisitas[dia] = totalVisitas[dia]+1;
        } else {
            System.out.println("Error datos "+nombre+" :El día no puede ser "+ dia+ " ,debe ser un valor entre 0 y 4");
        }
    }
    
    public int[] getTotalVisitas() {
        return totalVisitas;
    }
    
    public void imprimirVisitas() {
        String[] diasSemana = {"Lunes", "Martes", "Miércoles", "Jueves", "Viernes"};
        
        System.out.println();
        System.out.println("Listado de visitas de "+ nombre);
        //imprimimos la cabecera
        for (int i=0; i<totalVisitas.length; i++) {
            System.out.printf("%10s", diasSemana[i]);
        } 
        System.out.println();
        for (int i=0; i<totalVisitas.length; i++) {
            System.out.printf("%10d", totalVisitas[i]);
            //System.out.printf("%"+(8+i)+"d", totalVisitas[i]);
        }
        System.out.println();
        System.out.println();       
    }
    
}
