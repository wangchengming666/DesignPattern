package example;


public class CookCommand extends Command {
	
	private Cook cook;
	
	public CookCommand(Cook _cook) {
		this.cook = _cook;
	}

	@Override
	public void orderList() {
		cook.cooking();
	}
}
