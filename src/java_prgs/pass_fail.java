package java_prgs;
import java.util.Scanner;

public class pass_fail {
	public static void main(String args[]) {
		float sub1,sub2,sub3,total,a;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter marks of Subject 1");
		sub1=sc.nextInt();
		System.out.println("Enter marks of Subject 2");
		sub2=sc.nextInt();
		System.out.println("Enter marks of Subject 3");
		sub3=sc.nextInt();
		 total= (sub1+sub2+sub3)/3.0f;
		
		 if(total>=40 && sub1>=33 && sub2>=33 && sub3>=33){
			 System.out.println("the student is pass");
		 }
			 else {
				   System.out.println("the student is fail");
			 }
		 }
	}


