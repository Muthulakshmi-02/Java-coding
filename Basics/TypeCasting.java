public class TypeCasting {
    public static void main(String[] args) {
        // Implicit casting (widening) - smaller type to larger type, done automatically
        int num = 100;
        double implicitCast = num; // int to double, automatic
        System.out.println("Implicit casting (int to double): " + implicitCast);

        // Explicit casting (narrowing) - larger type to smaller type, done manually
        double price = 99.99;
        int explicitCast = (int) price; // double to int, manual
        System.out.println("Explicit casting (double to int): " + explicitCast);

        // Another example: char to int
        char letter = 'A';
        int letterCode = letter; // implicit, gives ASCII value
        System.out.println("Character 'A' as int (ASCII): " + letterCode);
    }
}
