package sdrpointofsale;

/**
 *
 * @author sroethle
 */
public interface DiscountStrategy {
    
    /**
     *
     * @param price
     * @param amount
     * @return
     */
    public abstract double getDiscountAmt(double price,int amount);
    
}
