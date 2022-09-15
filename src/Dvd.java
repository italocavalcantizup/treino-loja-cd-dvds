import java.util.Scanner;

public class Dvd extends Media {
	
	private int nTracks;
	
	public Dvd() {}
	
	public Dvd(int code, double price, String name, int track) {
		super(code, price, name);
		this.nTracks = track;
	}
	
	public String getType() {
		return "Dvd: ";
	}
	
	public String getDetails() {
		return super.getDetails() + "Número de faixas: " + this.getnTracks() + "\n";
	}
	
	public void insertData() {
		super.insertData();
		
		Scanner in = new Scanner(System.in);
		System.out.printf("\n Entre com a quantidade de faixas: ");
		int tracks = in.nextInt();
		System.out.printf("Dados inseridos. \n");
		
		setnTracks(tracks);
	}
	
	public int getnTracks() {
		return nTracks;
	}
	
	public void setnTracks(int nTracks) {
		this.nTracks = nTracks;
	}

}
