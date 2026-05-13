class CCalculator {
    int a, b, c, d;

    void set_value(int w, int x, int y, int z) {
        this.a = w;
        this.b = x;
        this.c = y;
        this.d = z;
    }

    void show() {
        System.out.println("目前數值狀態: a=" + this.a + ", b=" + this.b + ", c=" + this.c + ", d=" + this.d);
    }

    int add() {
        int sum = 0;
        for (int i = 1; i <= this.a; i++) {
            sum += i;
        }
        return sum;
    }

    int sub() {
        return this.b - this.add();
    }

    long mul() {
        long fact = 1;
        for (int i = 1; i <= this.c; i++) {
            fact *= i;
        }
        return fact;
    }

    double avg() {
        return (double) this.mul() / this.d;
    }
}

public class s1134570_lab13 {
    public static void main(String[] args) {
        System.out.println("--- 建立計算機物件 ---");
        
        CCalculator calc = new CCalculator();
        calc.set_value(5, 30, 17, 10);
        calc.show();

        System.out.println("\n--- 開始執行計算 ---");
        System.out.println("(c) 1+2+...+" + calc.a + " 的結果為: " + calc.add());
        System.out.println("(d) b 減去 (1+2+...+" + calc.a + ") 的結果為: " + calc.sub());
        System.out.println("(e) " + calc.c + "! (階乘) 的結果為: " + calc.mul());
        System.out.println("(f) " + calc.c + "! / " + calc.d + " 的結果為: " + calc.avg());
    }
}
