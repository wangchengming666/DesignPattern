package proxypattern;

public class Proxy implements Subject{

	// 要代理哪个实现类
	public Subject subject = null;
	
	// 默认被代理者
	public Proxy() {
		this.subject = new Proxy();
	}
	
	public Proxy(Object...objects) {
		
	}
	
	@Override
	public void request() {
		this.subject.request();
	}
}
