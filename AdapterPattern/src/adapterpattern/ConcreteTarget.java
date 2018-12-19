package adapterpattern;

public class ConcreteTarget implements Target{

	@Override
	public void request() {
		System.out.println("this is ConcreteTarget");
	}
}
