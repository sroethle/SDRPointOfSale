package sdrpointofsale;

/**
 *
 * @author sroethle
 */
public class FallDiscount implements DiscountStrategy {

    private final double DISCOUNT = .10;
    
    @Override
    public double getDiscountAmt(double price,int quantity) {
        return price*quantity*DISCOUNT;
    }
    
}
