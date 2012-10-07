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
    private int quantity;
    
    public Product(int productID, DiscountStrategy discountStrategy, int quantity ){
        this.productID = productID;
        this.discountStrategy = discountStrategy;
        this.quantity = quantity;
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
    
    public void getDiscountAmt(){
        discountStrategy.getDiscountAmt(price, quantity);
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
}
