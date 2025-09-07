package Program;

public class Product {
private String name;
private String brand;
private double price;

public Product(){
	
}
public Product(String n){
	this();
	name=n;
}
public Product (String n, String b) {
	this(n);
	brand=b;
}
public Product (String n, String b, double p) {
	this(n, b);
	price=p;
}
public String getName() {
	return name;
}
public void setName(String n) {
	name=n;
}
public String getBrand() {
	return brand;
}
public void setBrand(String b) {
	brand=b;
}
public double getPrice() {
	return price;
}
public void setPrice(double p) {
	price=p;
}
@Override
protected void finalize() throws Throwable{
	
	System.out.println(this.name + " removed");
	super.finalize();
}

}
