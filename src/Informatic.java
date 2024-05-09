public class Informatic extends OfficeProducts{
    private String maker;

    public Informatic(Integer stock, String name, Double price, String maker) {
        super(stock, name, price);
        this.maker = maker;
    }

    public String getMaker() {
        return maker;
    }

    public void setMaker(String maker) {
        this.maker = maker;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Maker= "+maker);
    }
}
