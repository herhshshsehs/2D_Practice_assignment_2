public class Task_2 {
    public static void main(String[] args) {
        int[] a = {3, -2, 0, 7, -4, 5};

        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > 0) {
                sum += a[i];
            }
        }
        System.out.println("Sum: " + sum);
    }
}