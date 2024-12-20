
abstract class Person {
    
    public abstract void eat();
    public abstract void exercise();
}

class Athlete extends Person {
    
    public void eat() {
        System.out.println("An athlete eats a balanced diet to maintain energy levels.");
    }

    
    public void exercise() {
        System.out.println("An athlete engages in rigorous workouts and specific training routines.");
    }
}


class LazyPerson extends Person {
    
    public void eat() {
        System.out.println("A lazy person eats unhealthy food and snacks a lot.");
    }

    
    public void exercise() {
        System.out.println("A lazy person prefers to relax and avoids physical activities.");
    }
}


public class PersonAbs {
    public static void main(String[] args) {
       
        Athlete athlete = new Athlete();
        LazyPerson lazyPerson = new LazyPerson();

        
        System.out.println("Athlete's Eating Habits:");
        athlete.eat();
        System.out.println("\nAthlete's Exercise Routine:");
        athlete.exercise();

        System.out.println("\n---------------------------------\n");

      
        System.out.println("Lazy Person's Eating Habits:");
        lazyPerson.eat();
        System.out.println("\nLazy Person's Exercise Routine:");
        lazyPerson.exercise();
    }
}
