package zdraveni;

public class Program { 	
	public static void main(String[] args) {
		Zdravic zdravic = new Zdravic();
		zdravic.text = "Ahoj u�ivateli";
        zdravic.pozdrav("Karel");
        zdravic.pozdrav("Petr");
        zdravic.text = "V�t�m t� tu program�tore";
        zdravic.pozdrav("Richard");
    }
}
