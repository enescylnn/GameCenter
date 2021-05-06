
public class Sale {
	
	private int id;
	private int customerId;
	private int productId;
	private double totalAmount;
	
	public Sale(int id, int customerId, int productId, double totalAmount) {
		this.id = id;
		this.customerId = customerId;
		this.productId = productId;
		this.totalAmount = totalAmount;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public double getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}


}
