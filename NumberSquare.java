import java.util.Scanner;

public class NumberSquare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("輸入:");
        int n = scanner.nextInt();
        
        int size = 2 * n - 1;
        
        System.out.println("輸出:");
        
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                
                int top = i;
                int bottom = (size - 1) - i;
                int left = j;
                int right = (size - 1) - j;
                
                int minDistance = Math.min(Math.min(top, bottom), Math.min(left, right));
                
                System.out.print(n - minDistance);
            }
            System.out.println();
        }
        scanner.close();
    }
}
