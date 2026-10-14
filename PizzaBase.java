abstract class PizzaBase {

    protected String pizzaType;

    public void setPizzaType(String pizzaType) {
        this.pizzaType = pizzaType;
    }

    public String getPizzaType() {
        return pizzaType;
    }

    public abstract double calculatePrice();
    public abstract int getDiameter();
    public abstract String getToppings();
    public abstract int getHowMany();
    public abstract String getDiscount();
    public abstract double getDiscountRate();
}

