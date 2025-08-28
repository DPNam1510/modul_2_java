package ss5AccessModifier;

import java.util.List;
import java.util.ArrayList;

public class ProductManager {
    private static List<Product> productList = new ArrayList<>();

    //Thêm sản phẩm
    public void addProduct(Product product) {
        productList.add(product);
    }

    //    Hiển thị sản phẩm
    public void displayProduct() {
        if (productList.isEmpty()) {
            System.out.println("No products found");
            return;
        }
        for (Product product : productList) {
            System.out.println(product);
        }
    }

    //    Sửa sản phẩm
    public boolean editProduct(int id, String newName, double newPrice) {
        for (Product product : productList) {
            if (product.getId() == id) {
                product.setName(newName);
                product.setPrice(newPrice);
                return true;
            }
        }
        return false;
    }
    public boolean deleteProduct(int id){
        for (Product product : productList) {
            if (product.getId() == id) {
                productList.remove(product);
                return true;
            }
        }
        return false;
    }
}
