public class Task_7 {
    public static void main(String[] args) {
        int[] a = {3, 8, 5, 2, 7, 4, 9, 6};

        int[] evens = new int[a.length];
        int size = 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                evens[size] = a[i];
                size++;
            }
        }

        for (int i = 0; i < size; i++) {
            System.out.print(evens[i] + " ");
        }
        System.out.println();
    }
}