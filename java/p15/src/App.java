public class App {
    public static void main(String[] args) throws Exception {
        Double[] doubleArray = { 1.2, 1.1, 1.0 };
        displayArray(doubleArray);
    }

    public static <Any> void displayArray(Any[] array) {
        for (Any a : array) {
            System.out.println(a);
        }
    }
}
