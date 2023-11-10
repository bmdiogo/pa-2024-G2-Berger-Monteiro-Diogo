package pa.repaso.ejercicio1;

import java.util.ArrayList;
/**
 * Write a description of class test2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Test2 {
    public static void main(String args[]) {
        Doctor doctor1 = new Doctor("Alvaro","Otorrino",false);
        
        Paciente pac;
        for(int i=1;i<21;i++){
            if (i<10) {
                  pac = new Paciente("pac00"+i);
            } else {
                  pac = new Paciente("pac0"+i);
            }
            doctor1.addPaciente(pac);
        }
        
        /* Ahora vamos a mostrar los elementos de la lista de pacientes 
           para ver si los hemos añadido correctamente. 
           Este código (líneas 30..41) no se pide en el enunciado, 
           simplemente es parar que comprobéis que la implementación de
           addPaciente() es correcta 
        */   
        ArrayList<Paciente> pacientes;
        pacientes=doctor1.getListaPacientes();
        System.out.println("La lista de pacientes antes de borrar es: ");
        int numero_de_linea=1;
        for (Paciente paciente:pacientes) {            
            System.out.print(" "+paciente.getIdentificador()+" ,");
            if ((numero_de_linea %5) == 0) {
                System.out.println();
            } 
            numero_de_linea++;   
        }
        System.out.println();
        
        /* Vamos a borrar los pacientes cuyo identificador coincida con los 
          del array de identificadores */
        String []identificadores = {"pac005", "pac013", "pac017", "pac050", "pac076"};
        for (String id:identificadores) {         
            doctor1.remove_paciente(id);       
        }  
        System.out.println();
        
        /* vamos a mostrar los elementos de la lista de pacientes para comprobar 
           que los hemos borrado correctamente. 
           El código de las líneas 57..66 no se pide en el enunciado, 
           simplemente es parar que comprobéis que la implementación de
           remove_paciente() es correcta 
        */   
        pacientes=doctor1.getListaPacientes();
        System.out.println("La lista de pacientes después de borrar es: ");
        numero_de_linea=1;
        for (Paciente paciente:pacientes) {
            System.out.print(" "+paciente.getIdentificador()+" ,");
            if ((numero_de_linea %5) == 0) {
                System.out.println();
            }
            numero_de_linea++;  
        }
        System.out.println();
    } 
     
}
