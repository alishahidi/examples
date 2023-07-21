import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App{
    public static void main(String argvs[]){
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        
        List<Integer> numbers = new ArrayList<>();
        for(int i = 0; i < n; i++){
            numbers.add(scanner.nextInt());
        }
        
        List<Integer> cases = new ArrayList<>();
        for(int i = 0; i < m; i++){
            cases.add(scanner.nextInt());
        }
        
        List<Integer> tests = new ArrayList<>();
        for(int case: cases){
            int checked = 0;
            for(int num: numbers){
                if(case > num){
                    checked++;
                }
            }
            tests.add(checked);
        }
        
        for(int test: tests){
            System.out.println(test);
        }
    }
}