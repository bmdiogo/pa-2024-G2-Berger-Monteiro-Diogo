package pa;
import java.util.ArrayList;
import java.util.Arrays;
import GradeBook;
public class Demo {

	public static void main (String[] args) {
		GradeBook gradebook= new GradeBook("MATES",new int[] {65,10,12,45,55,78, 3, 99, 74, 88,0, 66, 52, 43, 75,87, 45, 53, 58, 51,50, 100, 19, 40});
		System.out.println(gradeBook.getCourseName()); // Mates
		System.out.println(gradeBook.getMinimum()); // 0
		System.out.println(gradeBook.getMaximum()); // 90
		System.out.println(gradeBook.getAverage()); // 50.0

		gradeBook.printBarChart()
		
	}

}

