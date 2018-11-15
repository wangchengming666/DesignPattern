package example;

import java.util.Random;

public class Client {

	private static int count = 10;

	public static void main(String[] args) {

		int i = 0;
		Message msg = new Message(new Temeplate());
		while (i < count) {
			Message cloneMsg = msg.clone();
			Random rand = new Random();
			cloneMsg.setReceiver(rand.nextInt(1000000000) + 1+"@qq.com");
			send(cloneMsg);
			i++;
		}
	}
	
	public static void send(Message msg) {
		System.out.println(msg.getReceiver()+"接收成功");
	}
}
