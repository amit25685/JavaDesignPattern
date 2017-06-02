package FactoryMethod;

public class FactoryPatternDemo {
	public static void main(String aa[]){
		ShapeFactory shapeFactory = new ShapeFactory();
		
		Shape shape1= shapeFactory.getShape("CIRCLE");
		shape1.draw();
		
		Shape shape2= shapeFactory.getShape("RECTANGLE");
		shape2.draw();
		
		Shape shape3= shapeFactory.getShape("SQUARE");
		shape3.draw();
		
	}
}
