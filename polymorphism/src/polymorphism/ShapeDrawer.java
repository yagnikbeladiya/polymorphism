package polymorphism;

import java.util.ArrayList;

public class ShapeDrawer {
    public static void main(String[] args) {
   
    	ArrayList<Shape> shapes = new ArrayList<>();

    	shapes.add(new Circle());
        shapes.add(new Rectangle());
        shapes.add(new Triangle());

        
        for (Shape shape : shapes) {
            shape.draw();
        }
    }
}
