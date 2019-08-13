package br.edu.univas;

public class FactoryProvider {
	
	private FactoryProvider() {
		
	}

	public static AbstractFactory getFactory(ShapeDimension dimension) {
		if (dimension.equals(ShapeDimension.TWO_DIMENSION_SHAPE_FACTORY)) {
			return new TwoDimensionShapeFactory();
		} else if (dimension.equals(ShapeDimension.THREE_DIMENSION_SHAPE_FACTORY)) {
			return new ThreeDimensionShapeFactory();
		}
		return null;
	}
	
}
