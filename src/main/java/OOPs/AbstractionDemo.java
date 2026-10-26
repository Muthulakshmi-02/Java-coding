package OOPs;

abstract class Student {

    abstract void study();

    void attendClass() {
        System.out.println("Student is attending class");
    }
}

public class AbstractionDemo extends Student {

    @Override
    void study() {
        System.out.println("Student is studying Java");
    }

    public static void main(String[] args) {

        AbstractionDemo obj = new AbstractionDemo();

        obj.study();
        obj.attendClass();
    }
}