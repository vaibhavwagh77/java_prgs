package java_prgs;
import java.util.Scanner;
public class Sum_Three {
	public static void main(String args[]) {
		float a, b,c,sum;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the 1st number");
		a= sc.nextFloat();
		System.out.println("Enter the 2nd number");
		b= sc.nextFloat();
		System.out.println("Enter the 3rd number");
		c=sc.nextFloat();		
		sum= a+b+c;
		System.out.println("the answer is "+sum);
		
	}
}
