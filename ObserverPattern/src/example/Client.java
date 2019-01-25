package example;

public class Client {

	public static void main(String[] args) {

		shengchengang subject = new shengchengang();

		Observer obs = new yangzhi();
		
		Observer thief = new wuyong();

		Observer thief1 = new baisheng();
		
		// 吴用等人假装卖枣稳住杨志等人
		subject.addObserver(thief);
		// 白胜夺来放有蒙汗药的瓢倒在桶里麻倒对方
		subject.addObserver(thief1);
		// 杨志等人喝了带蒙汗药的酒
		subject.addObserver(obs);
		
		subject.doSth();
	}
}
