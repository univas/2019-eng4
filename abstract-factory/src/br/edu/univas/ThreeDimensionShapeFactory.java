package br.edu.univas;

public class ThreeDimensionShapeFactory implements AbstractFactory {

	@Override
	public GeometricShape getShape(ShapeType type) {
		if (type.equals(ShapeType.SPHERE)) {
			return new Sphere();
		}
		return null;
	}

}
