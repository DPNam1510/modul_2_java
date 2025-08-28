package ss9_mvc_arrayList.controller;

import ss9_mvc_arrayList.entity.Customer;
import ss9_mvc_arrayList.service.CustomerService;
import ss9_mvc_arrayList.service.ICustomerService;
import ss9_mvc_arrayList.view.CustomerView;

import java.util.List;
import java.util.Scanner;

public class CustomerController {
    public static void displayMenu() {
        ICustomerService customerService = new CustomerService();
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        while (flag) {
            System.out.println("------------Customer management----------");
            System.out.println("Function: " +
                    "\n 1. List:" +
                    "\n 2. Add:" +
                    "\n 3. Delete:" +
                    "\n 4. Find:" +
                    "\n 5. Return to main menu:"
            );
            System.out.println("Select function:");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("List:");
                    List<Customer> customerList = customerService.findAll();
                    CustomerView.displayCustomer(customerList);
                    break;
                case 2:
                    System.out.println("Add:");
                    Customer addCustomer = CustomerView.inputDataForNewCustomer();
                    boolean isAddSuccess = customerService.add(addCustomer);
                    if (isAddSuccess) {
                        System.out.println("added successfully!");
                    } else {
                        System.out.println("Added unsuccessfully!");
                    }
                    break;
                case 3:
                    System.out.println("Delete:");
                    Customer deleteCustomer = CustomerView.DeleteCustomer();
                    boolean isDeleteSuccess = customerService.delete(deleteCustomer);
                    if (isDeleteSuccess) {
                        System.out.println("Delete successfully!");
                    } else {
                        System.out.println("Delete unsuccessfully!");
                    }
                    break;
                case 4:
                    System.out.println("Find:");
                    System.out.print("Enter the customer id to search:");
                    int searchId = scanner.nextInt();
                    Customer customer = customerService.findById(searchId);
                    if (customer != null) {
                        System.out.println("Found!" + customer);
                    } else {
                        System.out.println("Not found!" + searchId);
                    }
                    break;
                default:
                    System.out.println("Program has ended!");
                    flag = false;
                    break;
            }
        }
    }
}
