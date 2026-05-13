import java.util.Scanner;

public class matrixtranspose {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("請輸入原始矩陣的行數=>");
        int cols = scanner.nextInt();
        
        System.out.print("請輸入原始矩陣的列數=>");
        int rows = scanner.nextInt();

        int[][] A = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("A[" + i + "][" + j + "]元素值=>");
                A[i][j] = scanner.nextInt();
            }
        }

        System.out.println("原始矩陣");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(A[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("轉置矩陣");
        for (int j = 0; j < cols; j++) {
            for (int i = 0; i < rows; i++) {
                System.out.print(A[i][j] + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}