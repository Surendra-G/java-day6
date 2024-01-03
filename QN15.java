package workshop6;

public class QN15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] age = {10,20,25,24,28,27,30,31,32};
//    	try {
//    		System.out.println(age[10]);
//    	}catch(Exception e) {
//    		System.out.println("Error is: "+e);
//    	}
		if (age.length>=9) {
			 throw new ArrayIndexOutOfBoundsException("Array index is out of bounds.");
		}else {
			 System.out.println(age[9]);
		}

	}

}
