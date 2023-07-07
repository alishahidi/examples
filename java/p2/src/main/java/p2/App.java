package p2;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[][] tasks = new char[4][];

        for (int j = 0; j < 4; j++) {
            tasks[j] = sc.nextLine().toCharArray();
            // Eg
            // Iter 1
            // Input: 1 22
            // ** Notice: 22 is single char
            // ** Notice: ' ' save as char
            // Output: [[1, ' ', 22]]
            // Iter 2
            // Input: 3 4 5
            // Output: [[1, ' ', 2], [3, ' ', 4, ' ', 5]]
        }

        for (int j = 0; j < 4; j++) {
            System.out.println(tasks[j]);
            // Iter 1
            // Output: [1, ' ', 2] => 1 2
            // Iter 1
            // Output: [3, ' ', 4, ' ', 5] => 3 4 5
        }

        for (int j = 0; j < 4; j++) {
            int c = 1;
            for (int i = 0; i < tasks[j].length; i++) {
                if (tasks[j][i] == ' ') {
                    c++;
                    // Count & replace blank space with +
                    tasks[j][i] = '+';
                }
            }
            System.out.println(tasks[j]);
            System.out.print(" , Count :" + c + " : ");
        }
        sc.close();
    }
}
