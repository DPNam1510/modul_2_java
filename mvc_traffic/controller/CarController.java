package mvc_traffic.controller;

import mvc_traffic.entity.Car;
import mvc_traffic.service.CarService;
import mvc_traffic.service.ICarService;
import mvc_traffic.view.CarView;

import java.util.List;
import java.util.Scanner;

public class CarController {
    public static void displayMenu() {
        ICarService carService = new CarService();
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        while (flag) {
            System.out.println("------------Car Manager----------");
            System.out.println("Function: " +
                    "\n 1. List Car:" +
                    "\n 2. Add Car:" +
                    "\n 3. Find Car:" +
                    "\n 4. Update Car:" +
                    "\n 5. Delete car:" +
                    "\n 6. Return main menu:"
            );
            System.out.println("Chose function!");
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("List Car:");
                    List<Car> carList = carService.findAll();
                    CarView.displayCar(carList);
                    break;
                case 2:
                    System.out.println("Add Car:");
                    Car carAdd = CarView.inputDataToAddNew();
                    boolean isAddSuccess = carService.add(carAdd);
                    if (isAddSuccess) {
                        System.out.println("Car added successfully!");
                    } else {
                        System.out.println("Car already exists!");
                    }
                    break;
                case 3:
                    System.out.println("Find Car:");
                    System.out.println("Enter the control plate to search:");
                    int controlPlate = Integer.parseInt(sc.nextLine());
                    Car carFind = carService.findById(controlPlate);
                    if (carFind != null) {
                        System.out.println("Car found successfully!" + carFind);
                    } else {
                        System.out.println("Car not found!" + controlPlate);
                    }
                    break;
                case 4:
                    System.out.println("Update Car:");
                    System.out.println("Enter the control plate to update:");
                    int  controlPlate2 = Integer.parseInt(sc.nextLine());
                    Car  carUpdate = carService.findById(controlPlate2);
                    if(carUpdate != null) {
                        System.out.println(CarView.inputDataToUpdate());
                        System.out.println("Update successfully!");
                    }else{
                        System.out.println("Update unsuccessfully!");
                    }
                    break;
                    case 5:
                        System.out.println("Delete Car:");
                        System.out.println("Enter the control plate to delete:");
                        int controlPlate3 = Integer.parseInt(sc.nextLine());
                        boolean carDeleteSuccess = carService.delete(controlPlate3);
                        if (carDeleteSuccess) {
                            System.out.println("Car deleted successfully!");
                        }else{
                            System.out.println("Car delete unsuccessfully!");
                        }
                        break;

            }
        }
    }
}
