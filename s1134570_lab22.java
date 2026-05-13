// 1. 定義自訂的例外類別 (繼承 Exception)
class NotTriangle extends Exception {}
class EquilateralTriangle extends Exception {}
class NotEquilateralTriangle extends Exception {}

public class s1134570_lab22 {

    public static void triangle(int a, int b, int c) throws NotTriangle, EquilateralTriangle, NotEquilateralTriangle {
        
        if (a + b <= c || a + c <= b || b + c <= a) {
            throw new NotTriangle(); 
        } 
        else if (a == b && b == c) {
            throw new EquilateralTriangle();
        } 
        else {
            throw new NotEquilateralTriangle();
        }
    }

    public static void main(String[] args) {
        int a = 3;
        int b = 3;
        int c = 3;

        try {
            triangle(a, b, c);
            
        } catch (NotTriangle e) {
            System.out.println("不構成三角形");
            
        } catch (EquilateralTriangle e) {
            System.out.println("這是正三角形");
            
        } catch (NotEquilateralTriangle e) {
            System.out.println("這不是正三角形");
            
        }
    }
}