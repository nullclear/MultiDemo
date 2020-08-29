package reflect;

public class Example1 {
	int id;
	String name;
	double price;
	public Example1() {
		super();
	}
	public Example1(int id) {
		super();
		this.id = id;
	}
	private Example1(int id, String name, double price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Example [id=" + id + ", name=" + name + ", price=" + price + "]";
	}
	
}
