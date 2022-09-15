import java.util.Scanner;

public class TesteMidia {

	public static void main(String[] args) {

		Media media[] = new Media[10];
		
		Scanner in = new Scanner(System.in);
		
		for (int i = 0; i < media.length; i++) {
			System.out.printf("\nEscolha: 1 - CD | 2 DVD");
			int opt = in.nextInt();
			
			if (opt == 1) {
				media[i] = new Cd();
			} else if (opt == 2) {
				media[i] = new Dvd();
			} else {
				System.out.println("Número inválido");
			}
			
			media[i].insertData();
		}
		
		System.out.println();
		System.out.println("---- Resumo das mídias inseridas ----");
		for (Media m : media) {
			System.out.println(m.getDetails());
			System.out.println();
		}
		
		
	}

}
