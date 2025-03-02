package controlflow;

public class NumberPatterns {
    public static void main(String[] args) {
        int rows = 5; // Adjust the number of rows based on your image
        pattern1(rows);

    }
    // First pattern: Each row contains the same number repeated
    private static void pattern1(int rows) {
        for (int i = 1; i <= rows; i++) {
            printSpaces(rows - i);
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    // Second pattern: Each row contains numbers from 1 to row number
    private static void pattern2(int rows) {
        for (int i = 1; i <= rows; i++) {
            printSpaces(rows - i);
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    // Third pattern: Numbers increment sequentially across rows
    private static void pattern3(int rows) {
        int num = 1;
        for (int i = 1; i <= rows; i++) {
            printSpaces(rows - i);
            for (int j = 1; j <= i; j++) {
                System.out.print(num++ + " ");
            }
            System.out.println();
        }
    }

    // Fourth pattern: Pyramid of stars
    private static void pattern4(int rows) {
        for (int i = 1; i <= rows; i++) {
            printSpaces(rows - i);
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // Helper method to print leading spaces for pyramid alignment
    private static void printSpaces(int n) {
        for (int i = 0; i < n; i++) {
            System.out.print("-");
        }
    }
}
