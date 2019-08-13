package br.edu.univas;

public class App {

	public static void main(String[] args) {
		AbstractFactory factory = FactoryProvider.getFactory(
				ShapeDimension.TWO_DIMENSION_SHAPE_FACTORY);
		
		GeometricShape shape = factory.getShape(ShapeType.LINE);
		shape.draw();
		
		shape = factory.getShape(ShapeType.CIRCLE);
		shape.draw();
		
		factory = FactoryProvider.getFactory(
				ShapeDimension.THREE_DIMENSION_SHAPE_FACTORY);
		
		shape = factory.getShape(ShapeType.SPHERE);
		shape.draw();
				
		
	}
	
}
