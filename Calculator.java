
import java.util.Scanner;
class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("Menu:");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    add(scanner);
                    break;
                case 2:
                    subtract(scanner);
                    break;
                case 3:
                    multiply(scanner);
                    break;
                case 4:
                    divide(scanner);
                    break;
                case 5:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 5);
    }

    private static void add(Scanner scanner) {
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();
        System.out.println("Result: " + (num1 + num2));
    }

    private static void subtract(Scanner scanner) {
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();
        System.out.println("Result: " + (num1 - num2));
    }

    private static void multiply(Scanner scanner) {
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();
        System.out.println("Result: " + (num1 * num2));
    }

    private static void divide(Scanner scanner) {
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();
        if (num2 != 0) {
            System.out.println("Result: " + (num1 / (double) num2));
        } else {
            System.out.println("Error: Division by zero is not allowed.");
        }
    }
}