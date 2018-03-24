package studenti;

public class Student {
	private String jmeno;
	private int vek;
	private int randomID;
	
	Student(String jmeno, int vek) {
		this.jmeno = jmeno;
		this.vek = vek;
		this.randomID = (int) (Math.ceil(Math.random() * 100));
	}
	
	public int getID() {
		return randomID;
	}
	
	public int getVek() {
		return vek;
	}
	
	public String toString() {
		String text = "Student: " + jmeno + ", vìk: " + vek + ", ID: " + randomID + ".";
		return text;
	}
	
}
