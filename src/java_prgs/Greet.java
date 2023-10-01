package java_prgs;
import java.util.Scanner;

public class Greet {

	public static void main(String args[]) {
		System.out.println("What is your name");
		Scanner sc= new Scanner(System.in);
		String name= sc.next();
		
		System.out.println("hello " + name + " have a great day");
	}

} 
