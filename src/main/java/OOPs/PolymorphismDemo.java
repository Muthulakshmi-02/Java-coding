package OOPs;

public class PolymorphismDemo {

    void display() {
        System.out.println("No Parameters");
    }

    void display(String name) {
        System.out.println("Name: " + name);
    }

    void display(String name, int age) {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {

        PolymorphismDemo obj = new PolymorphismDemo();

        obj.display();
        obj.display("Muthulakshmi");
        obj.display("Muthulakshmi", 21);
    }
}