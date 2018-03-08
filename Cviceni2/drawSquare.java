public class drawSquare {

    public static void main(String args[]) {
        int size = 5;
        Boolean full = false;

        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size; j++) {
                if (full == false) {
                    if (i == 1 || i == size) {
                        System.out.print("#");
                    } else if (j == 1 || j == size) {
                        System.out.print("#");
                    } else {
                        System.out.print(" ");
                    }
                } else {
                    System.out.print("#");
                }

            }
            System.out.print("\n");
        }
    }
}