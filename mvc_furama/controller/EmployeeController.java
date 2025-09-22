package mvc_furama.controller;

import mvc_furama.model.Employee;
import mvc_furama.service.EmployeeService;
import mvc_furama.service.IEmployeeService;
import mvc_furama.view.EmployeeView;

import java.util.List;
import java.util.Scanner;

public class EmployeeController {
    public static void displayEmployee() {
        IEmployeeService employeeService = new EmployeeService();
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        while (flag) {
            System.out.println("------Employee List------");
            System.out.println("Function:" +
                    "\n 1. Display list employee:" +
                    "\n 2. Add new employee:" +
                    "\n 3. Edit employee:" +
                    "\n 4. Return main menu:");
            System.out.println("Enter choice:");
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("List employees:");
                    List<Employee> employeeList = employeeService.findAll();
                    EmployeeView.displayEmployees(employeeList);
                    break;
                case 2:
                    System.out.println("Add new employee:");
                    Employee employeeAdd = EmployeeView.inputDataToAddNew();
                    boolean isAddSuccess = employeeService.add(employeeAdd);
                    if (isAddSuccess) {
                        System.out.println("Add successfully!");
                    } else {
                        System.out.println("Add failed!: ");
                    }
                    break;
                case 3:
                    System.out.println("Edit employee:");
                    Employee employeeEdit = EmployeeView.inputDataToUpdate();
                    boolean isEditSuccess = employeeService.update(employeeEdit);
                    if(isEditSuccess){
                        System.out.println("Edit successfully!");
                    }else {
                        System.out.println("Edit failed!: ");
                    }
                    break;
                    case 4:
                        System.out.println("Return main menu:");
                        return;
                default:
                    System.out.println("Invalid input!");
                    break;


            }

        }
    }
}
