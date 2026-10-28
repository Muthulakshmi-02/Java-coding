package ExceptionHandling;

public class ArrayIndexOutOfBoundsExceptionDemo {
    public static void main(String[] args) {

        try {
            int[] arr = {10, 20, 30};

            System.out.println(arr[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid Array Index Accessed.");
        }

        System.out.println("Program continues...");
    }
}
