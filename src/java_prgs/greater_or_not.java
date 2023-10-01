package java_prgs;
import java.util.Scanner;
public class greater_or_not {

	public static void main(String[] args) {
		int a,b;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number a");
		a=sc.nextInt();
		System.out.println("Enter the Number b");
		b=sc.nextInt();
		if(a>b) {
			System.out.println("a is greater then b");
		}
		else if(a<b) {
			System.out.println("b is greater then a");
		
		}
		else {
			System.out.println("a and b is equal");
		}
	}

}
