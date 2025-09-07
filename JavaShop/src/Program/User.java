package Program;

import java.util.ArrayList;
import java.util.List;

public class User {
	private String name;
	private int id;
	private List<Cart> carts;
	
	public User(){
		carts=new ArrayList<>();
	}
	public User(String n, int Id){
		this();
		name=n;
		id=Id;
	}
	
public String getName() {
	return name;
}
public int getId() {
	return id;
}
public List<Cart> getCarts() {
	return carts;
}

public void setName(String n) {
	this.name=n;
}
public void setId(int Id) {
	this.id=Id;
}
public void setCarts(List<Cart> otherCarts) {
	this.carts=otherCarts;
}

public void addCart(Cart c) {
	carts.add(c);
}
public void removeCart(Cart c) {
	carts.remove(c);
}
}
