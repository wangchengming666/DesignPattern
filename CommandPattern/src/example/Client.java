package example;

public class Client {

	public static void main(String[] args) {
		
		Cook cook = new CookA();
		
		Command command = new CookCommand(cook);
		
		Consumer cosumer=new Consumer();
		
		Consumer.order();
		
		cook.say();
		
		cosumer.setCommand(command);
		
		cosumer.action();
	}
}
