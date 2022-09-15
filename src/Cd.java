import java.util.Scanner;

public class Cd extends Media {

	private int nMusic;

	public Cd() {
	}

	public Cd(int code, double price, String name, int musics) {
		super(code, price, name);
		setnMusic(musics);
	}

	public String getType() {
		return "CD: ";
	}

	public String getDetails() {
		return super.getDetails() + "Número de músicas: " + this.getnMusic() + "\n";
	}
	
	public void insertData() {
		super.insertData();
		
		Scanner in = new Scanner(System.in);
		System.out.printf("\n Entre com o número de músicas: ");
		int mus = in.nextInt();
		
		setnMusic(mus);
		System.out.printf("\n Dados inseridos. \n");
	}

	public int getnMusic() {
		return nMusic;
	}

	public void setnMusic(int nMusic) {
		this.nMusic = nMusic;
	}

}
