import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<ArrayList<String>> menu = new ArrayList<>();

        ArrayList<String> drinks = new ArrayList<>();
        drinks.add("Bear");
        drinks.add("Water");
        drinks.add("Milk");

        ArrayList<String> foods = new ArrayList<>();
        foods.add("Kebab");
        foods.add("Rise");

        menu.add(drinks);
        menu.add(foods);

        System.out.println(menu.toString());
    }
}
