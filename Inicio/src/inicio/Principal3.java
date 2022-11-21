package inicio;

public class Principal3 {

	public static void main(String[] args) {

		StringBuilder s = new StringBuilder("Patrobas ");
		
		for (int x=1;x<=1_000_000;x++) {
			s.append(x);
			System.out.println(s);
		}
		
	}

}
