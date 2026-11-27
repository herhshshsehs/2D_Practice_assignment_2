public class Task_10 {
    public static void main(String[] args) {
        int[][] m = {{0, 2, 3}, {4, 0, 6}, {0, 8, 0}};

        int zeros = 0;
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                if (m[i][j] == 0) {
                    zeros++;
                }
            }
        }
        System.out.println("Zeros: " + zeros);
    }
}