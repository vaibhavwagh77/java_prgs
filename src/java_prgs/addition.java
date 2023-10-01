package java_prgs;
import java.util.Scanner;


public class addition {
	public static void main(String args[]) {
		int a,b,sum;
		Scanner sc= new Scanner(System.in);
		System.out.println("1st number");
		a = sc.nextInt();
		System.out.println("2nd number");
		b= sc.nextInt();
		sum= a+b;
		System.out.println("the addition is "+sum);
		if (sum==10){
			System.out.println("you are done");
		}
		else if(sum==20){
			System.out.println("yes done");
		}
		else
			System.out.println("you are not done");
		
	}

}
