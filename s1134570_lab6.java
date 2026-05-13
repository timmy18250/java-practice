import java.util.Scanner;

public class s1134570_lab6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("請輸入 1~12 的整數：");
        int month = scanner.nextInt();

        switch (month) {
            case 1:
            case 2:
                System.out.println("寒假");
                break;

            case 7:
            case 8:
                System.out.println("暑假");
                break;

            case 9:
            case 10:
            case 11:
            case 12:
                System.out.println("上學期");
                break;

            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("下學期");
                break;

            default:
                System.out.println("不存在");
                break;
        }

        scanner.close();
    }
}
