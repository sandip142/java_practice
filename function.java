import java.util.Arrays;

public class function {
    public static void main(String[] args) {
      int[] arr = {10,20,30,40,50};
      PrintArray(arr,10,20,30,40,50,60);
    }
    static void PrintArray(int[] arr,int ...x){
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(x));
    }
}
