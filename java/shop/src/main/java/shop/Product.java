package shop;

import java.util.Date;

public class Product {
  private String name;
  private Double price;
  private String company;
  private Date createdAt;
  private static int count = 0;
  private int id;

  public Product(String name, Double price, String company, Date createAt) {
    setName(name);
    setCompany(company);
    setCreatedAt(createAt);
    setPrice(price);
    setId();
  }

  public Product() {
    setId();
  }

  public int getId() {
    return id;
  }

  private void setId() {
    id = ++count;
  }

  public String getName() {
    return name;
  }

  public void setName(String _name) {
    name = _name;
  }

  public Double getPrice() {
    return price;
  }

  public void setPrice(Double _price) {
    price = _price;
  }

  public String getCompany() {
    return company;
  }

  public void setCompany(String _company) {
    company = _company;
  }

  public Date getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(Date _createdAt) {
    createdAt = _createdAt;
  }

}
