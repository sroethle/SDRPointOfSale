/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sdrpointofsale;

/**
 *
 * @author sroethle
 */
public class WinterDiscount implements DiscountStrategy {
    
    private final double DISCOUNT = .10;

    @Override
    public double getDiscountAmt(double price, int amount) {
        return price*amount*DISCOUNT;
    }
    
}
