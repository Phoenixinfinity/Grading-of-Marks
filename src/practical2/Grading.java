package practical2;
import java.util.Scanner;

public class Grading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Grading of Students as per the marks obtained.
		int marks;
		System.out.println("Enter the marks obtained : ");
		Scanner obj = new Scanner(System.in);
		marks = obj.nextInt();
		if (marks>=80)
		{
			System.out.println("Your Grade is : A");
		}
		else if (marks<=80 && marks>=60)
		{
			System.out.println("Your Grade is : B");
		}
		else if (marks<=60 && marks>=40)
		{
			System.out.println("Your Grade is : C");
		}
		else if (marks<=40 && marks>=35)
		{
			System.out.println("Your Grade is : D");
		}
		else
		{
			System.out.println("Your Grade is : FAIL");
		}

	}

}
