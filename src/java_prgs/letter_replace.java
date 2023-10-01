package java_prgs;

public class letter_replace {
	public static void main(String args[]) {
		String letter= "Dear <|name|>Thanks a lot";
		System.out.println(letter);
		letter= letter.replace("<|name|>","Vaibhav sd");
		System.out.println(letter);
	}

}
