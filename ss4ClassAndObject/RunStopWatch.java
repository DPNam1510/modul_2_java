package ss4ClassAndObject;

import java.util.Random;

public class RunStopWatch {
    public static void main(String[] args) {
        int n = 100000;
        int[] arr = new int[n];
        Random rand = new Random();

        for (int i = 0; i < n; i++) {
            arr[i] = rand.nextInt(1000000); // giá trị từ 0 đến 999,999
        }

        StopWatch stopwatch = new StopWatch();

        stopwatch.start();

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }

        stopwatch.stop();

        System.out.println("Thời gian chạy selection sort: "
                + stopwatch.getElapsedTime() + " ms");
    }
}
