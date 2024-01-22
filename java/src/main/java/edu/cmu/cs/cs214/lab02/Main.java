package edu.cmu.cs.cs214.lab02;

import edu.cmu.cs.cs214.lab02.shapes.Shape;  // Import the correct Shape interface
import edu.cmu.cs.cs214.lab02.shapes.Rectangle;
import edu.cmu.cs.cs214.lab02.shapes.Circle;  // Assuming Circle is also in this package

public class Main {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle(2, 3);
        Shape circle = new Circle(4);

        Renderer renderer = new Renderer(rectangle);
        Renderer renderer2 = new Renderer(circle);
        renderer.draw();
        renderer2.draw();
    }
}
