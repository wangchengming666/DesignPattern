package decoratorpattern;

public class ConcreteDecorator2 extends Decorator{

	public ConcreteDecorator2(Component _component) {
		super(_component);
	}
	
	private void method2() {
		System.out.println("method2 装饰");
	}
	
	public void operate() {
		this.method2();
		super.operate();
	}
}
