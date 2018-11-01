package example;

public class Client {

	public static void main(String[] args) {
		IShapeFactory a = new Factory();
		IShape b = a.getShape("Rectangle");
		b.draw();
	}
}
