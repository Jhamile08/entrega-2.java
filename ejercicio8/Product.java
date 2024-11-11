package ejercicio8;

public class Product {

    private String name;
    private String category;
    private Double price;

    public Product(String name, String category, Double price) {
        this.name = name;
        this.category = category;
        this.price = price;
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

    @Override
    public String toString() {
        return "Product [name=" + name + ", category=" + category + ", price=" + price + "]";
    }

}
