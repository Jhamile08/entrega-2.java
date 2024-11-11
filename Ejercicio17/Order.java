package Ejercicio17;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Order {
    List<Product> products = new ArrayList<>();
    Map<Integer, List<Product>> orders = new HashMap<>();
    Map<Integer, Double> orderTotals = new HashMap<>();

    private int orderIdCounter = 1;

    public void showInvetory() {
        System.out.println("Inventory");
        for (Product product : products) {
            System.out.println(product);
        }
    }

    public void addProductToInventory(Product product) {
        products.add(product);
    }

    public void createOrder() {
        int orderId = orderIdCounter++;
        orders.put(orderId, new ArrayList<>());
        orderTotals.put(orderId, 0.0);
        System.out.println("new order with id " + orderId);
    }

    public void addProductToOrder(int orderId, String productName, int quantity) {
        if (!orders.containsKey(orderId)) {
            System.out.println("Order ID not found");
        }
        for (Product product : products) {
            if (product.getName().equalsIgnoreCase(productName)) {
                if (product.getStock() > quantity) {

                    product.setStock(product.getStock() - quantity);

                    Product orderedProduct = new Product(product.getName(), product.getCategory(), product.getPrice(),
                            quantity);
                    orders.get(orderId).add(orderedProduct);

                    Double newTotal = orderTotals.get(orderId) + orderedProduct.getPrice() * quantity;

                    System.out.println("Added " + quantity + " of " + productName + " to order ID: " + orderId);
                    return;
                } else
                    System.out.println("There aren't enough stock only are " + product.getStock());
                return;
            }
        }
        System.out.println("Product not found in inventory");
    }

    public void showOrder(int orderId) {
        if (!orders.containsKey(orderId)) {
            System.out.println("Order ID not found.");
            return;
        }

        System.out.println("Order ID: " + orderId);
        List<Product> orderProducts = orders.get(orderId);
        for (Product product : orderProducts) {
            System.out.println(product);
        }
        System.out.println("Order Total: " + orderTotals.get(orderId));
    }

    public void showAllOrders() {
        System.out.println("All Orders:");
        for (int orderId : orders.keySet()) {
            showOrder(orderId);
        }
    }
}
