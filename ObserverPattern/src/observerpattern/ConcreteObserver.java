package observerpattern;

public class ConcreteObserver implements Observer{

	@Override
	public void update() {
		System.out.println("接收消息并处理");
	}
}
