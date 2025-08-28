package ss2Loop;

public class DisplayPicture {
    public static void main(String[] args) {
        for (int row = 1; row <= 3; row++) {
            for (int col = 1; col <= 7; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        for (int row = 1; row <= 5; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        for (int row = 1; row <= 5; row++) {
            for (int col = 1; col <= 6 - row; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
