package sdrpointofsale;

/**
 *
 * @author Scott Roethle
 */
public class Receipt {

    LineItem[] lineItems = new LineItem[0];

    /**
     * Add a purchased product as a LineItem
     * @param product a Product object that is added to a LineItem
     * @param qty an Integer value that represents the number of Products
     */
    public void addLineItem(Product product, int qty) {
        LineItem item = new LineItem(product, qty);
        addToArray(item);
    }

    private void addToArray(LineItem item) {
        LineItem[] tempItems = new LineItem[lineItems.length + 1];
        System.arraycopy(lineItems, 0, tempItems, 0, lineItems.length);
        tempItems[lineItems.length] = item;
        lineItems = tempItems;
    }

    /**
     * Gets the grand total of the line items Before Discount by looping 
     * through all the line items.
     * @return Double value that represents the grand total before discount.
     */
    public double getTotalBeforeDiscount() {
        double grandTotal = 0.0;
        for (LineItem item : lineItems) {
            grandTotal += item.getOrigPriceSubtotal();
        }
        return grandTotal;
    }
    
    /**
     * Gets the grand total of the line items by looping 
     * @return Double value that represents the grand total after discount
     */
    public double getTotalAfterDiscount() {
        double grandTotal = 0.0;
        for (LineItem item : lineItems) {
            grandTotal += item.getExtendedPrice();
        }
        return grandTotal;
    }
}
