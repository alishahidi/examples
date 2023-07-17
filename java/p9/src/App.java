import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(1);        
        numbers.add(4);
        numbers.add(5);
        numbers.add(9);

        numbers.set(0, 10);

        System.out.println(numbers.toString());
    }
}