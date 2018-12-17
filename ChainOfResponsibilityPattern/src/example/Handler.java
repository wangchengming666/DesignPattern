package example;

public abstract class Handler {
	/**
	 * 持有下一个处理请求的对象
	 */
	protected Handler successor = null;

	/**
	 * 取值方法
	 */
	public Handler getSuccessor() {
		return successor;
	}

	/**
	 * 设置下一个处理请求的对象
	 */
	public void setSuccessor(Handler successor) {
		this.successor = successor;
	}

	/**
	 * @return 成功或失败的具体通知
	 */
	public abstract String handleRequest(String user, int dayNum);

}