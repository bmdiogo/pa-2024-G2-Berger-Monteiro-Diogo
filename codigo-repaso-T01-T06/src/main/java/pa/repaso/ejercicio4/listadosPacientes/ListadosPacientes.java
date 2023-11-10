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
public class ListadosPacientes {

    /**
     * Dados como entrada una serie de Pacientes y la información, para cada
     * paciente de qué día ha acudido al centro a una cita con el médico. 
     * Por ejemplo: {3,3,4,0} significa que el paciente ha acudido dos veces
     * el jueves ({3,3}), una vez el viernes ({4}), y una vez el lunes ({0})
     * <p>
     * Se pide: (a)Mostrar por pantalla una tabla para un Paciente, mostrando los días
     * de la semana y cuántas veces ha acudido a una cita ese día
     * <p>
     * (b)Mostrar por pantalla una tabla que muestr los días de la semana, y
     * el total de visitas de Pacientes al centro
     * 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] nombres = {"Pedro", "Luis", "Rosario", "Ana", "Pepe",
                            "Ismael", "Virginia", "Rosa", "Olegario"};
        
        Paciente[] listaPacientes = new Paciente[9];
        Paciente paciente;
        //creamos 10 pacientes con sus respectivos nombres
        for (int i=0; i<nombres.length; i++) {
            paciente = new Paciente(nombres[i]);
            listaPacientes[i] = paciente;
        }
        
        /*creamos arrays con los días que han acudido al médico los
          pacientes Pedro, Luis y Rosario
          visitasRosario={0,0,3} significa que ha ido al médico tres veces:
          2 veces el lunes (valor 0), y 1 vez el jueves (valor 3)
        */
        int[] visitasPedro = {3,4,7,10,0,1,2,4};
        int[] visitasLuis = {3,2,1,4,2,2,6};
        int[] visitasRosario = {0,0,3};
        
        System.out.println("Visitas de Pedro: {3,4,7,10,0,1,2,4}");
        //registramos las visitas de Pedro
        for (int i=0; i<visitasPedro.length; i++) {
            listaPacientes[0].registrarVisita(visitasPedro[i]);
        }  
        //mostramos las visitas de Pedro
        listaPacientes[0].imprimirVisitas();
        
        System.out.println("Visitas de Luis: {3,2,1,4,2,2,6}");
        //registramos las visitas de Luis
        for (int i=0; i<visitasLuis.length; i++) {
            listaPacientes[1].registrarVisita(visitasLuis[i]);
        }
        //mostramos las visitas de Luis
        listaPacientes[1].imprimirVisitas();
        
        System.out.println("Visitas de Rosario: {0,0,3}");
        //registramos las visitas de Rosario
        for (int i=0; i<visitasRosario.length; i++) {
            listaPacientes[2].registrarVisita(visitasRosario[i]);
        }
        //mostramos las visitas de Rosario
        listaPacientes[2].imprimirVisitas();
        
        int[] totalVisitas = new int[5];
        int[] visitasPaciente = new int[5];
        
        //para cada paciente obtenemos su lista de visitas y la
        //acumulamos en totalVisitas
        for (int i=0; i<listaPacientes.length; i++) {
            visitasPaciente = listaPacientes[i].getTotalVisitas();
            
            for (int j=0; j<visitasPaciente.length; j++) {
                totalVisitas[j]=totalVisitas[j]+ visitasPaciente[j];
            }   
        }
        
        // imprimimos las visitas totales
        String[] diasSemana = {"Lunes", "Martes", "Miércoles", "Jueves", "Viernes"};
        
        System.out.println();
        System.out.println("Listado Total de visitas");
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
