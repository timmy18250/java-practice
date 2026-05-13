public class s1134570_lab21
{
    public static void main(String args[])
    {
        int num = 12;
        int den[] = {12, 0, 3, 0, 0, 4};
        
        for(int i = 0; i < 10; i++) 
        {
            try {
                System.out.println("ans=" + num / den[i]);
            } 
            catch (ArithmeticException e) {
                System.out.println("發生除以零的錯誤！(除數為0)");
            } 
            catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("陣列索引值超出範圍！(索引值 " + i + " 不存在)");
            }
        }
        System.out.println("程式正常結束！");
    }
}