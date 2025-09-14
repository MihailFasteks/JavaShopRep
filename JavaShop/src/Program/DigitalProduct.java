package Program;

public class DigitalProduct extends Product{
	private String OS;
	public float size;
	public DigitalProduct() {
		super();
	}
	public DigitalProduct(String n, String b, double p, String os, float s) {
		super(n, b, p);
		OS=os;
		size=s;
	}
	public String getOS() {
		return OS;
	}
	public float getSize() {
		return size;
	}
	
	public void setOS(String os) {
		OS=os;
	}
	public void setSize(float s) {
		size=s;
	}
	@Override
	public void printInfo() {
		System.out.println("phys prod - "+name+" - "+brand+" - "+price+"grn - "+OS+ " - "+size+"gb");
		
	}

}
