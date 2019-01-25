package example;

import java.util.Vector;

/**
 * 被观察者
 * 
 * @author cm_wang
 *
 */
public abstract class Subject {

	private Vector<Observer> obsVector = new Vector<Observer>();

	public void addObserver(Observer o) {
		this.obsVector.add(o);
	}

	public void delObserver(Observer o) {
		this.obsVector.remove(o);
	}

	public void notifyObserver() {
		obsVector.forEach(i -> {
			i.update();
		});
	}
}
