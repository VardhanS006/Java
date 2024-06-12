// class Pen {
//     String color;
//     String type; //ballpoint ,gel

//     public void write() {
//         System.out.println("Write something");
//     }
//     public void printColor(){
//         System.out.println(this.color);
//     }
// }
// class Student {
//     String name;
//     int age;

//     public void printName() {
//         System.out.println(this.name);
//         System.out.println(this.age);
//     }

// Student() {              // Non- Parameterized constructor
//     System.out.println("constructor called");
// }

//parameterized constructor
// Student(String name, int age) {         
//     this.name = name;
//     this.age = age;
// }

//copy constructers
//     Student(Student s2) {
//         this.name = s2.name;
//         this.age = s2.age;
//     }
//     Student() {

//     }
// }
// public class OOPS {
//     public static void main(String[] args) {
// Pen pen1 = new Pen();
// pen1.color = "blue";
// pen1.type = "gel";

// // pen1.write();

// Pen pen2 =new Pen();
// pen2.color = "black";
// pen2.type = "ballpoint";

// pen1.printColor();
// pen2.printColor();

//     //non parametrized
// Student s1 = new Student();
// s1.name = "utkarsh";
// s1.age = 21;
// s1.printName();

//Parametrized
// Student s1 = new Student("Utkarsh",21);
// s1.printName();

//copy sonstructor
//     Student s1 = new Student();
//     s1.name = "utkarsh";
//     s1.age = 21;
//     Student s2 = new Student(s1);
//     s2.printName();
// }
// }

//Polymorphism
class Student {
    String name;
    int age;

    public void printInfo(String name) {
        System.out.println(name);
    }

    public void printInfo(int name) {
        System.out.println(age);
    }

    public void printInfo(String name, int age) {
        System.out.println(name + " " + age);
    }
}

public class OOPS {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "utkarsh";
        s1.age = 21;
        s1.printInfo(s1.name, s1.age);
    }
}