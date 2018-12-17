package ChainOfResponsibilityPattern;

public class Client {

	public static void main(String[] args) {
		
		// 声明处理节点
		Handler h1 = new ConcreteHandler1();
		Handler h2 = new ConcreteHandler2();
		Handler h3 = new ConcreteHandler3();
		
		// 处理顺序
		h1.setNext(h2);
		h1.setNext(h3);
		
		// 返回结果
		Response response = h1.hanleMessage(new Request());
	}
}
