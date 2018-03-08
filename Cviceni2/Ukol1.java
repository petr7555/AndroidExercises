public class Ukol1
{ 	
	public static void main(String[] args) {
		int randomNum = (int) (Math.ceil(Math.random() * 6));
        int sum = 0;
        while (randomNum % 2 == 0) {
            System.out.println(randomNum);
            sum += randomNum;
            randomNum = (int) (Math.ceil(Math.random() * 6));
        }
        System.out.println("Sum: " + sum);	
	}
}
