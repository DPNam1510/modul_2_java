package mvc_traffic.controller;

import mvc_traffic.service.MotorService;
import mvc_traffic.service.IMotorService;
import mvc_traffic.entity.Motor;
import mvc_traffic.view.MotorView;


import java.util.List;
import java.util.Scanner;

public class MotorController {
    public static void displayMenu() {
        IMotorService motorService = new MotorService();
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        while (flag) {
            System.out.println("------------Motor Manager----------");
            System.out.println("Function: " +
                    "\n 1. List Motor:" +
                    "\n 2. Add Motor:" +
                    "\n 3. Delete Motor:" +
                    "\n 4. Find Motor:" +
                    "\n 5. Update Motor:" +
                    "\n 5. Return main menu:"
            );
            System.out.println("Chose function!");
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("List motor:");
                    List<Motor> motorList = motorService.findAll();
                    MotorView.displayMotor(motorList);
                    break;
                case 2:
                    System.out.println("Add motor:");
                    Motor motorAdd = MotorView.inputDataToAddNew();
                    boolean isAddSuccess = motorService.add(motorAdd);
                    if (isAddSuccess) {
                        System.out.println("Added successfully!");
                    } else {
                        System.out.println("Added unsuccessfully!");
                    }
                    break;
                case 3:
                    System.out.println("Find motor:");
                    System.out.println("Enter the control plate to search:");
                    int controlPlate = Integer.parseInt(sc.nextLine());
                    Motor motorFind = motorService.findById(controlPlate);
                    if(motorFind != null){
                        System.out.println("Found!" + motorFind);
                    }else{
                        System.out.println("Not found!" + controlPlate);
                    }
                    break;

                case 4:
                    System.out.println("Update motor:");
                    System.out.println("Enter the control plate to update:");
                    int controlPlate2 = Integer.parseInt(sc.nextLine());
                    Motor  motorUpdate = MotorView.inputDataToUpdate();
                    boolean isUpdateSuccess = motorService.update(controlPlate2, motorUpdate);
                    if (isUpdateSuccess) {
                        System.out.println("Updated successfully!");
                    }else{
                        System.out.println("Update unsuccessfully!");
                    }
                    break;

                    case 5:
                        System.out.println("Delete motor:");
                        System.out.println("Enter the control plate to delete:");
                        int controlPlate3 = Integer.parseInt(sc.nextLine());
                        Motor motorDeleteSuccess = motorService.delete(controlPlate3);
                        if(motorDeleteSuccess != null){
                            System.out.println("Deleted successfully!");
                        }else{
                            System.out.println("Deleted unsuccessfully!");
                        }
                        break;
            }
        }

    }
}
