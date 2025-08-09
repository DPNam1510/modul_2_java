package ss3Array;

public class MaxArray {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int maxArr = arr[0][0];
        int maxCol = 0, maxRow = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > maxArr) {
                    maxArr = arr[i][j];
                    maxRow = i;
                    maxCol = j;
                }
            }
        }
        System.out.println("Max Index: " + maxArr);
        System.out.println("Local: Row " + maxRow + ", Col " + maxCol);
    }
}
