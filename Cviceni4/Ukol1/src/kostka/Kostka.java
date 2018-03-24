package kostka;

public class Kostka {
	private int pocetSten;
	// private int randomHod;

	Kostka(int pocetSten) {
		this.pocetSten = pocetSten;
	}

	public int vratPocetSten() {
		return pocetSten;
	}

	public int hod() {
		int randomNum = (int) (Math.ceil(Math.random() * pocetSten));
		return randomNum;
	}

	public String toString() {
		String text = "Tato kostka má " + pocetSten + " stìn.";
		return text;
	}
}