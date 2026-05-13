abstract class Math {
    protected int ans1, ans2, ans3, ans4;
    
    public void show() {
        System.out.println("ans1=" + ans1);
        System.out.println("ans2=" + ans2);
        System.out.println("ans3=" + ans3);
        System.out.println("ans4=" + ans4);
    }
    
    public abstract void add(int a, int b);
    public abstract void sub(int a, int b);
    public abstract void mul(int a, int b);
    public abstract void div(int a, int b);
}

class Compute extends Math {
    @Override
    public void add(int a, int b) {
        ans1 = a + b;
    }
    
    @Override
    public void sub(int a, int b) {
        ans3 = a - b;
    }
    
    @Override
    public void mul(int a, int b) {
        ans2 = a * b;
    }
    
    @Override
    public void div(int a, int b) {
        ans4 = a / b;
    }
}

public class s1134570_lab19 {
    public static void main(String args[]) {
        Compute cmp = new Compute();
        cmp.add(5, 2);
        cmp.mul(3, 5);
        cmp.sub(7, 2);
        cmp.div(4, 2);
        cmp.show(); 
    }
}
