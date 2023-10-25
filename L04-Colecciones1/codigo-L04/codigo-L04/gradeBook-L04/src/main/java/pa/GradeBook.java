package pa;

import java.util.ArrayList;
import java.util.Arrays;
public class GradeBook {

	private String courseName;
	private int[] grades;
	
	
	public  GradeBook(String courseName,int grades[]) {
		this.courseName=courseName;
		this.grades=grades;
	}
	public void setCourseName(String course) {
		course=courseName;
	}
	public String getCourseName() {
		return courseName;
	}
	public processGrades() {
		
	}
	public int getMinimun() {
	minimo=grades.get(0);
		for (int nota:grades) {
			if (nota<minimo) {
				minimo=nota;
		}
	return minimo;
	
	}
	
	public int getMaximun() {
	     maximo=grades.get[0];
		for (int nota:grades) {
			if (nota>maximo) {
				maximo=nota;
		}
		return maximo;
		
	}
	public double getAverage() {
		size=grades.size
		suma=0
		for (int nota:grades) {
			suma+= nota;
		}
		media= suma/size;
		return media;
			
	}
	public void printBarchart() {
		System.out.println("Histograma de notas de la asignatura: " + courseName);
		int intervalos= new int[10];
		for (int nota:grades) {
			intervalos(grade/10++); // contador de intervalo
		}
		for (int i=0, i<intervalos.lenght,i++) {
			System.out.println(String.format("%02d-%02d; %d", i*10,i*10+9,intervalos[i]));
		}
			
	}
	public void printGrades(){
		
	}
}
