package commandpattern;

public class ConcreteCommand1 extends Command {

	private Receiver receiver;

	public ConcreteCommand1(Receiver _receiver) {
		this.receiver = _receiver;
	}

	@Override
	public void execute() {
		this.receiver.dth();
	}
}
