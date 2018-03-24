package zdraveni;

public class Program { 	
	public static void main(String[] args) {
		Zdravic zdravic = new Zdravic();
		zdravic.text = "Ahoj uživateli";
        zdravic.pozdrav("Karel");
        zdravic.pozdrav("Petr");
        zdravic.text = "Vítám tì tu programátore";
        zdravic.pozdrav("Richard");
    }
}
