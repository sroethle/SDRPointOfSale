package sdrpointofsale;

/**
 *
 * @author sroethle
 */
public class Product {
    private int productID;
    private double price;
    private String description;
    private DiscountStrategy discountStrategy;

    
    public Product(int productID, String description, DiscountStrategy discountStrategy){
        this.productID = productID;
        this.description = description;
        this.discountStrategy = discountStrategy;
    }

    public int getProductID() {
        return productID;
    }

    public void setProductID(int productID) {
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
