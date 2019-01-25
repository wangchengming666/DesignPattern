package decoratorpattern;

public class ConcreteDecorator1 extends Decorator{

	public ConcreteDecorator1(Component _component) {
		super(_component);
	}
	
	private void method1() {
		System.out.println("method1 装饰");
	}
	
	public void operate() {
		this.method1();
		super.operate();
	}
}
