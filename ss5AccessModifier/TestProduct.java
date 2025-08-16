package ss5AccessModifier;

import java.util.Scanner;

public class TestProduct {
    public static void main(String[] args) {
        ProductManager manager = new ProductManager();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("MENU PRODUCT");
            System.out.println("1. Add product");
            System.out.println("2. Display product");
            System.out.println("3. Edit Product");
            System.out.println("4. Delete  Product");
            System.out.println("5. Out");
            System.out.print("Choice: ");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    System.out.print("Enter id:");
                    int id = Integer.parseInt(scanner.nextLine());
                    System.out.print("Enter name:");
                    String name = scanner.nextLine();
                    System.out.print("Enter price:");
                    double price = Double.parseDouble(scanner.nextLine());
                    manager.addProduct(new Product(id, name, price));
                    System.out.println("Product added successfully!");
                    break;
                case 2:
                    manager.displayProduct();
                    break;
                case 3:
                    System.out.print("Enter the product ID you want to edit:");
                    int editId = Integer.parseInt(scanner.nextLine());
                    System.out.print("Enter new name:");
                    String newName = scanner.nextLine();
                    System.out.print("Enter new price:");
                    double newPrice = Double.parseDouble(scanner.nextLine());
                    if (manager.editProduct(editId, newName, newPrice)) {
                        System.out.println("Product edited successfully!");
                    } else {
                        System.out.println("Product not found!");
                    }
                    break;
                case 4:
                    System.out.print("Enter the product ID you want to delete:");
                    int deleteId = Integer.parseInt(scanner.nextLine());
                    if (manager.deleteProduct(deleteId)) {
                        System.out.println("Product deleted successfully!");
                    } else {
                        System.out.println("Product not found!");
                    }
                    break;
                case 5:
                    System.out.println("Out program!");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}

