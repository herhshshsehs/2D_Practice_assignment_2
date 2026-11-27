public class Task_5 {
    public static void main(String[] args) {
        int[] a = {1, 4, -2, 0, 8, 3};

        for (int i = 0; i < a.length; i++) {
            a[i] = a[i] + 5;
        }

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
}