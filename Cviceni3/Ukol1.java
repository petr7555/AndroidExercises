public class Ukol1 {
    public static void main(String[] args) {
        
        String[] animals = {"Pes", "Kocka", "Mys"};
        //Prokladani textu textem
        for (String animal: animals) {
            for (int i = 0; i < animal.length(); i++) {
                System.out.print(animal.charAt(i)+"xx");
            }
            System.out.println();
        }
        //Zdvojeni kazdeho pismene
        for (String animal: animals) {
            for (int i = 0; i < animal.length(); i++) {
                System.out.printf("%c%c", animal.charAt(i), animal.charAt(i));
            }
            System.out.println();
        }
    }
}