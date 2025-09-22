package mvc_furama.controller;
import java.util.Scanner;
public class FuramaController {
    public static void displayMainMenu() {
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        while (flag) {
            System.out.println("Welcome to the Furama!");
            System.out.println("Function:"+
                    "\n 1.Employee Management"+
                    "\n 2.Customer Management"+
                    "\n 3.Facility Management"+
                    "\n 4.Booking Management"+
                    "\n 5.Promotion Management"+
                    "\n 6.Exit");
            System.out.print("Enter your choice: ");
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice) {

            }
        }
    }
}
