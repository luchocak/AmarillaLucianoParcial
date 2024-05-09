public class Desktop extends Furniture {
    private Double height;
    private Double broad;

    public Desktop(Integer stock, String name, Double price, Double height, Double broad) {
        super(stock, name, price);
        this.height = height;
        this.broad = broad;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public Double getBroad() {
        return broad;
    }

    public void setBroad(Double broad) {
        this.broad = broad;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Height= "+height+"\nBroad= "+broad);
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
