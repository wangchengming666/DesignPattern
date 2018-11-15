package prototypepattern;

public class Prototype implements Cloneable {

	/* (non-Javadoc)
	 * @see java.lang.Object#clone()
	 * 
	 * 重写Object的clone()方法，必须是public
	 * 
	 */
	@Override
	public Prototype clone() {

		Prototype prototype = null;
		try {
			prototype = (Prototype) super.clone();
		} catch (CloneNotSupportedException ex) {
			ex.printStackTrace();
		}
		return prototype;
	}
}
