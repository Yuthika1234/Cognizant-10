import java.util.HashMap;
import java.util.Map;

public class InventoryManagementSystem {
    private Map<String, Product> inventory;

    public InventoryManagementSystem() {
        this.inventory = new HashMap<>();
    }

    public void addProduct(Product product) {
        if (inventory.containsKey(product.getProductId())) {
            System.out.println("Product with this ID already exists.");
        } else {
            inventory.put(product.getProductId(), product);
            System.out.println("Product added: " + product);
        }
    }

    public void updateProduct(String productId, Product updatedProduct) {
        if (inventory.containsKey(productId)) {
            inventory.put(productId, updatedProduct);
            System.out.println("Product updated: " + updatedProduct);
        } else {
            System.out.println("Product not found.");
        
        }
    }

    public void deleteProduct(String productId) {
        if (inventory.containsKey(productId)) {
            Product removedProduct = inventory.remove(productId);
            System.out.println("Product deleted: " + removedProduct);
        } else {
            System.out.println("Product not found.");
           
        }
    }

    public void displayAllProducts() {
        if (inventory.isEmpty()) {
            System.out.println("No products in inventory.");
        } else {
            for (Product product : inventory.values()) {
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        InventoryManagementSystem ims = new InventoryManagementSystem();

        Product p1 = new Product("101", "Product1", 50, 10.5);
        Product p2 = new Product("102", "Product2", 30, 15.0);
        ims.addProduct(p1);
        ims.addProduct(p2);

        ims.displayAllProducts();

        Product p1Updated = new Product("101", "Product1 Updated", 60, 11.0);
        ims.updateProduct("101", p1Updated);

        ims.deleteProduct("102");


        ims.displayAllProducts();
    }
}
