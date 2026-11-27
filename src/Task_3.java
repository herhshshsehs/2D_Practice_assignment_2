import java.util.Scanner;
public class Task_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[8];

        System.out.println("Enter 8 integers:");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }

        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] >= 10 && a[i] <= 20) {
                count++;
            }
        }
        System.out.println("Count: " + count);
    }
}