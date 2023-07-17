public class App {
    public static void main(String[] args) throws Exception {
        String[][] contacts = new String[1][2];

        contacts[0][0] = "Ali Shahidi";
        contacts[0][1] = "+9892342342";

        for (int i = 0; i < contacts.length; i++) {
            for (int j = 0; j < contacts[i].length; j++) {
                contacts[i][j].trim();
                contacts[i][j].replace("S", "s");
                if (contacts[i][j].isEmpty()) {
                    System.out.println(":)");
                }
                System.out.print(contacts[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
