package workshop6;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class QN19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input  = new Scanner(System.in);
		System.out.println("Enter text: ");
		String text = input.nextLine();
		String demo = "^[A-Za-z][a-zA-Z0-9_]+{2,15}$";
		Pattern p = Pattern.compile(demo);
		
		Matcher m = p.matcher(text);
		if(m.matches()== true) {
			System.out.println("text is in correct format.");
		}else {
			System.out.println("text is not in correct format.");
		}
	}

}
