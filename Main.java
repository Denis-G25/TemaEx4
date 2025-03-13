
public class Main {

	public static void main(String[] args) {
		
		Sertar sertar1 = new Sertar(8,7,9);
		Sertar sertar2 = new Sertar(6,4,7);
		Birou birou = new Birou(12,15,17, sertar1, sertar2);
		birou.tipareste();

	}

}
