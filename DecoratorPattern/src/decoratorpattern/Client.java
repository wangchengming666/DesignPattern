package decoratorpattern;

public class Client {

	public static void main(String[] agrs) {
		
		Component component = new ConcreateComponent();
		
		// first 
		component = new ConcreteDecorator1(component);
		
		// second
		component = new ConcreteDecorator2(component);
		
		// run
		component.operate();
	}
}
