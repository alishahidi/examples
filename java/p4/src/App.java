import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        String name = JOptionPane.showInputDialog("Enter you awesome name:");
        int age = Integer.valueOf(JOptionPane.showInputDialog("Enter your age:"));

        JOptionPane.showMessageDialog(null, "Hello " + name + ", you are: " + age + " years old");
    }
}
