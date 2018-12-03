package mediatorpattern;

public class ConcreteColleague1 extends Colleague {

	public ConcreteColleague1(Mediator _mediator) {
		super(_mediator);
	}

	public void selfMethod1() {
		//TODO
	}

	public void depMethod1() {
		super.mediator.doSth1();
	}
}
