package example;

public class TeamLeader extends Handler {

	@Override
	public String handleRequest(String user, int dayNum) {

		String str = "";
		// TL权限比较小
		if (dayNum < 3) {
			if ("张三".equals(user)) {
				str = "成功：TL同意【" + user + "】请假" + dayNum + "天";
			} else {
				// 其他人一律不同意
				str = "其他人一律不同意";
			}
		} else {
			// 请假超过三天的
			if (getSuccessor() != null) {
				return getSuccessor().handleRequest(user, dayNum);
			}
		}
		return str;
	}
}
