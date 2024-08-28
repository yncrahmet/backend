import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        multipTable();

        System.out.println("**********************************************");

        System.out.println("Will you create another multiplication table?");
        System.out.print("Just say yes or no.");

        String answer = scanner.next();

        while (answer.equals("yes")){

            multipTable();

            System.out.println("**********************************************");

            System.out.println("Will you create another multiplication table?");
            System.out.print("Just say yes or no.");

            answer = scanner.next();
        }

    }

    public static void multipTable(){

        System.out.println("Which number do you want to create a multiplication table for?");
        System.out.println("Enter an number...");

        int enteredNumber = scanner.nextInt();

        for (int i = 1; i <= enteredNumber; i++){
            for (int j = 1; j <= enteredNumber; j++){
                System.out.print((i * j) + " ");
            }
            System.out.println();
        }

    }

}