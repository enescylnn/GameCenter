import java.rmi.RemoteException;

public class SaleManager {
	
	private CustomerCheckService customerCheck;
	
	public SaleManager(CustomerCheckService customerCheck) {
		this.customerCheck = customerCheck;
	}
	
	public void add(Sale sale, Customer customer) throws RemoteException{
		
		if (this.customerCheck.checkIfRealPerson(customer)) {
			System.out.println(" Sale successful : " + sale.getCustomerId() + " " + sale.getProductId() + " " + sale.getTotalAmount());
		}else {
			System.out.println("The sale transaction could not be performed. Not a valid person.");
		}
	}
	
	public void update(Sale sale) {
		System.out.println("Sale Updated : " + sale.getCustomerId() + " " + sale.getProductId() + " " + sale.getTotalAmount());
	}
	
	public void delete(Sale sale) {
		System.out.println("Sale Deleted : " + sale.getCustomerId() + " " + sale.getProductId() + " " + sale.getTotalAmount());
	}
	
	public double discountCalculate(Game game, Campaign campaign) {
		
		double totalAmount = 0;
		
		if (game.getUnitPrice() > campaign.getLowerLimit()) {
			totalAmount = game.getUnitPrice() - game.getUnitPrice() * campaign.getDiscount();
		}
		
		return totalAmount;
	}
	
	public double discountCalculate(Game[] games, Campaign campaign) {
		
		double total = 0;
		for (Game game : games) {
			System.out.println(game.getName() + "     ");
			total += game.getUnitPrice();
		}
		if (total > campaign.getLowerLimit()) {
			System.out.println("\nTotal Amount : " + total + "  Discount Rate : " + campaign.getDiscount());
			total = total - total * campaign.getDiscount();
		}
		System.out.println("Current Amount : " + total);
		return total;
	}

}
