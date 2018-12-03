package example;

public class Shaolin extends United {
	public Shaolin(WulinAlliance wulinAlliance) {
		super(wulinAlliance);
	}

	public void sendAlliance(String message) {
		wulinAlliance.notice(message, Shaolin.this);
	}

	public void getNotice(String message) {
		System.out.println("少林收到消息：" + message);
	}
}
