package objects;

public class Shape {
  private Colors color = Colors.White;
  private Boolean filled = false;
  private String name = "shape";

  public Shape() {

  }

  public Shape(String name) {
    this.name = name;
  }

  public Colors getColor() {
    return color;
  }

  public void setColor(Colors color) {
    this.color = color;
  }

  public void filled() {
    filled = true;
  }

  public void unFilled() {
    filled = false;
  }

  @Override
  public String toString() {
    return String.format("Shape: %s:%s\nColor: %s, filled: %b", this.hashCode(), name, this.color,
        filled);
  }
}
