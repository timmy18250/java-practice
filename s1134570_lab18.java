class CShape {
    public double area() {
        return 0.0;
    }
}

class CCircle extends CShape {
    private double radius;

    public CCircle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
}

class CSquare extends CShape {
    private double side;

    public CSquare(double side) {
        this.side = side;
    }

    @Override
    public double area() {
        return side * side;
    }
}

class CTriangle extends CShape {
    private double base;
    private double height;

    public CTriangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double area() {
        return (base * height) / 2.0;
    }
}

public class s1134570_lab18 {
    
    public static double largest(CShape[] shapes) {
        double maxArea = 0.0;
        for (int i = 0; i < shapes.length; i++) {
            if (shapes[i].area() > maxArea) {
                maxArea = shapes[i].area();
            }
        }
        return maxArea;
    }

    public static void main(String[] args) {
        CCircle c1 = new CCircle(5.0);
        CCircle c2 = new CCircle(3.0);
        
        CSquare s1 = new CSquare(4.0);
        CSquare s2 = new CSquare(10.0);
        
        CTriangle t1 = new CTriangle(4.0, 5.0);
        CTriangle t2 = new CTriangle(8.0, 6.0);

        CShape[] myShapes = {c1, c2, s1, s2, t1, t2};

        System.out.printf("圓形 c1 面積: %.2f\n", c1.area());
        System.out.printf("圓形 c2 面積: %.2f\n", c2.area());
        System.out.printf("正方形 s1 面積: %.2f\n", s1.area());
        System.out.printf("正方形 s2 面積: %.2f\n", s2.area());
        System.out.printf("三角形 t1 面積: %.2f\n", t1.area());
        System.out.printf("三角形 t2 面積: %.2f\n", t2.area());
        System.out.println("-------------------------");

        double max = largest(myShapes);
        System.out.printf("所有物件中，最大的面積為: %.2f\n", max);
    }
}