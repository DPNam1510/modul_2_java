package ss8_mvc.view;

import ss8_mvc.entity.Customer;
import java.util.Scanner;

public class CustomerView {
    private static Scanner sc = new Scanner(System.in);

    public static void displayCustomer(Customer[] customerList) {
        for (Customer customer : customerList) {
            if (customer != null) {
                System.out.println(customer);
            } else {
                break;
            }
        }
    }
    public static Customer inputDataForNewCustomer(){
        System.out.println("Id:");
        int id = Integer.parseInt(sc.nextLine());
        System.out.println("Name:");
        String name = sc.nextLine();
        System.out.println("Email:");
        String email = sc.nextLine();
        System.out.println("Address:");
        String address = sc.nextLine();
        Customer customer = new Customer(id,name,email,address);
        return customer;
    }
    public  static Customer DeleteCustomer() {
        System.out.println("Input id delete:");
        int id = Integer.parseInt(sc.nextLine());
        Customer customer = new Customer(id, null, null,  null);
        return customer;
    }
}
