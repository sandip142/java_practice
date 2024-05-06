import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();

        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
            if (i == 1) {
                for (int k = 3; k < arr.length; k++) {
                    System.out.print(arr[k] + " ");
                }
            }
        }
        for (int num : arr) {
            System.out.print(num + " ");
        }

        
            // System.out.println(" "+Arrays.toString(arr));
    }
}
