import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String argvs[]) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int q = scanner.nextInt();

        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            numbers.add(scanner.nextInt());
        }

        Collections.sort(numbers);

        List<Integer> cases = new ArrayList<>();
        for (int i = 0; i < q; i++) {
            cases.add(scanner.nextInt());
        }

        List<Integer> tests = new ArrayList<>();
        for (int nu : cases) {
            int count = 0;
            if (nu > numbers.get(n - 1)){
                System.out.println(n);
                continue;
            }
            for(int t = 0; t < n; t++){
                int getNumber = numbers.get(t);
                if(getNumber > nu){
                    count = t;
                    break;
                }
                else if(getNumber == nu){
                    count = t;
                    break;
                }
            }
            System.out.println(count);
        }
    }
}
