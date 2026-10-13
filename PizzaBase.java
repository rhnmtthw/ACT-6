public abstract class PizzaBase {

    protected static final double cmPerInch = 2.5;
    protected static final double sizeChargePerCM = 5;
    protected String pizzaType;

    public void setPizzaType(String pizzaType) {
        this.pizzaType = pizzaType;
    }
    public String getPizzaType() {
        return pizzaType;
    }
    
    public abstract double calculatePrice();
    public abstract 

}
