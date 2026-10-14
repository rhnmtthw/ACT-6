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
