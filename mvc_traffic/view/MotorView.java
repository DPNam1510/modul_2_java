package mvc_traffic.view;

import mvc_traffic.entity.Motor;

import java.util.List;
import java.util.Scanner;

public class MotorView {
    private static final Scanner sc = new Scanner(System.in);

    public static void displayMotor(List<Motor> motorList) {
        for (Motor motor : motorList) {
            if (motor != null) {
                System.out.println(motor);
            } else {
                break;
            }
        }
    }

    public static Motor inputDataToAddNew() {
        System.out.println("Control Plate: ");
        int controlPlate = Integer.parseInt(sc.nextLine());
        System.out.println("Name: ");
        String name = sc.nextLine();
        System.out.println("Date: ");
        int date = Integer.parseInt(sc.nextLine());
        System.out.println("People: ");
        String people = sc.nextLine();
        System.out.println("Power: ");
        int power = Integer.parseInt(sc.nextLine());
        return new Motor(controlPlate, name, date, people, power);
    }

    public static Motor inputDataToUpdate() {
        System.out.println("Control Plate:");
        int controlPlate = Integer.parseInt(sc.nextLine());
        System.out.println("New Name:");
        String newName = sc.nextLine();
        System.out.println("New Date:");
        int newDate = Integer.parseInt(sc.nextLine());
        System.out.println("New People:");
        String newPeople = sc.nextLine();
        System.out.println("New Power:");
        int newPower = Integer.parseInt(sc.nextLine());
        return new Motor(controlPlate, newName, newDate, newPeople, newPower);
    }
}
