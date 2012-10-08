package sdrpointofsale;

import java.text.DecimalFormat;

/**
 *
 * @author sroethle
 */
public class LineItem {
    
    private Product product;
    private int quantity;
    
    /**
     *
     * @param product
     * @param quantity
     */
    public LineItem(Product product, int quantity){
        this.product = product;
        this.quantity = quantity;
    }

    /**
     *
     * @return
     */
    public final Product getProduct() {
        return product;
    }

    /**
     *
     * @param product
     */
    public final void setProduct(Product product) {
        this.product = product;
    }   
    
    /**
     *
     * @return
     */
    public final double getOrigPriceSubtotal(){
        return product.getPrice() +  product.getDiscountAmt(quantity);
    }
    
    /**
     *
     * @return
     */
    public final String getLineItem(){
         
        DecimalFormat formatter = new DecimalFormat("#0.00");
        
        double subtotal;
        subtotal = product.getPrice() * quantity;

        return "\"" + product.getProductID() + "\",\"" 
                + product.getDescription() 
                + "\",\"" + quantity + "\",\"" 
                + formatter.format(product.getPrice()) + "\",\"" 
                + formatter.format(subtotal) + "\",\"" 
                + formatter.format(product.getDiscountAmt(quantity)) + "\"";
    }
    
    /**
     *
     * @return
     */
    public double getExtendedPrice(){
        return product.getPrice()*quantity;
    }
}
