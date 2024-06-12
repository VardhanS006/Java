class Student {
    String name;
    static String school;  //now all the objects for students class will have same school name

    public static void changeSchool() {
        school = "NewSchool";
    }
}

public class StaticKeyword {
    public static void main(String[] args) {
        Student.school = "Mumbai Indians";
        Student student1 = new Student();
        student1.name = "Rohit";
        System.out.println(student1.school);
    }
}
