package observerpattern;

public class ConcreteSubject extends Subject {

	public void doSth() {
		super.notifyObserver();
	}
}
