package org.example;

import java.util.Scanner;

public class print_highest_number_exclude3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int input = scanner.nextInt();

        int highestNumber = findHighestNumberWithout3(input);
        System.out.println("Output: " + highestNumber);
    }

    private static int findHighestNumberWithout3(int num) {
        int highestNumber = 0;
        int multiplier = 1;

        while (num > 0) {
            int digit = num % 10;
            num /= 10;

            if (digit != 3) {
                highestNumber += digit * multiplier;
                multiplier *= 10;
            }
        }

        return highestNumber;
    }
}
