import java.util.Scanner;

public class s1134570_lab5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("請輸入成績：");
        int score = scanner.nextInt();

        if (score < 0 || score > 100) {
            System.out.println("成績輸入錯誤");
        } 
        else if (score >= 60 && score <= 100) {
            System.out.println("及格");
        } 
        else if (score >= 50 && score <= 59) {
            System.out.println("須要補考");
        } 
        else {
            System.out.println("不及格");
        }

        scanner.close();
    }
}
