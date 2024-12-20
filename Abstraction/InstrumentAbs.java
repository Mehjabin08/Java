
abstract class Instrument {
    
    public abstract void play();
    public abstract void tune();
}

class Glockenspiel extends Instrument {
    
    public void play() {
        System.out.println("Glockenspiel is playing beautiful melodies.");
    }

    
    public void tune() {
        System.out.println("Glockenspiel is being tuned by adjusting the metal bars.");
    }
}


class Violin extends Instrument {
    
    public void play() {
        System.out.println("Violin is playing enchanting music.");
    }

    
    public void tune() {
        System.out.println("Violin is being tuned by adjusting the strings.");
    }
}


public class InstrumentAbs {
    public static void main(String[] args) {
        
        Glockenspiel glockenspiel = new Glockenspiel();
        Violin violin = new Violin();

      
        System.out.println("Playing Glockenspiel:");
        glockenspiel.play();
        System.out.println("\nTuning Glockenspiel:");
        glockenspiel.tune();

       

        
        System.out.println("Playing Violin:");
        violin.play();
        System.out.println("\nTuning Violin:");
        violin.tune();
    }
}
