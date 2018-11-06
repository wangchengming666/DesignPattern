package builderpattern;

public class Dicector {

	private Builder builder = new ConcreteProduct();

	public Product getAProduct() {

		builder.setPart();
		// 业务逻辑
		return builder.buildProduct();
	}
}
