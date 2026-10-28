package ExceptionHandling;

public class MultipleCatchDemo {
    public static void main(String[] args) {

        try {

            String str = null;
            System.out.println(str.length());

            int result = 10 / 0;
            System.out.println(result);

        } catch (NullPointerException e) {
            System.out.println("Null Pointer Exception Handled.");
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception Handled.");
        } catch (Exception e) {
            System.out.println("Some Other Exception Handled.");
        }

        System.out.println("Program Continues...");
    }
}