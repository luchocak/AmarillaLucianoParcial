import java.util.ArrayList;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        ArrayList<OfficeProducts> products = new ArrayList<>(); // creo el arraylist


        Chair char1 = new Chair(200, "Living chair", 100.0, "yes", 4);
        Desktop desktop1 = new Desktop(500, "Office Desktop", 600.0, 60.0, 160.0);
        Notebooks notebook1 = new Notebooks(200,"Student Notebook", 250.0,"Lenovo",500);
        Printer printer1 = new Printer(80, "Colour Printer", 100.0, notebook1.getMaker(), 4000);

        // agrego los productos creados al array//
        products.add(char1);
        products.add(desktop1);
        products.add(notebook1);
        products.add(printer1);


        // hago un for para tratar de recorrer el array y mostrar
        System.out.println("Lista de productos:\n");
        for (int i = 0; i < products.size(); i++) {
            OfficeProducts product = products.get(i);
            System.out.println("------------------------------------------");
            product.showInfo();//no me salio aplicarlo con el toString//
        }

        // descuento para clientes especiales
        Double discountClient = 0.15;// ej de descuento//


        // Actualizacion de precios //
        for(int i = 0; i < products.size(); i++){
            OfficeProducts product = products.get(i);

            // no encontre la forma de poner los Case bien //
            switch (product){
                case:
                    product.showInfo();
                    product.updatePrices(0.5);
                    System.out.println("New Price: \n");
                    product.showInfo();
                    break;
                case:
                    product.showInfo();
                    product.updatePrices(0.10);
                    System.out.println("New Price: \n");
                    product.showInfo();
                    break;
                case:
                    product.showInfo();
                    product.updatePrices(0.15);
                    System.out.println("New Price: \n");
                    product.showInfo();
                    break;
                case:
                    product.showInfo();
                    product.updatePrices(0.20);
                    System.out.println("New Price: \n");
                    product.showInfo();
                    break;
                default:
                    System.out.println("Product doesnt Exist");

            }


        }



    }
}