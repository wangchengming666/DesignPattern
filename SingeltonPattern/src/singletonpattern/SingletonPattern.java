package singletonpattern;

/**
 * 单例模式通用代码
 * 
 * @author cm_wang
 *
 */
public class SingletonPattern {

	// private static final SingletonPattern singletonPattern = new
	// SingletonPattern();
	//
	// // 私有的构造方法，为了限制产生多个对象
	// private SingletonPattern() {
	// }
	//
	// /**
	// * 通过这个方法获得对象唯一实例
	// *
	// * @return
	// */
	// public static SingletonPattern getSingleton() {
	// return singletonPattern;
	// }

	// /**
	// * 懒汉式单例
	// *
	// * @author cm_wang
	// *
	// */
	// private static SingletonPattern singletonPattern;
	//
	// private SingletonPattern() {
	// }
	//
	// public static synchronized SingletonPattern getInstance() {
	// if (singletonPattern == null) {
	// singletonPattern = new SingletonPattern();
	// }
	// return singletonPattern;
	// }
	
	private static SingletonPattern singletonPattern;
	
	private SingletonPattern() {}
	
	/**
	 * 双重校验版
	 * 
	 * @return
	 */
	public static SingletonPattern getInstance() {
		if(singletonPattern == null) {
			synchronized(SingletonPattern.class) {
				if(singletonPattern == null) {
					singletonPattern = new SingletonPattern();
				}
			}
		}
		return singletonPattern;
	}
	
}
