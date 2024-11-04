import java.util.Scanner;

public class IT24103949Lab3Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a rupee amount
        System.out.print("Enter the rupee amount: ");
        int amount = scanner.nextInt();

        // Calculate the number of each denomination
        int num5000 = amount / 5000;
        amount %= 5000;

        int num1000 = amount / 1000;
        amount %= 1000;

        int num500 = amount / 500;
        amount %= 500;

        int num200 = amount / 200;
        amount %= 200;

        int num100 = amount / 100;
        amount %= 100;

        int num50 = amount / 50;
        amount %= 50;

        int num20 = amount / 20;
        amount %= 20;

        int num10 = amount / 10;
        amount %= 10;

        int num5 = amount / 5;
        amount %= 5;

        int num2 = amount / 2;
        amount %= 2;

        int num1 = amount;

        // Print the results
        System.out.println("Number of 5000/= notes: " + num5000);
        System.out.println("Number of 1000/= notes: " + num1000);
        System.out.println("Number of 500/= notes: " + num500);
        System.out.println("Number of 200/= notes: " + num200);
        System.out.println("Number of 100/= notes: " + num100);
        System.out.println("Number of 50/= notes: " + num50);
        System.out.println("Number of 20/= notes: " + num20);
        System.out.println("Number of 10/= notes: " + num10);
        System.out.println("Number of 5/= coins: " + num5);
        System.out.println("Number of 2/= coins: " + num2);
        System.out.println("Number of 1/= coins: " + num1);
    }
}
