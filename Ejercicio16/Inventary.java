import java.util.ArrayList;
import java.util.List;

public class Inventary {
    List<Product> products = new ArrayList<>();

    public Inventary() {
    }

    public Inventary(List<Product> products) {
        this.products = products;
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void deleteProduct(String name) {
        for (Product product : products) {
            if (product.getName().equalsIgnoreCase(name)) {
                products.remove(product);
            } else {
                System.out.println("Product not found");
            }
        }
    }

    public void searchByNameOrCategory(String search) {
        for (Product product : products) {
            if (product.getName().equalsIgnoreCase(search) || product.getCategory().equalsIgnoreCase(search)) {
                System.out.println(product.toString());
            } else {
                System.out.println("Product not found");
            }
        }
    }

    public void sellProduct(String name, Double stock) {
        for (Product product : products) {
            if (product.getName().equalsIgnoreCase(name)) {
                if (product.getStock() > stock) {
                    product.setStock(product.getStock() - stock);
                    System.out.println("Product sell successfully");
                } else
                    System.out.println("There aren't enough stock only are " + product.getStock());
            } else {
                System.out.println("Product not found");
            }
        }
    }

    @Override
    public String toString() {
        return "Inventary [products=" + products + "]";
    }

}
