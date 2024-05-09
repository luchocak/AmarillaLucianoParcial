public class OfficeProducts {
    private Integer stock;
    private String name;
    private Double price;

    public OfficeProducts(Integer stock, String name, Double price) {
        this.stock = stock;
        this.name = name;
        this.price = price;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
    public void showInfo(){
        System.out.println("Stock= "+stock+"\nname= "+name+"\nprice= "+price);
    }

    public Double calculateDiscount(Double discount){ // recibo por parametro el descuento
        Double finalDiscount = price  * discount; // guardo la cantidad a descontar
        return price -= finalDiscount; // retorno el precio menos el descuento

    }

    // metodo para actualizar los precios de los productos //
    public void updatePrices(Double percentIncrease){
        Double increase = price *(percentIncrease/100);
        price += increase;
    }

}
