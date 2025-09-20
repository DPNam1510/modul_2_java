package mvc_traffic.view;

import mvc_traffic.entity.Car;

import java.util.List;
import java.util.Scanner;

public class CarView {
    private static final Scanner sc = new Scanner(System.in);

    public static void displayCar(List<Car> carList) {
        for (Car car : carList) {
            if (car != null) {
                System.out.println(car);
            } else {
                break;
            }
        }
    }

    public static Car inputDataToAddNew() {
        System.out.println("Control Plate:");
        int controlPlate = Integer.parseInt(sc.nextLine());
        System.out.println("Name: ");
        String name = sc.nextLine();
        System.out.println("Date: ");
        int date = Integer.parseInt(sc.nextLine());
        System.out.println("People: ");
        String people = sc.nextLine();
        System.out.println("Seats: ");
        int seat = Integer.parseInt(sc.nextLine());
        System.out.println("TypeCar: ");
        String typeCar = sc.nextLine();
        return new Car(controlPlate, name, date, people, seat, typeCar);
    }
    public  static Car inputDataToUpdate() {
        System.out.println("Control Plate:");
        int controlPlate = Integer.parseInt(sc.nextLine());
        System.out.println("Name: ");
        String name = sc.nextLine();
        System.out.println("Date: ");
        int date = Integer.parseInt(sc.nextLine());
        System.out.println("People: ");
        String people = sc.nextLine();
        System.out.println("Seats: ");
        int seat = Integer.parseInt(sc.nextLine());
        System.out.println("TypeCar: ");
        String typeCar = sc.nextLine();
        return new Car(controlPlate, name, date, people, seat, typeCar);
    }
}
