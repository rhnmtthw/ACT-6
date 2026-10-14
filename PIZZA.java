
class PIZZA extends PizzaBase implements Discountable {

    private String toppings;
    private String discount;
    private int diameter;
    private int howMany;
    private double price;

    public void setToppings(String toppings) {
        this.toppings = toppings;
    }

    public void setDiameter(int diameter) {
        if (diameter > 0) {
            this.diameter = diameter;
        }
    }

    public void setHowMany(int howMany) {
        if (howMany > 0) {
            this.howMany = howMany;
        }
    }

    public void setDiscount(String discount) {
        this.discount = discount;
    }

    public String getToppings() {
        return toppings;
    }

    public int getDiameter() {
        return diameter;
    }

    public int getHowMany() {
        return howMany;
    }

    public String getDiscount() {
        return discount;
    }

    public double getPrice() {
        return price;
    }

    public double convertToCm(int diameter) {
        return diameter * 2.54;
    }

    @Override
    public double getDiscountRate() {

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

        if (toppings.equalsIgnoreCase("Pepperoni")) {
            toppingPrice = 100;
        } else if (toppings.equalsIgnoreCase("Ham and Cheese")) {
            toppingPrice = 150;
        } else if (toppings.equalsIgnoreCase("Hawaiian")) {
            toppingPrice = 200;
        }

        double centimeter = convertToCm(diameter);
        double subtotal = toppingPrice + (centimeter * 5);

        subtotal = subtotal * howMany;

        price = subtotal * (1 - getDiscountRate());

        return price;
    }
}
