package example;

public class M4A1_Factory implements Factory{

	@Override
	public IGun productGun() {
		return new M4A1();
	}

	@Override
	public IBullet productBullet() {
		return new M4A1Bullet();
	}
}
