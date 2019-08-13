package br.edu.univas;

public interface AbstractFactory {

	GeometricShape getShape(ShapeType type);
	
}
