package mvc_traffic.controller;

import mvc_traffic.entity.Truck;
import mvc_traffic.service.TruckService;
import mvc_traffic.service.ITruckService;
import mvc_traffic.view.TruckView;

import java.util.List;
import java.util.Scanner;

public class TruckController {
    public static void displayMenu() {
        ITruckService truckService = new TruckService();
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        while (flag) {
            System.out.println("------------Truck Manager----------");
            System.out.println("Function: " +
                    "\n 1. List Truck:" +
                    "\n 2. Add Truck:" +
                    "\n 3. Find Truck:" +
                    "\n 4. Update Truck:" +
                    "\n 5. Delete Truck:" +
                    "\n 6. Return main menu:"
            );
            System.out.println("Choice function! ");
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("List Truck: ");
                    List<Truck> truckList = truckService.findAll();
                    TruckView.displayTruck(truckList);
                    break;
                case 2:
                    System.out.println("Add Truck: ");
                    Truck truckAdd = TruckView.inputDataToAddNew();
                    boolean isAddSuccess = truckService.add(truckAdd);
                    if (isAddSuccess) {
                        System.out.println("Truck added successfully!");
                    } else {
                        System.out.println("Truck add failed!");
                    }
                    break;
                case 3:
                    System.out.println("Find Truck: ");
                    System.out.println("Enter control plate Truck: ");
                    int controlPlate = Integer.parseInt(sc.nextLine());
                    Truck truckFind = truckService.findById(controlPlate);
                    if (truckFind != null) {
                        System.out.println("Truck found!");
                    }else  {
                        System.out.println("Truck not found!");
                    }
                    break;
                    case 4:
                        System.out.println("Update Truck: ");
                        System.out.println("Enter control plate Truck: ");
                        int controlPlate2 = Integer.parseInt(sc.nextLine());
                        Truck truckUpdate = truckService.findById(controlPlate2);
                        if (truckUpdate != null) {
                            System.out.println("Truck updated successfully!");
                        }else  {
                            System.out.println("Truck updated failed!");
                        }
                        break;
                        case 5:
                            System.out.println("Delete Truck: ");
                            System.out.println("Enter control plate Truck: ");
                            int controlPlate3 = Integer.parseInt(sc.nextLine());
                            boolean truckDelete = truckService.delete(controlPlate3);
                            if (truckDelete) {
                                System.out.println("Truck deleted successfully!");
                            }else   {
                                System.out.println("Truck delete failed!");
                            }
                            break;

            }
        }
    }
}
