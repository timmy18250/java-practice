import java.util.Scanner;

public class s1134570_lab10 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input=");
        int n = scanner.nextInt();

        int result = addto(n);
        System.out.println("<=n 之奇數總和值為：" + result);

        scanner.close();
    }
    
    public static int addto(int n) {
        int sum = 0;

        for (int i = 1; i <= n; i++) {

            if (i % 2 != 0) {
                sum += i;
            }
        }

        return sum;
    }
}
