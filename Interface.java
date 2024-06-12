interface Animal {
    int eyes = 2;// all animal have this static/ final value which cannot be changed

    public void walk(); // if remove public still it will work
}

interface Herbivore {

}

class Horse implements Animal, Herbivore {
    public void walk() { // here we need to define access modifier
        System.out.println("Walk on shore");
    }
}

public class Interface {
    public static void main(String[] args) {
        Horse h1 = new Horse();
        h1.walk();
    }
}
