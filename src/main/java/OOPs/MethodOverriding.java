package OOPs;
// Parent Class

class Vehicle {


    void start() {

        System.out.println("Vehicle is starting");

    }

}
// Child Class
public class MethodOverriding extends Vehicle {

    @Override
    void start() {
        System.out.println("Car is starting with key");
    }

    public static void main(String[] args) {

        MethodOverriding car = new MethodOverriding();

        car.start();
    }
}