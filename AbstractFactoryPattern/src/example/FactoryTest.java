package example;


import org.junit.Test;

public class FactoryTest {

	@Test
	public void test() {
		Factory factory = new AK_Factory();
		IBullet bullet = factory.productBullet();
		IGun gun = factory.productGun();
		bullet.load();
		gun.shoot();
	}
}
