package example;

public class Factory implements IShapeFactory {

	@Override
	public IShape getShape(String shape) {

		if (shape.equals("Circle")) {
			return new Circle();
		} 
		if (shape.equals("Square")) {
			return new Square();
		} 
		if(shape.equals("Rectangle")){
			return new Rectangle();
		}
		return null;
	}
}
