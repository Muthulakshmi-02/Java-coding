package OOPs;

// Parent Class
class Animal {

    void eat() {
        System.out.println("Animal is eating");
    }
}

// Child Class
public class InheritanceDemo extends Animal {

    void sound() {
        System.out.println("Animal makes a sound");
    }

    public static void main(String[] args) {

        InheritanceDemo obj = new InheritanceDemo();

        obj.eat();     // Inherited method
        obj.sound();   // Child class method
    }
}
