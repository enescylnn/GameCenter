

public class Game {
	private int id;
	private String name;
	private double unitPrice;	
	private String year;
	
	public Game() { }
	
	public Game(int id, String name, double unitPrice, String year) {
		super();
		this.id = id;
		this.name = name;
		this.unitPrice = unitPrice;
		this.year = year;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}


	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

}
