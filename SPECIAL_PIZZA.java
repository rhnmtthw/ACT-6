class SPECIAL_PIZZA extends PIZZA {
    
    private double specialCharge = 50.00;

    @Override
    public double calculatePrice() {

        double regularPrice = super.calculatePrice();

        double extraCharge = specialCharge * getHowMany();
        extraCharge = extraCharge * (1 - getDiscountRate());

        return regularPrice + extraCharge;
    }
}