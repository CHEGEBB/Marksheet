package Mark;

public class Marksheet {

	public static void main(String[] args) {
		int score = 70;
		int total =score;
		float average;
		System.out.println("      Department of Computer Science        ");
		System.out.println("               End Semeter Results               ");
		String dot = new String(new char[48]).replace('\0', '.');
		System.out.println(dot);
		System.out.println("|Name:             |Roll_No:             Semester");
		String line = new String(new char[48]).replace('\0', '_');
		System.out.println(line);
		System.out.println("|Unit Code         |Unit Name:           Score");
		System.out.println(dot);
		System.out.println("|CCS2101           |Database             |"+score);
		score = 68;
		total+=score;
		System.out.println("|CCS2102           |Systems              |"+score);
		score = 74;
		total+=score;
		System.out.println("|CCS2103           |Algorithm            |"+score);
		score = 65;
		total+=score;
		System.out.println("|CCS2104           |statistics           |"+score);
		System.out.println(dot);
		System.out.println("|Total                                   |"+total);
		System.out.println(dot);
		average = (float)total/4;
		System.out.println("|Average                                 |"+average);
		System.out.println(dot);
		System.out.println("|Grade                                   |A");
		System.out.println("                           Recommendation|");
		System.out.println(dot);
		System.out.println("Grading Criteria        Overall Grade(A-D)   Recommend Pass");
		System.out.println("70-100     A");
		System.out.println("60-69      B");
		System.out.println("50-59      C");
		System.out.println("40-49      D");
		System.out.println("Below 40   F");
		System.out.println(dot);
		

				
	}

}
