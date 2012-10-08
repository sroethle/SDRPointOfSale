package sdrpointofsale;

/**
 *
 * @author Scott Roethle
 */
public class CashRegister {
    
    private Customer customer;
    private Receipt receipt;
    
        Product[] products = {
        new Product("A101", "Baseball Hat", 19.95, new FallDiscount),
        new Product("B205", "Men's Dress Shirt", 35.50, new XmasDiscount()),
        new Product("C222", "Women's Socks", 9.50, new NoDiscount())
    };
    
// When adding an item to a sale you need to look up the item in the database
	// Here we use the prodId to find product in the above array
    public void addItemToSale(String prodId, int qty) {
        Product product = null;
        for(Product p : products) {
            if(prodId.equals(p.getProdId())) {
                product = p;
                break;
            }
        }
        
		// if found, add the lineItem to the receipt
        if(product != null) {
            receipt.addLineItem(product, qty);
        }
        
    }


    
}
