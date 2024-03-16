import java.util.Scanner;

public class Main {

    private static void add(double num1,double num2){
        System.out.println("Result: "+(num1+num2));
    }
    private static void substract(double num1,double num2){
        System.out.println("Result: "+(num1-num2));
    }
    private static void multiply(double num1,double num2){
        System.out.println("Result: "+(num1*num2));
    }
    private static void divide(double num1,double num2){
        if (num2!=0) {
            System.out.println("Result: " + (num1 - num2));
        }else{
            System.out.println("Error: Division by zero is not allowed");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("-Simple Calculator-");

        while (true){
            System.out.println("\n Choose an operation");
            System.out.println("1. Addition");
            System.out.println("2. Substraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exit");

            int choice = scanner.nextInt();
            if (choice==5){
                System.out.println("Exiting the calculator. Good bye...");
                break;
            }
            System.out.println("Enter the first number: ");
            double num1 = scanner.nextDouble();
            System.out.println("Enter the second number: ");
            double num2 = scanner.nextDouble();

            switch (choice){
                case 1:
                    add(num1,num2);
                    break;
                case 2:
                    substract(num1,num2);
                    break;
                case 3:
                    multiply(num1,num2);
                    break;
                case 4:
                    divide(num1,num2);
                    break;
                default:
                    System.out.println("Invalid choice!");
                    break;
            }
        }
    }
}