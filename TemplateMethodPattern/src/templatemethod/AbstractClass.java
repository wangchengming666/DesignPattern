package templatemethod;

public abstract class AbstractClass {

	protected abstract void otherMethod();
	
	public void templateMethod() {
		this.otherMethod();
	}
}
