package pa;

public class GradeBook {

	private String courseName;
	private int[] grades;
	
	
	public  GradeBook(String courseName,int grades[]) {
		this.courseName=courseName;
		this.grades=grades;
	}
	public setCourseName(String course) {
		this.course=courseName;
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
		maximo=grades.get(0);
		for (int nota:grades) {
			if (nota>maximo) {
				maximo=nota;
		}
		return maximo;
		
	}
	public double getAverage() {
		size=grades.length
		suma=0
		for (int nota:grades) {
			suma+= nota;
		}
		media= suma/size;
		return media;
			
	}
	public void printBarchart() {
		
	}
	public void printGrades(){
		
	}
}
