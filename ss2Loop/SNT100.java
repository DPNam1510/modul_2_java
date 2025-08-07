package ss2Loop;

public class SNT100 {
    public static boolean isPrime(int n){
        if (n < 2) {
            return false;
        } else {
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }
    public static void main(String[] args) {
        for (int i = 3; i < 100; i++) {
            if (isPrime(i)){
                System.out.println(i);
            }
        }
    }
}
