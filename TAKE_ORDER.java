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

        if (choice == 1) {
            selectedPizza = new PIZZA();
            selectedPizza.setPizzaType("Regular Pizza");
        } else {
            selectedPizza = new SPECIAL_PIZZA();
            selectedPizza.setPizzaType("Special Pizza");
        }

        PIZZA PIE = (PIZZA) selectedPizza;

        String toppings;

        do {
            System.out.print("Enter Toppings: ");
            toppings = console.nextLine();

            if (!toppings.equalsIgnoreCase("Pepperoni")
                    && !toppings.equalsIgnoreCase("Ham and Cheese")
                    && !toppings.equalsIgnoreCase("Hawaiian")) {

                System.out.println("Invalid!");
            }

        } while (!toppings.equalsIgnoreCase("Pepperoni")
                && !toppings.equalsIgnoreCase("Ham and Cheese")
                && !toppings.equalsIgnoreCase("Hawaiian"));

        PIE.setToppings(toppings);

        int diameter;

        do {
            System.out.print("Enter Diameter in inches: ");
            diameter = console.nextInt();

            if (diameter <= 0) {
                System.out.println("Invalid");
            }

        } while (diameter <= 0);

        PIE.setDiameter(diameter);

        int howMany;

        do {
            System.out.print("Enter How Many?: ");
            howMany = console.nextInt();

            if (howMany <= 0) {
                System.out.println("Invalid");
            }

        } while (howMany <= 0);

        PIE.setHowMany(howMany);
        console.nextLine();

        String discount;

        do {
            System.out.print("Enter Type of Discount: ");
            discount = console.nextLine();

            if (!discount.equalsIgnoreCase("Senior Citizen")
                    && !discount.equalsIgnoreCase("VIPCard")
                    && !discount.equalsIgnoreCase("No Discount")) {

                System.out.println("Invalid discount");
            }

        } while (!discount.equalsIgnoreCase("Senior Citizen")
                && !discount.equalsIgnoreCase("VIPCard")
                && !discount.equalsIgnoreCase("No Discount"));

        PIE.setDiscount(discount);

        BILL_ORDER bill = new BILL_ORDER();

        double amountReceived;
        double amountDue = Math.round(bill.OUT(PIE) * 100.0) / 100.0;

        do {
            System.out.print("\nEnter Amount Received: ");
            amountReceived = console.nextDouble();
            if(amountReceived < amountDue){
                System.out.println("Amount Received must be greater than Amount Due.");
            }
        } while (amountReceived < amountDue);
         
        System.out.printf("Change: PHP%.2f", amountReceived - amountDue);
    }
}
