package example;

public class CookA extends Cook {

	@Override
	public void cooking() {
		System.out.println("厨师A开始做饭。。。");
	}

	@Override
	public void say() {
		System.out.println("厨师A收到菜单。。。");
	}
}
