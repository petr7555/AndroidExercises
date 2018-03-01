import java.util.Scanner;  
public class Ukol3 {     
	public static void main( String[] args ) {        
		Scanner in = new Scanner(System.in);        	
        System.out.print("Which number would you like to double? ");           
		int number = in.nextInt();        	
        System.out.println(number * 2);     
	}  
}