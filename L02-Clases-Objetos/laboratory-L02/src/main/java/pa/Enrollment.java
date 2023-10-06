/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pa;


public class Enrollment {

    
    public static void main(String[] args) {  //tendrás que usar sentencias System.out.println para incluir las líneas en rojo mostradas en el resultado
    	//de la ejecución de tu programa	
    	System.out.println("imprime la cadena y un retorno de carro");
    	System.out.print("imprime la cadena sin retorno de carro\n");
    	System.out.println(" Lista de estudiantes:\n");
    	Student estudiante1;
    	   estudiante1= new Student("Monica Geller","A00234");
    	   estudiante1.addCredits(24);
    	   System.out.println("Nombre:"+ estudiante1.getName() + "  ID:" + estudiante1.getStudentID() + " Creditos:" + estudiante1.getCredits());
       	
    	   Student estudiante2;
 	   estudiante2= new Student("Joe Tribiani","C22044");
 	   estudiante2.addCredits(56);
 	   System.out.println("Nombre:"+ estudiante2.getName() + "  ID:" + estudiante2.getStudentID() + " Creditos:" + estudiante2.getCredits());
    
 	   Student estudiante3;
	   estudiante3= new Student("Chandler BIng","A12003");
	   estudiante3.addCredits(6);
	   System.out.println("Nombre:"+ estudiante3.getName() + "  ID:" + estudiante3.getStudentID() + " Creditos:" + estudiante3.getCredits());
	   
	   Student estudiante4;
	   estudiante4= new Student("Rachel Green","B660003");
	   estudiante4.addCredits(12);
	   System.out.println("Nombre:"+ estudiante4.getName() + "  ID:" + estudiante4.getStudentID() + " Creditos:" + estudiante4.getCredits());
    
	   LabClass clase1;
	   clase1= new LabClass(2);
	   clase1.setInstructor("Eli");
	   clase1.setTime("Miércoles,15h");
	   clase1.setRoom("Aulario 2");
	   System.out.println("Enroll Students(ELi)\n");
	   clase1.enrollStudent(estudiante1);
	   clase1.enrollStudent(estudiante2);
	 
	   
	   LabClass clase2;
	   clase2= new LabClass(1);
	   clase2.setInstructor("Jose ANtonio");
	   clase2.setTime("Miercoles,17h");
	   clase2.setRoom("Aulario 2");
	   System.out.println("Enroll Students(Jose Antonio)\n");
	   clase2.enrollStudent(estudiante3);
	   clase2.enrollStudent(estudiante4);
	   clase1.printList();
	   clase2.printList();
	   
	   
    }
   
}
