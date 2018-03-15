import java.util.Arrays;

public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*int [][] pole1 = {{8},{9}};
        int[] pole2 = {1,5,46,65};
        pole2[0] = 48;
        pole1[0][0] = 4;
        System.out.println(pole1[0][0]); 
        
        int[] pole = new int[10];
        pole[0] = 1;
        for (int i = 0; i < 10; i++) {
            pole[i] = i +1;
        }
        for (int i = 0; i < pole.length; i++) {
            if (pole[i] % 2 == 0) {
                System.out.print(pole[i]+" ");
            }
        }    
        String[] name = {"Anna","Rudolf","Bob"}; 
        Arrays.sort(name);
        for (String one: name) {
            System.out.print(one+" "); 
        }
        char c;
        int i;
        c = 'a';
        i = (int) c;
        System.out.printf("Znak %c jsme převedli na hodnotu %d%n",c,i);
        i = 98;
        c = (char)i; 
        System.out.printf("Hodnotu %d jsme převedli na hodnotu %c",i,c);
        
        
        int[] pole = {8,-6,1,0,-3,11,3,-5};
        int sum = 0;
        int count = 0;
        int min = pole[0];
        int max = pole[0];
        for (int num: pole) {
            if (num < min) {
                min = num;
            }
            else if (num > max) {
                max = num;
            }
            if (num > 0) {
                sum += num;
                count += 1;
            }
        }
        System.out.print("Průměr: "+sum/count+"\n");
        System.out.print("Minimum: "+min+"\n");
        System.out.print("Maximum: "+max+"\n");
        
        Arrays.sort(pole);
        for (int num: pole) {
            System.out.print(num+" ");
        }
        int number = 20;
        int pozice = Arrays.binarySearch(pole, number);
        System.out.print("\n"+pozice+"\n");
        */
        int temp;
        int[] pole = {1,8,-6,1,0,-3,11,3,-5};
        for (int i = 0; i < pole.length-1; i++) {
            for (int j = 0; j < pole.length-1-i; j++) {
                if (pole[j+1] < pole[j]) {
                    temp = pole[j];
                    pole[j] = pole[j+1];
                    pole[j+1] = temp;
                }
            }
        }
        for (int num: pole) {
            System.out.print(num+" ");
        }
        
    }
    
}
