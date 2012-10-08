package sdrpointofsale;

/**
 *
 * @author sroethle
 */
public class Product {
    private String productID;
    private double price;
    private String description;
    private DiscountStrategy discountStrategy;

    
    public Product(String productID, String description, double price, DiscountStrategy discountStrategy){
        this.productID = productID;
        this.description = description;
        this.discountStrategy = discountStrategy;
        this.price = price;
    }

    public String getProductID() {
        return productID;
    }

    public void setProductID(String productID) {
        this.productID = productID;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
    public double getDiscountAmt(int quantity){
        return discountStrategy.getDiscountAmt(price, quantity);
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
}
