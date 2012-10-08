package sdrpointofsale;

/**
 *
 * @author sroethle
 */
public class LineItem {
    
    private Product product;
    private int quantity;
    
    public LineItem(Product product, int quantity){
        this.product = product;
        this.quantity = quantity;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }   
    
    public double getOrigPriceSubtotal(){
        return product.getPrice() +  product.getDiscountAmt(quantity);
    }
    
    public String getLineItem(){
        double subtotal;
        subtotal = product.getPrice() * quantity;
        return product.getProductID() + "    " + product.getDescription() 
                + "    " + quantity + "    " + product.getPrice() + "    " 
                + subtotal + "    " + product.getDiscountAmt(quantity);
    }
}
