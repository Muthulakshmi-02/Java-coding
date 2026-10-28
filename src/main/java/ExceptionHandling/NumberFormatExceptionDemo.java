package ExceptionHandling;

public class NumberFormatExceptionDemo {
    public static void main(String[] args) {

        try {
            String str = "ABC";

            int num = Integer.parseInt(str);

            System.out.println("Number = " + num);

        } catch (NumberFormatException e) {
            System.out.println("Invalid number format.");
        }

        System.out.println("Program continues...");
    }
}