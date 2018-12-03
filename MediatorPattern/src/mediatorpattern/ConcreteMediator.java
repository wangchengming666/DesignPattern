package mediatorpattern;

public class ConcreteMediator extends Mediator{

	@Override
	public void doSth1() {
		super.c1.selfMethod1();
		super.c2.selfMethod2();
	}

	@Override
	public void doSth2() {
		super.c1.selfMethod1();
		super.c2.selfMethod2();
	}
}
