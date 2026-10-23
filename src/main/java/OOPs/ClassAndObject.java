package OOPs;

public class ClassAndObject {

    String name;
    int age;

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {

        ClassAndObject student1 = new ClassAndObject();

        student1.name = "Muthulakshmi";
        student1.age = 21;

        student1.display();
    }
}