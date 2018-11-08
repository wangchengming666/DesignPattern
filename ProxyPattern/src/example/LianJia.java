package example;

public class LianJia implements Subject{

	@Override
	public void buyHouse() {
		RealSubject subject = new RealSubject();
		subject.buyHouse();
		lianximaijia();
		deal();
		shoufei();
	}
	
	private void lianximaijia() {
		System.out.println("卖家联系成功。");
	}
	
	private void deal() {
		System.out.println("成交。");
	}

	private void shoufei() {
		System.out.println("你好，房子成交后我们要收取总房款2%的手续费哦。");
	}
}
