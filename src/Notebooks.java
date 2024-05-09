public class Notebooks extends Informatic {
    private Integer gygas;

    public Notebooks(Integer stock, String name, Double price, String maker, Integer gygas) {
        super(stock, name, price, maker);
        this.gygas = gygas;
    }

    public Integer getGygas() {
        return gygas;
    }

    public void setGygas(Integer gygas) {
        this.gygas = gygas;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Gygas= "+gygas);
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
