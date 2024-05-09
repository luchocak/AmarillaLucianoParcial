public class Chair extends Furniture {
    private String wheels;
    private Integer numberWheels;

    public Chair(Integer stock, String name, Double price, String wheels, Integer numberWheels) {
        super(stock, name, price);
        this.wheels = wheels;
        this.numberWheels = numberWheels;
    }

    public String getWheels() {
        return wheels;
    }

    public void setWheels(String wheels) {
        this.wheels = wheels;
    }

    public Integer getNumberWheels() {
        return numberWheels;
    }

    public void setNumberWheels(Integer numberWheels) {
        this.numberWheels = numberWheels;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("wheels= "+wheels+"\nNumber Wheels= "+numberWheels);
    }

    @Override
    public Double calculateDiscount(Double discount) {
        return super.calculateDiscount(discount);
    }

    @Override
    public void updatePrices(Double percentIncrease) {
        super.updatePrices(percentIncrease);
    }
}
