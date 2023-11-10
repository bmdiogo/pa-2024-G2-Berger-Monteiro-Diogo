package pa.repaso.ejercicio1;


/**
 * La clase Doctor pertence al paquete pa.repaso.ejercicio1,
 * y físicamente se encuentra en el directorio:
 *                  src/main/java/pa/repaso/ejercicio1/Doctor.java
 * Para que perteneciera al paquete hospital.facultativos, tendríamos que
 * que haberla creado en el directorio:
 *                  src/main/java/hospital.facultativos/Doctor.java
 * y haber incluido en la primera línea el nombre del paquete:
 *                  package pa.hospital.facultativos;
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import java.util.ArrayList;
import java.util.Iterator;

public class Doctor
{
    /* Los atributos de la clase sirven para definir el ESTADO de los objetos
       El ESTADO de un objeto estará formado por los valores concretos de cada 
       uno de sus atributos en ese instante
    */ 
    private String nombre;
    private String especialidad;
    private int num_pacientes;
    private boolean urgencias;
        /* Apartado g) Modificamos la clase Doctor y añadimos un campo con una colección
           de longitud variable de pacientes (por eso debe ser un ArrayList)
           Deberíamos eliminar el atributo num_pacientes. 
           Este campo ya no es necesario ya que en cualquier momento podemos
           obtener dicho número simplemente invocando al método size() sobre la
           lista de Pacientes. 
           Lo vamos a mantener para que nos siga funcionando la invocación desde 
           la clase Test1. PERO LO CORRECTO SERÍA ELIMINAR el atributo num_pacientes,
           si tenemos el atributo listaPacientes.
        */   
    private ArrayList<Paciente> listaPacientes;

    /*El constructor sirve para INICIALIZAR el estado de los objetos creados
      En concreto este constructor inicializa el estado de un objeto de tipo 
      Doctor con los siguientes valores:
         -campo nombre: su valor es p_nombre que pasamos por parámetro
         -campo especialidad: su valor es p_especialidad que pasamos por parámetro
         -campo urgencias: su valor es p_urgencias que pasamos por parámetro
         -campo num_pacientes: Inicializaos a cero este campo para cada nueo objeto
    */     
    public Doctor(String p_nombre, String p_especialidad, boolean p_urgencias) {
        nombre= p_nombre;
        especialidad = p_especialidad;
        urgencias = p_urgencias;
        num_pacientes = 0;
        listaPacientes = new ArrayList<Paciente>();
        
    }
    
    public String getEspecialidad() {
        return especialidad;
    }
    
    public boolean atiendeUrgencias() {
        return urgencias;
    }
    
    public void setNumPacientes(int numero) {
        num_pacientes = numero;
    }
    
    public void setEspecialidad(String espec) {
        especialidad = espec;
    }
    
    public void addPaciente(Paciente pac) {
        listaPacientes.add(pac);
    }
    
    public void remove_paciente(String identificador) {
       boolean encontrado = false;
       Paciente paciente;
       Iterator it = listaPacientes.iterator();
       /* Usamos un bucle while puesto que no sabemos con certeza
          el número de iteraciones que vamos a realizar.
          Podeís usar un bucle while con un Iterator, o sin él.
          Es indiferente */
       while(it.hasNext() && !encontrado) {
           paciente = (Paciente) it.next();
           if (paciente.getIdentificador().equals(identificador)) {
               encontrado= true;
               listaPacientes.remove(paciente);
            }    
       }
       if (!encontrado) {   
           System.out.println("Error: el paciente con identificador "+
              identificador+ " no existe");
       }       
    }
    
    /* Añadimos este método para incluirlo en la clase Test2 y 
      comprobar que hemos eliminado correctamente los pacientes
     */  
    public ArrayList<Paciente> getListaPacientes() {
        return listaPacientes;
    }    
}
