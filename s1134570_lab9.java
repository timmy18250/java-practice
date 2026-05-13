public class s1134570_lab9 {
    public static void main(String[] args) {
        // 1. 定義學生成績表格 (3位同學 x 5天)
        int[][] scores = {
            {83, 90, 76, 83, 89}, // 同學一
            {68, 88, 92, 60, 76}, // 同學二
            {79, 93, 67, 91, 78}  // 同學三
        };

        String[] days = {"星期一", "星期二", "星期三", "星期四", "星期五"};
        String[] students = {"同學一", "同學二", "同學三"};

        // --- 2. 計算每位同學平均 (橫向) ---
        double[] studentAvg = new double[3];
        for (int i = 0; i < 3; i++) {
            int sum = 0;
            for (int j = 0; j < 5; j++) {
                sum += scores[i][j];
            }
            studentAvg[i] = sum / 5.0;
            System.out.println(students[i] + " 平均：" + studentAvg[i]);
        }

        // --- 3. 計算每日平均 (縱向) ---
        for (int j = 0; j < 5; j++) {
            int sum = 0;
            for (int i = 0; i < 3; i++) {
                sum += scores[i][j];
            }
            System.out.println(days[j] + " 平均：" + (sum / 3.0));
        }

        // --- 4. 找最高與最低 ---
        int maxScore = scores[0][0], minScore = scores[0][0];
        int maxSIdx = 0, maxDIdx = 0, minSIdx = 0, minDIdx = 0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                if (scores[i][j] > maxScore) {
                    maxScore = scores[i][j];
                    maxSIdx = i; maxDIdx = j;
                }
                if (scores[i][j] < minScore) {
                    minScore = scores[i][j];
                    minSIdx = i; minDIdx = j;
                }
            }
        }

        // --- 5. 輸出最後結果 ---
        System.out.println("第一名的同學為：" + students[getMaxAvgIndex(studentAvg)]);
        System.out.println("成績最高的日子與同學為：" + days[maxDIdx] + " 的 " + students[maxSIdx]);
        System.out.println("成績最低的日子與同學為：" + days[minDIdx] + " 的 " + students[minSIdx]);
    }

    // 小工具：幫忙找平均最高的那個人
    public static int getMaxAvgIndex(double[] avg) {
        int maxIdx = 0;
        for (int i = 1; i < avg.length; i++) {
            if (avg[i] > avg[maxIdx]) maxIdx = i;
        }
        return maxIdx;
    }
}