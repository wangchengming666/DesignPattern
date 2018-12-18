package StrategyPattern;

public class Context {

	private Strategy strategy = null;

	public Context(Strategy _strategy) {
		this.strategy = _strategy;
	}

	/**
	 * 封装后的策略方法
	 */
	public void doAnything() {
		this.strategy.sth();
	}
}
