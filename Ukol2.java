public class Ukol2
{ 	
	public static void main(String[] args) {
        int a,b;
        a = 14;
        b= -27;
        System.out.println("original value of a: " + a + " b: " + b);	
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("new value of a: " + a + " b: " + b);	
	}
}
