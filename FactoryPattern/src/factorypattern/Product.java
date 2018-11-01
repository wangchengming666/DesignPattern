package factorypattern;

public class Product implements IProduct{

	@Override
	public void productMethod() {
		System.out.println("I'm a product");
	}

}
