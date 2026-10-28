package ExceptionHandling;

public class NullPointerExceptionDemo {
    public static void main(String[] args) {

        try {
            String str = null;

            System.out.println(str.length());

        } catch (NullPointerException e) {
            System.out.println("Cannot perform operation on a null object.");
        }

        System.out.println("Program continues...");
    }
}
