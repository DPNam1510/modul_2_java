package mvc_traffic.view;

import mvc_traffic.entity.Truck;

import java.util.Scanner;
import java.util.List;

public class TruckView {
    private static final Scanner sc = new Scanner(System.in);

    public static void displayTruck(List<Truck> truckList) {
        for (Truck truck : truckList) {
            if (truck != null) {
                System.out.println(truck);
            } else {
                break;
            }
        }
    }

    public static Truck inputDataToAddNew() {
        System.out.println("Control Plate:");
        int controlPlate = Integer.parseInt(sc.nextLine());
        System.out.println("Name: ");
        String name = sc.nextLine();
        System.out.println("Date: ");
        int date = Integer.parseInt(sc.nextLine());
        System.out.println("People: ");
        String people = sc.nextLine();
        System.out.println("Weight: ");
        int weight = Integer.parseInt(sc.nextLine());
        return new Truck(controlPlate, name, date, people, weight);
    }

    public static Truck inputDataToUpdate() {
        System.out.println("Control Plate:");
        int controlPlate = Integer.parseInt(sc.nextLine());
        System.out.println("Name: ");
        String name = sc.nextLine();
        System.out.println("Date: ");
        int date = Integer.parseInt(sc.nextLine());
        System.out.println("People: ");
        String people = sc.nextLine();
        System.out.println("Weight: ");
        int weight = Integer.parseInt(sc.nextLine());
        return new Truck(controlPlate, name, date, people, weight);
    }
}
