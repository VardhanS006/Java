abstract class Animals {
    Animals() {
        System.out.println("You area creating a new animal");
    }
    abstract void walk(); 
    public void eats () {
        System.out.println("Eats");
    }
}

class Horse extends Animals {
    public void walk() {
        System.out.println("Walks on 4 legs");
    }
}

class Chicken extends Animals {
    public void walk() {
        System.out.println("Walks on 2 legs");
    }
}

public class Abstraction {
    public static void main(String[] args) {
        Horse h1 = new Horse();
        h1.walk();
        // Animals animal = new Animals();     //runtime error
        // animal.walk();
        h1.eats();
    }
}
