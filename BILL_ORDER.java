/*class BILL_ORDER {

    public double OUT(PIZZA PIE) {

        PIE.computePrice();

        System.out.println();

        System.out.println("You ordered for "
            + PIE.getToppings()
            + " Pizza with the size of "
            + Math.round(PIE.getDiameter() * 2.54)
            + " centimeter for PHP"
            + String.format("%.0f", PIE.getPrice()) + ".");

        return PIE.getPrice();
    }
}
*/

/*class BILL_ORDER {

    public double OUT(PizzaBase PIE) {

        double bill = PIE.calculatePrice();
        double diameterCm = PIE.convertToCm(PIE.getDiameter());

        System.out.println("\n-----------------------");
         System.out.println("\nORDER DETAILS");
        System.out.println("\n-----------------------");
        System.out.println("Pizza Type: " + PIE.getPizzaType());
        System.out.println("Toppings: " + PIE.getToppings());
        System.out.printf("Diameter: %.2f centimeter%n", diameterCm);
        System.out.println("Quantity: " + PIE.getHowMany());
        System.out.println("Discount: " + PIE.getDiscount());
        System.out.printf("Discount Rate: %.2f", PIE.getDiscountRate() * 100);
        System.out.printf("Amount Due: PHP %.2f%n", bill);

        return bill;
    }
}*/

public class BILL_ORDER {

    public double OUT(PIZZA pizza) {
        System.out.println("\n========================================");
        System.out.println("             ORDER DETAILS              ");
        System.out.println("========================================");
        
        System.out.println("Pizza Type: " + pizza.getPizzaType());
        System.out.println("Toppings: " + pizza.getToppings());
        double diameterInCm = pizza.convertToCm(pizza.getDiameter());
        System.out.printf("Diameter: %.2f cm\n", diameterInCm);
        
        System.out.println("Quantity: " + pizza.getHowMany());
        System.out.println("Discount: " + pizza.getDiscount());
        
        int discountPercent = (int) (pizza.getDiscountRate() * 100);
        System.out.println("Discount Rate: " + discountPercent + "%");
        
        double amountDue = pizza.calculatePrice();
        System.out.printf("Amount Due: PHP %.2f\n", amountDue);
        
        return amountDue;
    }
}
