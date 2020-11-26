package Week7;
import java.util.Scanner;
public class Exercise1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int count = 0; double sum = 0;
		
		while (count<6) {
			System.out.print("Enter your GPA for this semester: ");
			double gpa = sc.nextDouble();
			sum = sum+gpa;
			count = count+1;
		}
		
		double cgpa = (sum/24)*4.00;
		System.out.print("Your CGPA is " +cgpa);
		sc.close();
		
	}

}
