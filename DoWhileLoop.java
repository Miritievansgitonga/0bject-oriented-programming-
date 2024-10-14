import java.util.Scanner;

public class DoWhileLoop{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;

        // do-while loop
        do {
            System.out.print("Enter a positive number (enter a negative number to stop): ");
            number = scanner.nextInt();

            if (number >= 0) {
                System.out.println("You entered: " + number);
            }

        } while (number >= 0);

        System.out.println("Loop terminated because a negative number was entered.");
        scanner.close();
    }
}
