
abstract class Shape {
    public abstract double calculateArea();
    public abstract double calculatePerimeter();
}


class Circle extends Shape {
    private double radius;

   
    public Circle(double radius) {
        this.radius = radius;
    }

   
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

   
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}


class Triangle extends Shape {
    private double side1, side2, side3;

    
    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    
    public double calculateArea() {
        double s = (side1 + side2 + side3) / 2.0;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    
    public double calculatePerimeter() {
        return side1 + side2 + side3;
    }
}


public class ShapeAbs {
    public static void main(String[] args) {
        
        Circle circle = new Circle(5);
        Triangle triangle = new Triangle(3, 4, 5);

        
        System.out.println("Circle Area: " + circle.calculateArea());
        System.out.println("Circle Perimeter: " + circle.calculatePerimeter());

        // Display area and perimeter for Triangle
        System.out.println("Triangle Area: " + triangle.calculateArea());
        System.out.println("Triangle Perimeter: " + triangle.calculatePerimeter());
    }
}
