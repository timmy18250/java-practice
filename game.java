import java.util.Scanner;
import java.util.Random;

public class game {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int secretnumber = random.nextInt(100)+1;
        int guess = 0;

        System.out.println("🎮 歡迎來到終極密碼！我已經想好一個 1 到 100 的數字了。");

        while (guess != secretnumber) {
            System.out.println("請輸入你猜的數字");
            guess = scanner.nextInt();

            if (guess > secretnumber) {
                System.out.println("太大了,再猜小一點");
            }
            else if (guess < secretnumber) {
                System.out.println("太小了,再猜大一點");
            }
            else {
                System.out.println("恭喜你！你猜對了，答案就是" + secretnumber + "!");
            }
        }

        scanner.close();
        System.out.println("遊戲結束,感謝遊玩");
    }
}
