package sdrpointofsale;

/**
 *
 * @author sroethle
 */
public class LineItem {
    
    private Product product;
    private int quantity;
    
    public LineItem(int productID, int quantity, DiscountStrategy discountStrategy){
        product = new Product(productID, discountStrategy, quantity);
        this.quantity = quantity;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }   
}
