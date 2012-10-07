package sdrpointofsale;

/**
 *
 * @author Scott Roethle
 */
public class Receipt {

    private DiscountStrategy discount;
    LineItem[] lineItems = new LineItem[0];

    public Receipt(DiscountStrategy discountStrategy) {
        this.discount = discountStrategy;
    }

    // Here's how to add a purchased product as a LineItem
    public void addLineItem(int productID, int qty) {
        LineItem item = new LineItem(productID, qty, discount);
        addToArray(item);
    }

    private void addToArray(LineItem item) {
        LineItem[] tempItems = new LineItem[lineItems.length + 1];
        System.arraycopy(lineItems, 0, tempItems, 0, lineItems.length);
        tempItems[lineItems.length] = item;
        lineItems = tempItems;
    }
}
