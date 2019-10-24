package br.edu.univas;

import java.util.ArrayList;
import java.util.List;

public class App {

	public static void main(String[] args) {
		List<Shape> shapes = new ArrayList<>();
        List<Shape> shapesCopy = new ArrayList<>();

        Circle circle = new Circle();
        circle.setX(10);
        circle.setY(20);
        circle.setRadius(15);
        circle.setColor("red");
        shapes.add(circle);

        Circle anotherCircle = new Circle();
        anotherCircle.setX(circle.getX());
        anotherCircle.setY(circle.getY());
        anotherCircle.setRadius(circle.getRadius());
        anotherCircle.setColor(circle.getColor());
        shapesCopy.add(anotherCircle);

        Rectangle rectangle = new Rectangle();
        rectangle.setWidth(10);
        rectangle.setHeight(20);
        rectangle.setColor("blue");
        shapes.add(rectangle);
        
        Rectangle anotherRectangle = new Rectangle();
        rectangle.setWidth(rectangle.getWidth());
        rectangle.setHeight(rectangle.getHeight());
        rectangle.setColor(rectangle.getColor());
        shapesCopy.add(anotherRectangle);
	}
}
