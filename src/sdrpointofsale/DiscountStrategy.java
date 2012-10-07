package sdrpointofsale;

/**
 *
 * @author sroethle
 */
public interface DiscountStrategy {
    
    public abstract double getDiscountAmt(double price,int amount);
    
}
