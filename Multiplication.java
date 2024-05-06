import java.util.Scanner;

public class Multiplication {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        int[][] arr =new int[3][3];
        int[][] brr =new int[3][2];
        

        System.out.println("Enter the first array:");
        for (int rows = 0; rows < arr.length; rows++) {
            for (int cols = 0; cols < arr[rows].length; cols++) {
                arr[rows][cols] = sc.nextInt();
            }
        }

        System.out.println("Enter the second array:");
        for (int rows = 0; rows < brr.length; rows++) {
            for (int cols = 0; cols < brr[rows].length; cols++) {
                brr[rows][cols] = sc.nextInt();
            }
        }

        if(arr[arr.length].length==brr.length){
        //right the  multiplication code 
            
        }
    }
}
