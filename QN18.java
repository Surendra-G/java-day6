package workshop6;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class QN18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input  = new Scanner(System.in);
		System.out.println("Enter your filename: ");
		String textfile = input.nextLine();
		String demo = "[a-zA-Z]+\\.txt";
		Pattern p = Pattern.compile(demo);
		
		Matcher m = p.matcher(textfile);
		if(m.matches()== true) {
			System.out.println("File is in .txt format.");
		}else {
			System.out.println("Name is not in .txt format.");
		}
	}

}
