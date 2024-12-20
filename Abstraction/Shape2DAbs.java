
abstract class Shape2D {
    
    public abstract void draw();
    public abstract void resize();
}


class Rectangle extends Shape2D {
    
    public void draw() {
        System.out.println("Drawing Rectangle...");
    }

    
    public void resize() {
        System.out.println("Resizing Rectangle...");
    }
}


class Circle extends Shape2D {
    
    public void draw() {
        System.out.println("Drawing Circle...");
    }

    
    public void resize() {
        System.out.println("Resizing Circle...");
    }
}


public class Shape2DAbs {
    public static void main(String[] args) {
        
        Rectangle rectangle = new Rectangle();
        Circle circle = new Circle();

        
        System.out.println("Drawing Rectangle:");
        rectangle.draw();
        System.out.println("Resizing Rectangle:");
        rectangle.resize();

       

        
        System.out.println("Drawing Circle:");
        circle.draw();
        System.out.println("Resizing Circle:");
        circle.resize();
    }
}
