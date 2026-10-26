package OOPs;

interface Payment {

    void pay();
}

public class InterfaceDemo implements Payment {

    @Override
    public void pay() {
        System.out.println("Payment Successful");
    }

    public static void main(String[] args) {

        InterfaceDemo obj = new InterfaceDemo();

        obj.pay();
    }
}