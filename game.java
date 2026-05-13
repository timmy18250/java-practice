// Ch13_2, 例外的處理
public class game {
    public static void main(String[] args){
        try{               // 檢查這個程式區塊的程式碼
            int arr[]=new int[6];
            arr[5]=7;
            System.out.println("目前陣列內容: " + java.util.Arrays.toString(arr));
        }
        catch(ArrayIndexOutOfBoundsException e){
            // 如果拋出例外，便執行此區塊的程式碼
            System.out.println("超出陣列範圍");
        }
        finally{           // 這個區塊的程式碼一定會執行
            System.out.println("這行程式碼永遠都會被執行");
        }
        System.out.println("end of main()!!");
    }
}
