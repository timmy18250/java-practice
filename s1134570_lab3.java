import java.util.Scanner;

public class s1134570_lab3 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("請輸入姓名=\n"); 
    String name = scanner.next();

    System.out.print("請輸入第1個值=\n");
    int a = scanner.nextInt();

    System.out.print("請輸入第2個值=\n");
    int b = scanner.nextInt();

    System.out.println("Output:");

    double result = (double) a / b;

    System.out.println("Hi, " + name + "! A/B = " + result);
    scanner.close();
    }
}

