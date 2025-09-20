package mvc_traffic.controller;

import java.util.Scanner;

public class MainController {
    public static void displayMenu() {
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        while (flag) {
            System.out.println("------Main Menu------");
            System.out.println("Function:" +
                    "\n 1. Motor controller:" +
                    "\n 2. Car controller:" +
                    "\n 3. Truck controller:" +
                    "\n 4. Exit!");
            System.out.println("Choose an option:");
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("Motor controller:");
                    MotorController.displayMenu();
                    break;
                case 2:
                    System.out.println("Car controller:");
                    CarController.displayMenu();
                    break;
                    case 3:
                        System.out.println("Truck controller:");
                        TruckController.displayMenu();
                        break;
                default:
                    System.out.println("Invalid input!");
                    flag = false;
                    break;
            }
        }
    }
}
