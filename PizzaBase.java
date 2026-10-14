/*public abstract class PizzaBase {

    protected static final cmPerInch = 2.5;
    protected  static final perCMCharge = 5;



    public abstract double calculatePrice();
    public abstract String getToppings(); 
    public abstract int getDiameter();
    public abstract int getHowMany();
    public abstract double getPrice(); 
    public abstract double getDiscountRate(); 
}*/

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

