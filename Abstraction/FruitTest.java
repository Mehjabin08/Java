abstract class Fruits {
    public abstract void sweet();
}

class Mango extends Fruits {
    public void sweet() {
        System.out.println("Mango is sweet!");
    }
}

class Orange extends Fruits {
    public void sweet() {
        System.out.println("Orange is sweet!");
    }
}

public class FruitTest {
    public static void main(String[] args) {
        Mango mango = new Mango();
        Orange orange = new Orange();

        mango.sweet();
        orange.sweet();
    }
}
