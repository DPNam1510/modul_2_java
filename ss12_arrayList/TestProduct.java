package ss12_arrayList;

import java.util.Scanner;

public class TestProduct {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ProductManager manager = new ProductManager();
        while (true) {
            System.out.println("MENU PRODUCT");
            System.out.println("1. Add Product:");
            System.out.println("2. Display Product:");
            System.out.println("3. Find By Name:");
            System.out.println("4. Edit Product:");
            System.out.println("5. Delete Product:");
            System.out.println("6. Arranger Product Increase:");
            System.out.println("7. Arranger Product Decrease:");
            System.out.println("8. Out");
            System.out.print("Choice: ");
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    manager.addProduct();
                    break;
                case 2:
                    manager.findAll();
                    break;
                case 3:
                    manager.findByName();
                    break;
                case 4:
                    manager.editProduct();
                    break;
                case 5:
                    manager.deleteProduct();
                    break;
                case 6:
                    manager.increaseByPrice();
                    break;
                case 7:
                    manager.decreaseByPrice();
                case 8:
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Wrong choice");
            }
        }
    }
}
