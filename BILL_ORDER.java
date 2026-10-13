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

class BILL_ORDER {

    public double OUT(PizzaBase PIE) {

        double bill = PIE.calculatePrice();

        double diameterCm = PIE.convertToCm(PIE.getDiameter());

        System.out.println("\n----- ORDER DETAILS -----");
        System.out.println("Pizza Type: " + PIE.getPizzaType());
        System.out.println("Toppings: " + PIE.getToppings());

        System.out.printf("Diameter: %.2f centimeter%n", diameterCm);

        System.out.println("Quantity: " + PIE.getHowMany());
        System.out.println("Discount: " + PIE.getDiscount());

        System.out.printf("Amount Due: PHP %.2f%n", bill);

        return bill;
    }
}