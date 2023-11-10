package pa.repaso.ejercicio1;


/**
 * La clase Test1 pertence al paquete pa.repaso.ejercicio1,
 * esto lo indicamos en la PRIMERA LÍNEA del fichero ejercicio1.java,
 * y físicamente se encuentra en el directorio:
 *       src/main/java/pa/repaso/ejercicio1/Test1.java (de nuestro proyecto maven)
 * Para que no perteneciera a ningún paquete, la tendríamos que haber
 * creado en el directorio:
 *                  src/main/java/Test1.java
 * sin ninguna línea que indicase el paquete al que pertenece la clase
 * 
 */
public class Test1
{   
    public static void main(String args[]) {
        
       Doctor doctor1= new Doctor("Pedro","Cardiología",true);
       
       System.out.println("El doctor creado es de la especialidad \""+doctor1.getEspecialidad()+"\"");
       if (doctor1.atiendeUrgencias()) {
           System.out.println("El doctor atiende urgencias");
        } else {
            System.out.println("El doctor NO atiende urgencias");
        }
        
       doctor1.setNumPacientes(10);
       //Doctor NO tiene un getNumPacientes(), por lo que NO podemos consultar dicho valor
       System.out.println("El doctor tiene 10 pacientes");
       doctor1.setEspecialidad("Medicina interna");
       System.out.println("El doctor tiene la especialidad \""+doctor1.getEspecialidad()+"\"");
    }
}
