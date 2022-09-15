import java.util.Scanner;

public class Media {

	private int code;
	private double price;
	private String name;

	public Media() {
	}

	public Media(int code, double price, String name) {
		this.code = code;
		this.price = price;
		this.name = name;
	}

	public String getType() {
		return "Midia: ";
	}

	public String getDetails() {
		return "Codigo: " + this.getCode() + "\n" + 
				"Preco: " + this.getPrice() + 
				"\n" + "Nome: " + this.getName() + 
				"\n";
	}

	public void printData() {
		String s = this.getType() + "\n" + this.getDetails() + "\n";
		System.out.println(s);
	}

	public void insertData() {
		Scanner in = new Scanner(System.in);
		System.out.printf("\n Entre com o código: ");
		int cod = in.nextInt();
		System.out.printf("\n Entre com o preço: ");
		double pre = in.nextDouble();
		in.nextLine();
		System.out.printf("\n Entre com o nome: ");
		String nam = in.nextLine();
		
		this.setCode(cod);
		this.setPrice(pre);
		this.setName(nam);	
		
		System.out.println("Dados inseridos \n");
	}

	public int getCode() {
		return code;
	}

	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}
