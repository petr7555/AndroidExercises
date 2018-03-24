package zdraveni;

public class Zdravic {
    public String text;

    public void pozdrav(String jmeno) {
        System.out.format("%s %s \n", text, jmeno);
    }
}