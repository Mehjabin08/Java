
abstract class Bird {
    
    public abstract void fly();
    public abstract void makeSound();
}


class Eagle extends Bird {
    
    public void fly() {
        System.out.println("Eagle flies at high altitudes.");
    }

    
    public void makeSound() {
        System.out.println("Eagle makes a screeching sound.");
    }
}


class Hawk extends Bird {
    
    public void fly() {
        System.out.println("Hawk flies swiftly and gracefully.");
    }

    
    public void makeSound() {
        System.out.println("Hawk makes a high-pitched cry.");
    }
}


public class BirdAbs {
    public static void main(String[] args) {
       
        Eagle eagle = new Eagle();
        Hawk hawk = new Hawk();

      
        System.out.println("Eagle's Flying Behavior:");
        eagle.fly();
        System.out.println("\nEagle's Sound:");
        eagle.makeSound();

        

        
        System.out.println("Hawk's Flying Behavior:");
        hawk.fly();
        System.out.println("\nHawk's Sound:");
        hawk.makeSound();
    }
}
