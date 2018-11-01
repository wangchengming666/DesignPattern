package example;

public class AK_Factory implements Factory{

	@Override
	public IGun productGun() {
		return new AK();
	}

	@Override
	public IBullet productBullet() {
		return new AKBullet();
	}

}
