package example;

/**
 * 相当于Invoker
 * 
 * @author cm_wang
 *
 */
public class Consumer {
	
	static void order() {
		System.out.println("小王点菜。。。");
	}

	private Command command;

	public void setCommand(Command _command) {
		this.command = _command;
	}
	
	public void action() {
		this.command.orderList();
	}
}
