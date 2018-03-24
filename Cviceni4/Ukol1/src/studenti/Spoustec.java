package studenti;

public class Spoustec {
	static Student[] studenti = new Student[5];
	
	public static void main(String[] args) {
		
		pridej(0, "Petr", 18);
		pridej(1, "Ota", 24);
		pridej(2, "Anna", 12);
		pridej(3, "Zdenìk", 71);
		pridej(4, "Pavlína", 4);
		//vypis();
		serad("vek");
		vypis();
		System.out.println(".............");
		serad("ID");
		vypis();
		//smaz(2);
		
	}
	
	public static void vypis() {
		for (Student s: studenti) {
			System.out.println(s);
		}
	}
	
	public static void pridej(int i, String jmeno, int vek) {
		studenti[i] = new Student(jmeno, vek);
		
	}
	
	public static void smaz(int i) {
		studenti[i] = null;
		
	}
	
	public static void serad(String param) {
		Student temp;
        for (int i = 0; i < studenti.length-1; i++) {
            for (int j = 0; j < studenti.length-1-i; j++) {
            	if (param == "ID") {
            		if (studenti[j+1].getID() < studenti[j].getID()) {
            			temp = studenti[j];
            			studenti[j] = studenti[j+1];
            			studenti[j+1] = temp;
            		}
                } else if (param == "vek") {
            		if (studenti[j+1].getVek() < studenti[j].getVek()) {
            			temp = studenti[j];
            			studenti[j] = studenti[j+1];
            			studenti[j+1] = temp;
            		}
                }
            }
        }
		
	}

}
