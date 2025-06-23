// Exercise 1: Inventory Management System
class Product {
    int productId;
    String productName;
    int quantity;
    double price;

    Product(int id, String name, int qty, double price) {
        this.productId = id;
        this.productName = name;
        this.quantity = qty;
        this.price = price;
    }
}

import java.util.*;

class Inventory {
    private Map<Integer, Product> inventory = new HashMap<>();

    void addProduct(Product p) {
        inventory.put(p.productId, p);
    }

    void updateProduct(Product p) {
        inventory.put(p.productId, p);
    }

    void deleteProduct(int productId) {
        inventory.remove(productId);
    }

    void displayProducts() {
        for (Product p : inventory.values()) {
            System.out.println(p.productId + ": " + p.productName + " (" + p.quantity + ") - Rs." + p.price);
        }
    }
}
