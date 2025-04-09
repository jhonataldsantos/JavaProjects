package JavaProjects.Cafeteria.src;

public class Item {
    private String productName;
    private double price;
    private int productId;

    public Item(String productName, double price, int productId) {
        this.productName = productName;
        this.price = price;
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public double getPrice() {
        return price;
    }

    public double getProductId() {
        return productId;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String toString(String productName, double price) {
        return "O nome do produto é " + productName + ", custando R$" + price;
    }
}
