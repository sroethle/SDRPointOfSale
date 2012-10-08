package sdrpointofsale;

/**
 *
 * @author sroethle
 */
public class QuantityDiscount implements DiscountStrategy {

    @Override
    public double getDiscountAmt(double price, int amount) {
        double discount;
        if (amount > 5) {
            discount = .15;
        } else {
            discount = .10;
        }
        return discount * price * amount;

    }
}
