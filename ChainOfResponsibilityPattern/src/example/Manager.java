package example;

public class Manager extends Handler{

	@Override
	public String handleRequest(String user, int dayNum) {

		String str = "";
		// 经理权限相对较大
		if (dayNum < 5) {
			if ("张三".equals(user)) {
				str = "成功：经理同意【" + user + "】请假" + dayNum + "天";
			} else {
				// 其他人一律不同意
				str = "其他人一律不同意";
			}
		} else {
			// 请假超过五天的
			if (getSuccessor() != null) {
				return getSuccessor().handleRequest(user, dayNum);
			}
		}
		return str;
	}

}
