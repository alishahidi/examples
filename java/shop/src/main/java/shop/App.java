package shop;

import java.util.ArrayList;
import java.util.Date;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        ArrayList<Product> products = new ArrayList<>();

        products.add(new Product("Milk", 2.3, "American milker", new Date()));
        products.add(new Product("Egg", 2.0, "American egger", new Date()));
        products.add(new Product("Water", .3, "American waterer", new Date()));

        Store AliStore = new Store(products);
        AliStore.printProducts();

        AliStore.buyProduct("Egg");
        AliStore.buyProduct(1);
        AliStore.printProducts();
    }
}
