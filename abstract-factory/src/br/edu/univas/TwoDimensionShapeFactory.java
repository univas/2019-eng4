package br.edu.univas;

public class TwoDimensionShapeFactory implements AbstractFactory {

	@Override
	public GeometricShape getShape(ShapeType type) {
		if (type.equals(ShapeType.LINE)) {
			return new Line();
		} else if (type.equals(ShapeType.CIRCLE)) {
			return new Circle();
		}
		return null;
	}

}
