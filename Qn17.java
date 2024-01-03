package workshop6;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Qn17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input  = new Scanner(System.in);
		System.out.println("Enter your name: ");
		String name = input.nextLine();
		String demo = "[A-Z]+[a-z]+";
		Pattern p = Pattern.compile(demo);
		
		Matcher m = p.matcher(name);
		if(m.matches()== true) {
			System.out.println("Name is in correct format.");
		}else {
			System.out.println("Name is not in correct format.");
		}
	}

}
