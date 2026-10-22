package Strings;

import java.util.Scanner;

public class FindDuplicateCharacters {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine().toLowerCase();

        System.out.println("Duplicate characters:");

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            // Skip spaces
            if (ch == ' ') {
                continue;
            }

            boolean duplicate = false;

            for (int j = i + 1; j < str.length(); j++) {
                if (ch == str.charAt(j)) {
                    duplicate = true;
                    break;
                }
            }

            // Check whether character was already printed
            boolean alreadyPrinted = false;

            for (int k = 0; k < i; k++) {
                if (ch == str.charAt(k)) {
                    alreadyPrinted = true;
                    break;
                }
            }

            if (duplicate && !alreadyPrinted) {
                System.out.println(ch);
            }
        }

        sc.close();
    }
}