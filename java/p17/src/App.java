public class App {
    public static void main(String[] args) throws Exception {
        Thread myThread = new MyThread();
        myThread.start();
    }
}
