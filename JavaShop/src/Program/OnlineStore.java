package Program;

import java.util.ArrayList;
import java.util.List;

public class OnlineStore {
	private static int productsCount;
	private static List<User> users;
	
	static {
		users=new ArrayList<>();
		User user1=new User("Ann", 1);
		User user2=new User("Alex", 2);
		
		Cart cart1=new Cart();
		Product prod1=new PhysicalProduct("Iphone 15", "Apple", 30000, 14.7f, 7.6f, 141);
		Product prod2=new PhysicalProduct("Iphone 16", "Apple", 35000, 14.7f, 7.6f, 141);
		cart1.addProduct(prod1);
		cart1.addProduct(prod2);
		
		Cart cart2=new Cart();
		Product prod3=new DigitalProduct("Grand Theft Auto V", "Rockstar Games", 1080, "All",100f);
		cart2.addProduct(prod3);
		
		user1.addCart(cart1);
		user2.addCart(cart2);
		
		users.add(user1);
		users.add(user2);
		
		productsCount=calcProducts();
	}
	public static int calcProducts() {
		int total=0;
		for (User user:users) {
			for (Cart cart:user.getCarts()) {
				total+=cart.getProducts().size();
			}
		}
		return total;
	}
	public static void purchase() {
		ArrayList<Purchasable> products=new ArrayList<Purchasable>();
		for (User user:users) {
			for (Cart cart:user.getCarts()) {
				products.addAll(cart.getProducts());
			}
		}
		System.out.println("\nполіморфний виклик для всіх продуктів:");
		for (Purchasable product : products) {
		product.printInfo();
		        }
		    }

public static void main(String[] args) {
	System.out.println("Total value of products: "+productsCount);
	purchase();
	User firstUser=users.get(1);
	if(!firstUser.getCarts().isEmpty()) {
		Cart firstCart=firstUser.getCarts().get(0);
		
		if(!firstCart.getProducts().isEmpty()) {
			Product prodToRemove=firstCart.getProducts().get(0);
			firstCart.removeProduct(prodToRemove);
		}
	}
}
}
