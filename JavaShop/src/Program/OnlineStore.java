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
		cart1.addProduct(new Product("Iphone 15", "Apple", 1000));
		cart1.addProduct(new Product("Samsung S21", "Samsung", 500));
		
		Cart cart2=new Cart();
		cart1.addProduct(new Product("Iphone 12", "Apple", 800));
		
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
public static void main(String[] args) {
	System.out.println("Total value of products: "+productsCount);
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
