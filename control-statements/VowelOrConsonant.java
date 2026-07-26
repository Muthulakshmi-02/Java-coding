package org.example;

import java.util.Scanner;

public class VowelOrConsonant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);

        // Convert to lowercase to handle both 'A' and 'a' easily
        ch = Character.toLowerCase(ch);

        if (Character.isLetter(ch)) {
            switch (ch) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    System.out.println(ch + " is a Vowel");
                    break;
                default:
                    System.out.println(ch + " is a Consonant");
            }
        } else {
            System.out.println("Invalid input: Not an alphabetic character");
        }
    }
}
