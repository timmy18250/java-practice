import java.util.Scanner;
import java.util.Random;

public class gamever2 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int hero = 100;
        int boss = 100;

        System.out.println("戰鬥開始!勇者遇到魔王");

        while (hero > 0 && boss > 0) {
            System.out.println("\n❤️ 勇者血量：" + hero + "  |  😈 魔王血量：" + boss);
            System.out.println("請選擇動作：(1) 攻擊 🗡️   (2) 喝藥水 🧪");

            int action = scanner.nextInt();

            if (action == 1) {
                int damage = random.nextInt(20) + 10;
                boss = boss-damage;
                System.out.println("💥 你用力揮劍，對魔王造成了 " + damage + " 點傷害！");
            }
            else if (action == 2) {
                int heal = random.nextInt(15) + 10;
                hero = hero + heal;
                System.out.println("✨ 你喝下魔法藥水，恢復了 " + heal + " 點血量！");
            }
            else {
                System.out.println("❓ 你發呆了一回合，什麼事都沒發生！");
            }

            if (boss > 0) {
                int bossdamage = random.nextInt(15) + 5;
                hero = hero - bossdamage;
                System.out.println("👾 魔王吐出火焰！對你造成了 " + bossdamage + " 點傷害！");
            }
        }

        if (hero > 0) {
            System.out.println("\n🎉 恭喜你！打敗了魔王，拯救了世界！");
        }
        else {
            System.out.println("\n💀 你被魔王打敗了，勝敗乃兵家常事，請重新來過...");
        }

        scanner.close();
    }
}
