package example;

public class GeneralManager extends Handler {

	@Override
	public String handleRequest(String user, int dayNum) {

		String str = "";
		// 总监权限最大
		if (dayNum < 10) {
			if ("张三".equals(user)) {
				str = "成功：总监同意【" + user + "】请假" + dayNum + "天";
			} else {
				// 其他人一律不同意
				str = "其他人一律不同意";
			}
		} else {
			// 如果还有后继的处理对象，继续传递
			if (getSuccessor() != null) {
				return getSuccessor().handleRequest(user, dayNum);
			}
		}
		return str;
	}
}
