import java.util.*;

public class TAKE_ORDER {

    static Scanner console = new Scanner(System.in);

    public static void main(String[] args) {

        PizzaBase selectedPizza;

        int choice;

        System.out.println("========================================");
        System.out.println("          PIZZA ORDERING SYSTEM         ");
        System.out.println("========================================");

        
        do {
            System.out.println("Enter Pizza Type:");
            System.out.println("1. Regular Pizza");
            System.out.println("2. Special Pizza");
            System.out.print("Choice: ");

            choice = console.nextInt();
            console.nextLine();

            if (choice != 1 && choice != 2) {
                System.out.println("Invalid choice! Try again.");
            }

        } while (choice != 1 && choice != 2);

    
    }
}