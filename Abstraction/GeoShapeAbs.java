
abstract class GeometricShape {
   
    public abstract double area();
    public abstract double perimeter();
}


class Triangle extends GeometricShape {
    private double side1, side2, side3;

    
    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

   
   
    public double area() {
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    
    public double perimeter() {
        return side1 + side2 + side3;
    }
}


class Square extends GeometricShape {
    private double side;

    
    public Square(double side) {
        this.side = side;
    }

    
    public double area() {
        return side * side;
    }

   
    public double perimeter() {
        return 4 * side;
    }
}


public class GeoShapeAbs {
    public static void main(String[] args) {
       
        Triangle triangle = new Triangle(3, 4, 5);
        Square square = new Square(4);

        
        System.out.println("Area of Triangle: " + triangle.area());
        System.out.println("Perimeter of Triangle: " + triangle.perimeter());

        

      
        System.out.println("Area of Square: " + square.area());
        System.out.println("Perimeter of Square: " + square.perimeter());
    }
}
