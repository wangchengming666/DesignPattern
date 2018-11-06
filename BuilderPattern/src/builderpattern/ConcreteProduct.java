package builderpattern;

public class ConcreteProduct extends Builder {

	private Product product = new Product();

	@Override
	public void setPart() {
		// TODO Auto-generated method stub

	}

	@Override
	public Product buildProduct() {
		// TODO Auto-generated method stub
		return product;
	}
}
