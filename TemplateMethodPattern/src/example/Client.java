package example;

public class Client {

	public static void main(String[] args) {
		PlayerA playA = new PlayerA();
		playA.process();
		System.out.println("-------------");
		PlayerB playB = new PlayerB();
		playB.process();
	}
}
