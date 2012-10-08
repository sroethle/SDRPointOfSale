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

    
    public Product(String productID, String description, double price, 
            DiscountStrategy discountStrategy){
        this.productID = productID;
        this.description = description;
        this.discountStrategy = discountStrategy;
        this.price = price;
    }

    /**
     *
     * @return
     */
    public final String getProductID() {
        return productID;
    }

    /**
     *
     * @param productID
     */
    public final void setProductID(String productID) {
        this.productID = productID;
    }

    /**
     *
     * @return
     */
    public final double getPrice() {
        return price;
    }

    /**
     *
     * @param price
     */
    public final void setPrice(double price) {
        this.price = price;
    }
    
    /**
     *
     * @param quantity
     * @return
     */
    public final double getDiscountAmt(int quantity){
        return discountStrategy.getDiscountAmt(price, quantity);
    }

    /**
     *
     * @return
     */
    public final String getDescription() {
        return description;
    }

    /**
     *
     * @param description
     */
    public final void setDescription(String description) {
        this.description = description;
    }
    
}
