package ejercicio8;

import java.util.ArrayList;
import java.util.List;

public class Stock {
    private List<Product> products;

    public Stock(List<Product> products) {
        this.products = new ArrayList<>();
    }

    public Stock() {
    }

    public void searchByCategory(String category) {
        List<Product> productsFound = new ArrayList<>();
        for (Product product : products) {
            if (product.getCategory().equals(category)) {
                productsFound.add(product);
            }
        }
        System.out.println(productsFound);
    }

    public void priceInventoryTotal() {
        Double priceTotal = 0.0;
        for (Product product : products) {
            priceTotal += product.getPrice();
        }
        System.out.println(priceTotal);
    }

    public void addProduct(Product productNew) {
        // Asegúrate de que la lista está inicializada
        if (this.products == null) {
            this.products = new ArrayList<>();
        }

        // Agregar el nuevo producto a la lista
        products.add(productNew);
        System.out.println("Product added: " + productNew);
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    @Override
    public String toString() {
        return "Stock [products=" + products + "]";
    }

}
