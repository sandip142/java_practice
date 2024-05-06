import java.util.Scanner;

public class fibonacci {
 public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
   System.out.println("enter the range:");
   int n= sc.nextInt();
   int a=0,b=1,temp;
   System.out.print("fibonnaci Range is:: "+a+" "+b+" ");
   for(int i=0;i<n;i++)
   {
    temp =b;
    b=a+b;
    a=temp;
    System.out.print(+b+" ");
   }

 }
}