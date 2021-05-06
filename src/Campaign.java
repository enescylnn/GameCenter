
public class Campaign {
	
	private int id;
	private String name;
	private double lowerLimit;
	private double discount;
	
	public Campaign(int id, String name, double lowerLimit, double discount) {
		this.id = id;
		this.name = name;
		this.lowerLimit = lowerLimit;
		this.discount = discount;
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

	public double getLowerLimit() {
		return lowerLimit;
	}

	public void setLowerLimit(double lowerLimit) {
		this.lowerLimit = lowerLimit;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

}
