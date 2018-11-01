package factorypattern;


public class Client {

	public static void main(String[] args) {
		IFactory f = new Factory();
		IProduct p = f.createProduct();
		p.productMethod();
	}
}
