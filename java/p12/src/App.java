import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<String> myArray = new ArrayList<>();
        String name = "Ali";
        myArray.add(name);

        changeValue(myArray);

        System.out.println(myArray);

        System.out.println("Hello, World!");
        hello("Ali");
    }

    static void hello(String name) {
        System.out.println("Hello " + name);
    }

    static void changeValue(ArrayList<String> names) {
        names.set(0, "Reza");
    }
}
