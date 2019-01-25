package decoratorpattern;

public class ConcreateComponent extends Component{

	@Override
	public void operate() {
		System.out.println("do something...");
	}
}
