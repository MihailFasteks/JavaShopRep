package Program;

import java.util.ArrayList;
import java.util.List;

public class Cart {
private List<Product> products;

Cart(){
	products=new ArrayList<>();
}
Cart(List<Product> otherProductList){
	this();
	products.addAll(otherProductList);
}
public List<Product> getProducts(){
	return products;
}
public void addProduct(Product prod) {
	products.add(prod);
}
public void removeProduct(Product prod) {
	products.remove(prod);
}
}
