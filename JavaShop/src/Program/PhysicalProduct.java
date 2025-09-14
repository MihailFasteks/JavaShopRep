package Program;

public class PhysicalProduct extends Product {
private float weight;
private float height;
private float width;

public PhysicalProduct() {
	super();
}
public PhysicalProduct(String n, String b, double p, float w, float h, float wd) {
	super(n, b, p);
	weight=w;
	height=h;
	width=wd;
}
public float getWeight() {
	return weight;
}
public float getHeight() {
	return height;
}
public float getWidth() {
	return width;
}
public void setWeight(float w) {
	weight=w;
}
public void setHeight(float h) {
	height=h;
}
public void setWidth(float wd) {
	width=wd;
}
@Override
public void printInfo() {
	System.out.println("phys prod - "+name+" - "+brand+" - "+price+"grn - "+weight+ "g - "+height+"cm - "+width+"cm");
	
}
}
