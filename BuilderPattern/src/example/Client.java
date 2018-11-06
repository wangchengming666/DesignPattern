package example;

public class Client {

	public static void main(String[] srgs) {

		Director director = new Director();
		Builder builder = new ConcreteBuilder();
		director.Construct(builder);
		Computer computer = builder.GetComputer();
		computer.Show();
	}
}
