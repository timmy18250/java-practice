import java.util.Scanner;

public class s1134570_lab4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("請輸入一個長度為3個字元的字串:");
        String input = scanner.next();

        if (input.length() < 3) {
            System.out.println("輸入錯誤！請至少輸入3個字元。");
            scanner.close();
            return; 
        }

        char c1 = input.charAt(0);
        char c2 = input.charAt(1);
        char c3 = input.charAt(2);

        int pos1 = getAlphabetPosition(c1);
        int pos2 = getAlphabetPosition(c2);
        int pos3 = getAlphabetPosition(c3);

        System.out.println("第 1個字母為" + c1 + ", " + c1 + "為英文中第" + pos1 + "個字母");
        System.out.println("第二個字母為" + c2 + ", " + c2 + "為英文中第" + pos2 + "個字母");
        System.out.println("第三個字母為" + c3 + ", " + c3 + "為英文中第" + pos3 + "個字母");

        scanner.close();
    }

    public static int getAlphabetPosition(char ch) {
        char lowerCh = Character.toLowerCase(ch);
        
        int position = lowerCh - 'a' + 1;
        
        return position;
    }
}
