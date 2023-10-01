
package java_prgs;
import java.util.Scanner;
public class Km_Miles {

	public static void main(String[] args) {
		float a,result;
	
		System.out.println("Enter the Disstance in km");
		Scanner sc= new Scanner(System.in);
		a= sc.nextFloat();
		result=(a*0.621371f);
		System.out.println("the miles covered is "+ result);

	}

}
