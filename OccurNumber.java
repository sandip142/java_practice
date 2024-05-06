import java.util.Scanner;

public class OccurNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the main number:");
        long a = sc.nextLong();
        System.out.println("Enter the number to be find:");
        int b = sc.nextInt();

        int count = 0;
        while (a != 0) {
            long rem = a % 10;
            if (rem == b) {
                count++;
            }
            a = a / 10;
        }

        System.out.println("occurances ::" + count);

    }
}