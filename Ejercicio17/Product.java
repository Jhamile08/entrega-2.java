package Ejercicio17;

public class Product {

    private String name;
    private String category;
    private Double price;
    private int stock;

    public Product(String name, String category, Double price, int stock) {
        this.name = name;
        this.category = category;
        this.price = price;
        this.stock = stock;
    }

    public Product() {
    }

    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }

    public String getCategory() {
        return category;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return "Product [name=" + name + ", category=" + category + ", price=" + price + ", stock=" + stock + "]";
    }

}
