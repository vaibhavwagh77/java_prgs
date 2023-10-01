package java_prgs;
import java.util.Scanner;

public class CGPA_Calculator {
	public static void main(String args[]) {
		float sub1,sub2,sub3,sub4,total,result,finalCGPA;
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the first marks");
		sub1 = sc.nextFloat();
		System.out.println("enter the first marks");
		sub2 = sc.nextFloat();
		System.out.println("enter the first marks");
		sub3 = sc.nextFloat();
		System.out.println("enter the first marks");
		sub4 = sc.nextFloat();
		total=sub1+sub2+sub3+sub4;
		System.out.println("The total marks are "+total);
		result= (total/4);
		System.out.println("The percentage is " +result);
		finalCGPA= (result/9.5f);
		System.out.println("The CGPA is "+finalCGPA);
		
	}

}
