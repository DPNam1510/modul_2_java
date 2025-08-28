package ss2Loop;

import java.util.Scanner;

public class SNT20 {
    public static boolean isPrime(int N) {
        if (N < 2) {
            return false;
        } else {
            for (int i = 2; i < N; i++) {
                if (N % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Volume index:");
        int number = scanner.nextInt();
        int count = 0;
        int N = 2;
        while (count < number) {
            if (isPrime(N)) {
                System.out.println(N);
                count++;
            }
            N++;
        }
    }
}
