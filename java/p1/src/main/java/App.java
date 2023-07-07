import objects.Colors;
import objects.Shape;

public class App {
    public static void main(String[] args) {
        Shape circle = new Shape("Circle");
        circle.setColor(Colors.Magenta);
        circle.filled();
        System.out.println(circle);
    }
}
