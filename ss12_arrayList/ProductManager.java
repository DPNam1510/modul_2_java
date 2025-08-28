package ss12_arrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.Comparator;

public class ProductManager {
    private ArrayList<Product> products = new ArrayList<>();
    private Scanner sc = new Scanner(System.in);

    public void addProduct() {
        System.out.println("Enter product id:");
        int id = Integer.parseInt(sc.nextLine());
        System.out.println("Enter product name:");
        String name = sc.nextLine();
        System.out.println("Enter product price:");
        double price = Double.parseDouble(sc.nextLine());
        products.add(new Product(id, name, price));
        System.out.println("Added successful!");
    }

    public void findAll() {
        if (products.isEmpty()) {
            System.out.println("There is no products in the system!");
        } else {
            for (Product product : products) {
                System.out.println(product);
            }
        }
    }

    public boolean editProduct() {
        System.out.println("Enter product ID:");
        int id = Integer.parseInt(sc.nextLine());
        for (Product product : products) {
            if (product.getId() == id) {
                System.out.println("Enter new name:");
                String name = sc.nextLine();
                System.out.println("Enter new price:");
                double price = Double.parseDouble(sc.nextLine());
                System.out.println("Edit successful!");
                products.add(new Product(id, name, price));
                return true;
            } else {
                System.out.println("Invalid product ID!");
            }
        }
        return false;
    }

    public void deleteProduct() {
        System.out.println("Enter product ID:");
        int id = Integer.parseInt(sc.nextLine());
        for (Product product : products) {
            if (product.getId() == id) {
                products.remove(product);
                System.out.println("Deleted successful!");
            } else {
                System.out.println("Invalid product ID!");
            }
            break;
        }
    }

    public void findByName() {
        System.out.println("Enter product name:");
        String name = sc.nextLine();
        for (Product product : products) {
            if (product.getName().equals(name)) {
                System.out.println(product);
                System.out.println("Product found successful!");
            } else {
                System.out.println("Invalid product name!");
            }
            break;
        }
    }

    public void increaseByPrice() {
        Collections.sort(products, Comparator.comparingDouble(Product::getPrice));
        System.out.println("Arrange successful!");
    }

    public void decreaseByPrice() {
        Collections.sort(products, Comparator.comparingDouble(Product::getPrice).reversed());
        System.out.println("Arrange successful!");
    }
}
