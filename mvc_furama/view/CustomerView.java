package mvc_furama.view;
import mvc_furama.model.Customer;
import java.util.List;
import java.util.Scanner;
public class CustomerView {
    public static Scanner sc = new Scanner(System.in);
    public static void displayCustomers(List<Customer> customerList) {
        for (Customer customer : customerList) {
            if (customer!=null) {
               System.out.println(customer);
            }else {
                break;
            }
        }
    }
    public static Customer inputDataToAddNew() {
        System.out.println("Enter Id: ");
        String id = sc.nextLine();
        System.out.println("Enter Name: ");
        String name = sc.nextLine();
        System.out.println("Enter Date: ");
        String date = sc.nextLine();
        System.out.println("Enter Gender: ");
        String gender = sc.nextLine();
        System.out.println("Enter idCard:");
        String idCard = sc.nextLine();
        System.out.println("Enter Phone Number: ");
        String phone = sc.nextLine();
        System.out.println("Enter Email: ");
        String email = sc.nextLine();
        System.out.println("Enter Type: ");
        String type = sc.nextLine();
        System.out.println("Enter Address: ");
        String address = sc.nextLine();
        return new Customer(id,name,date,gender,idCard,phone,email,type,address);
    }
    public static Customer inputDataToUpdate() {
        System.out.println("Enter Id: ");
        String id = sc.nextLine();
        System.out.println("Enter Name: ");
        String name = sc.nextLine();
        System.out.println("Enter Date: ");
        String date = sc.nextLine();
        System.out.println("Enter Gender: ");
        String gender = sc.nextLine();
        System.out.println("Enter idCard: ");
        String idCard = sc.nextLine();
        System.out.println("Enter Phone Number: ");
        String phone = sc.nextLine();
        System.out.println("Enter Email: ");
        String email = sc.nextLine();
        System.out.println("Enter Type: ");
        String type = sc.nextLine();
        System.out.println("Enter Address: ");
        String address = sc.nextLine();
        return new Customer(id,name,date,gender,idCard,phone,email,type,address);
    }
}
