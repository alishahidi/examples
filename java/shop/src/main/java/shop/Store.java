package shop;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.function.Predicate;

public class Store {
  private ArrayList<Product> products;

  public Store(ArrayList<Product> products) {
    setProducts(products);
  }

  public ArrayList<Product> getProducts() {
    return products;
  }

  public void setProducts(ArrayList<Product> _products) {
    products = _products;
  }

  public Product findProductById(int id) {
    for (Product product : products) {
      if (product.getId() == id) {
        return product;
      }
    }

    return null;
  }

  public Product findProductByName(String name) {
    for (Product product : products) {
      if (product.getName().equals(name)) {
        return product;
      }
    }

    return null;
  }

  public Product buyProduct(int id) {
    return findAndRemoveProduct(p -> p.getId() == id);
  }

  public Product buyProduct(String name) {
    return findAndRemoveProduct(p -> p.getName().equals(name));
  }

  private Product findAndRemoveProduct(Predicate<Product> condition) {
    Iterator<Product> iterator = products.iterator();
    while (iterator.hasNext()) {
      Product product = iterator.next();
      if (condition.test(product)) {
        iterator.remove();
        return product;
      }
    }

    return null;
  }

  public void printProducts() {
    System.out.println("List of exists products: \n");
    for (Product product : products) {
      System.out.format("ID: %d\n", product.getId());
      System.out.format("\tName: %s\n", product.getName());
      System.out.format("\tPrice: %.2f\n", product.getPrice());
      System.out.format("\tCompany: %s\n", product.getCompany());
      System.out.format("\tCreate At: %s\n\n", product.getCreatedAt().toString());
    }
  }
}
