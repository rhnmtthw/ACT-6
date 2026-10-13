public class PIZZA extends PizzaBase implements Discountable {

    private String toppings;
    private String discount;
    private int Diameter;
    private int HowMany;
    private double price;

    public void setToppings(String toppings) {
        this.toppings = toppings;
    }

    public void setDiameter(int Diameter) {
        this.Diameter = Diameter;
    }

    public void setHowMany(int HowMany) {
        this.HowMany = HowMany;
    }

    public void setDiscount(String discount) {
        this.discount = discount;
    }

    public String getToppings() {
        return toppings;
    }

    public int getDiameter() {
        return Diameter;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public double getDiscountRate() {
        if (discount == null) {
            return 0.0;
        }
        if (discount.equalsIgnoreCase("Senior Citizen")) {
            return 0.20;
        } else if (discount.equalsIgnoreCase("VIPCard")) {
            return 0.12;
        }
        return 0.0;
    }
   
    @Override
    public double calculatePrice() {
        double toppingPrice = 0;
        double centimeter = Diameter * 2.54; // Fixed: 2.54 cm per inch

        if (toppings.equalsIgnoreCase("Pepperoni")) {
            toppingPrice = 100;
        } else if (toppings.equalsIgnoreCase("Ham and Cheese")) {
            toppingPrice = 150;
        } else if (toppings.equalsIgnoreCase("Hawaiian")) {
            toppingPrice = 200;
        } else {
            System.out.println("Invalid toppings!");
            return 0.0;
        }

        price = toppingPrice + (centimeter * 5);
        price = price * HowMany;

        double discountRate = getDiscountRate();
        price = price * (1.0 - discountRate);

        return price;
    }
}