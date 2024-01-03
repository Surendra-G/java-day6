package workshop6;
import java.util.regex.*;
import java.util.Scanner;

public class QN16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input  = new Scanner(System.in);
		System.out.println("Enter your name: ");
		String name = input.nextLine();
		String demo = "[a-zA-Z0-9]+";
		Pattern p = Pattern.compile(demo);
		
		Matcher m = p.matcher(name);
		if(m.matches()== true) {
			System.out.println("Name is in correct format.");
		}else {
			System.out.println("Name is not in correct format.");
		}
		
		
	}

}
