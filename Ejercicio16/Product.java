
public class Product {

    private String name;
    private String category;
    private Double price;
    private Double stock;

    public Product(String name, String category, Double price, Double stock) {
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

    public Double getStock() {
        return stock;
    }

    public void setStock(Double stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return "Product [name=" + name + ", category=" + category + ", price=" + price + ", stock=" + stock + "]";
    }

}
