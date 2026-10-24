package OOPs;

public class ConstructorDemo {

    String name;
    int age;

    // Constructor
    ConstructorDemo(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {

        ConstructorDemo student1 = new ConstructorDemo("Muthulakshmi", 21);

        student1.display();
    }
}