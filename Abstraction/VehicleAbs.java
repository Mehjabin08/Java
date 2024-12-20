
abstract class Vehicle {
    
    public abstract void startEngine();
    public abstract void stopEngine();
}


class Car extends Vehicle {
   
    public void startEngine() {
        System.out.println("Car engine started.");
    }

    
    public void stopEngine() {
        System.out.println("Car engine stopped.");
    }
}


class Motorcycle extends Vehicle {
    
    public void startEngine() {
        System.out.println("Motorcycle engine started.");
    }

   
    public void stopEngine() {
        System.out.println("Motorcycle engine stopped.");
    }
}

public class VehicleAbs {
    public static void main(String[] args) {
        
        Car car = new Car();
        Motorcycle motorcycle = new Motorcycle();

        
        car.startEngine();
        car.stopEngine();

        motorcycle.startEngine();
        motorcycle.stopEngine();
    }
}
