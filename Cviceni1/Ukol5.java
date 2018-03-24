import java.util.Scanner;
public class Ukol5{

     public static void main(String []args){
        try { 
            Scanner in = new Scanner(System.in);
            System.out.print("Text or Number! "); 
            /*
            String choosen = in.nextLine();  
            int choosen2 = Integer.parseInt(choosen);
            */
            int choosen = in.nextInt();
			System.out.format("This is number.%n");
		} catch (Exception e) {  
			System.out.format("This is text.%n");
        		}
     }
}
