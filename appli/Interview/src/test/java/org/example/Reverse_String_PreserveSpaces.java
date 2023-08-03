package org.example;

public class Reverse_String_PreserveSpaces {
    public static void main(String[] args) {
        String input = "internship at geeks for geeks";
        String reversedString = reverseStringWithSpaces(input);
        System.out.println("Reversed String: " + reversedString);
    }

    public static String reverseStringWithSpaces(String input) {
        char[] reversedArray = new char[input.length()];
        int j = input.length() - 1;

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) != ' ') {
                while (input.charAt(j) == ' ') {
                    j--; // Skip the space in input
                }
                reversedArray[j] = input.charAt(i);
                j--;
            } else {
                reversedArray[i] = ' '; // Preserve space
            }
        }

        return new String(reversedArray);
    }
}
