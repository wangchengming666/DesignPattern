package example;

public class Context {

	private Strategy strategy;

	// 构造函数，要你使用哪个妙计
	public Context(Strategy strategy) {
		this.strategy = strategy;
	}

	public void setStrategy(Strategy strategy) {
		this.strategy = strategy;
	}

	public void operate() {
		this.strategy.operate();
	}
}
