public class Task_4 {
    public static void main(String[] args) {
        int[] a = {8, 3, 5, 3, 9, 2, 6};

        int min = a[0];
        int index = 0;
        for (int i = 1; i < a.length; i++) {
            if (a[i] < min) {
                min = a[i];
                index = i;
            }
        }
        System.out.println("Min: " + min + ", index: " + index);
    }
}