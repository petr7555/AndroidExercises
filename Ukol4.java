import java.util.Scanner;  
public class Ukol4{    
	public static void main( String[] args ) {
	    double randomNum = Math.floor(Math.random() * 9) + 1;
		Scanner in = new Scanner(System.in);        	
        System.out.print("Do you prefer 1) square or 2) circle? (type 1 or 2) ");           
		int shape = in.nextInt();        	
		System.out.print("Would you like to know its 1) circumference or 2) surface? (type 1 or 2) ");
		int cirOrSurf = in.nextInt();
		double result;
		if (shape == 1) {
		    if (cirOrSurf == 1) {
		        result = 4 * randomNum;
		        System.out.println("The circumference of square with side = " + randomNum + " is " + result + "."); 
		    }
		    else {
		        result = randomNum * randomNum;
		         System.out.println("The surface of square with side = " + randomNum + " is " + result + ".");
		    }
		}
		else if (cirOrSurf == 1) {
		    result = 2 * 3.14 * randomNum;
		     System.out.println("The circumference of circle with radius = " + randomNum + " is " + result + ".");
		}
		else {
		    result = 3.14 * randomNum * randomNum;
		    System.out.println("The surface of circle with radius = " + randomNum + " is " + result + ".");
		}
	}  
}
