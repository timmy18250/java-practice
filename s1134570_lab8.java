public class s1134570_lab8 {
    public static void main(String[] args) {
        int[] array = {3, 5, 0, 3, 2, 4, 1, 6, 8, 5, 4, 3, 2, 7, 2, 5, 11, 12, 13, 1, 7, 11};

        int count3to7 = 0;
        int count11to12 = 0;

        for (int num : array) {
            
            if (num >= 3 && num <= 7) {
                count3to7++;
            }

            if (num >= 11 && num <= 12) {
                count11to12++;
            }
        }

        System.out.println("3~7 之間的元素共有：" + count3to7 + " 個");
        System.out.println("11~12 之間的元素共有：" + count11to12 + " 個");
    }
}