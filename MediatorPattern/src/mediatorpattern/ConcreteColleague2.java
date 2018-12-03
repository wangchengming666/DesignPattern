package mediatorpattern;

public class ConcreteColleague2 extends Colleague {

	public ConcreteColleague2(Mediator _mediator) {
		super(_mediator);
	}

	public void selfMethod2() {
		// TODO
	}

	public void depMethod2() {
		super.mediator.doSth2();
	}
}
