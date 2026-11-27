public class Task_6 {
    public static void main(String[] args) {
        int[] a = {6, 9, 3, 8, 6, 10, 2, 7};

        int count = 0;
        for (int i = 1; i < a.length; i++) {
            if (a[i] > a[0]) {
                count++;
            }
        }
        System.out.println("Count: " + count);
    }
}