package example;

public abstract class DNFHelper {

	void openPC() {
		System.out.println("打开电脑...");
	};

	void openDNFClient() {
		System.out.println("打开DNF客户端...");
	}

	void loginDNF() {
		System.out.println("登录DNF账号...");
	}

	abstract void play();

	void process() {
		this.openPC();
		this.openDNFClient();
		this.loginDNF();
		this.play();
	}
}
