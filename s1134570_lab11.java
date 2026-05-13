public class s1134570_lab11 {


    public static void star(int n) {
        int sum = 0;
        
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println("呼叫 star(" + n + ") ===> 1加到" + n + "的值為: " + sum);
    }


    public static void star(int a, int b) {
        int max;
        
        if (a > b) {
            max = a;
        } else {
            max = b;
        }
        
       
        
        System.out.println("呼叫 star(" + a + ", " + b + ") ===> 最大值為: " + max);
    }

    public static void star(int a, int b, int c) {
        int result = a * b * c;
        System.out.println("呼叫 star(" + a + ", " + b + ", " + c + ") ===> 相乘的值為: " + result);
    }

   
    public static void main(String[] args) {
        
        star(5);
        star(5, 7);
        star(1, 3, 5);
    }
}
