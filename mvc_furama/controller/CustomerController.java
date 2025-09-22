package mvc_furama.controller;

import mvc_furama.view.CustomerView;
import mvc_furama.service.CustomerService;
import mvc_furama.service.ICustomerService;
import mvc_furama.model.Customer;

import java.util.Scanner;
import java.util.List;

public class CustomerController {
    public static void displayCustomer() {
        ICustomerService customerService = new CustomerService();
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        while (flag) {
            System.out.println("------Customer List------");
            System.out.println("Function:" +
                    "\n 1. Display list Customer:" +
                    "\n 2. Add new Customer:" +
                    "\n 3. Edit Customer:" +
                    "\n 4. Return main menu:");
            System.out.println("Choose an option:");
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("List Customer: ");
                    List<Customer> customerList = customerService.findAll();
                    CustomerView.displayCustomers(customerList);
                    break;
                case 2:
                    System.out.println("Add new Customer: ");
                    Customer customerAdd = CustomerView.inputDataToAddNew();
                    boolean isAddSuccess = customerService.add(customerAdd);
                    if (isAddSuccess) {
                        System.out.println("Customer added successfully!");
                    } else {
                        System.out.println("Customer add failed!");
                    }
                    break;
                case 3:
                    System.out.println("Edit Customer: ");
                    Customer customerUpdate = CustomerView.inputDataToUpdate();
                    boolean isUpdateSuccess = customerService.update(customerUpdate);
                    if (isUpdateSuccess) {
                        System.out.println("Customer updated successfully!");
                    } else {
                        System.out.println("Customer updated failed!");
                    }
                    break;
                case 4:
                    System.out.println("Return main menu:");
                    return;
                default:
                    System.out.println("Invalid choice!");
                    break;
            }
        }
    }
}
