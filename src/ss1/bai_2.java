import java.util.Scanner;

public class bai_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double vnd = 25000;
        System.out.println("Enter USD:");
        double usd = Double.parseDouble(scanner.nextLine());
        double change = vnd * usd;
        System.out.println("Changed =" + change);
    }
}
