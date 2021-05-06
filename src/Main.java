
import java.rmi.RemoteException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws RemoteException {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter Nationality ID : ");
		String nationalityId = scanner.nextLine();
		
		System.out.println("Enter First Name : ");
		String firstName = scanner.nextLine();
		
		System.out.println("Enter Last Name : ");
		String lastName = scanner.nextLine();
		
		System.out.println("Enter Birth Year : ");
		int birthYear = scanner.nextInt();
		System.out.println();
		
		Customer customer = new Customer(1001, firstName, lastName, birthYear, nationalityId);
		Game game = new Game(100, "CS:GO",24.00,"2012");
		Game game1 = new Game(200, "Valorant",6.00,"2020");
		Game game2 = new Game(300, "Among Us", 10.00, "2019");
		
		Campaign campaign = new Campaign(1,"New Year",5.00,0.20);
		
		Game[] games = {game,game1,game2};
		
		SaleManager saleManager = new SaleManager(new CustomerCheckManager());
		
		double totalAmount = saleManager.discountCalculate(games, campaign);
		
		Sale sale = new Sale(1, 1001 , 11 , totalAmount);
		saleManager.add(sale, customer);

	}

}
