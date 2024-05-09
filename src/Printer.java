public class Printer extends Informatic {
    private Integer printPerMinute;

    public Printer(Integer stock, String name, Double price, String maker, Integer printPerMinute) {
        super(stock, name, price, maker);
        this.printPerMinute = printPerMinute;
    }

    public Integer getPrintPerMinute() {
        return printPerMinute;
    }

    public void setPrintPerMinute(Integer printPerMinute) {
        this.printPerMinute = printPerMinute;
    }


    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Print Per Minute= "+printPerMinute);
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
