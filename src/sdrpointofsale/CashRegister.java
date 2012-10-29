package sdrpointofsale;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author Scott Roethle
 */
public class CashRegister {

    private Receipt receipt;
    private Customer customer;
    private Map <Integer, Customer> customerMap;
    
//    private Customer[] customers = {
//        new Customer("Scott Roethle",1001),
//        new Customer("Fake Person",1002),
//    };
//    
    CashRegister(){
        customerMap = new HashMap <Integer, Customer>();
        Customer customer1 = new Customer("Scott Roethle",1001);
        Customer customer2 = new Customer("Fake Person",1002);
        
        customerMap.put(1001, customer1);
        customerMap.put(1002, customer2);
    }
    
    private Product[] products = {
        new Product("A101", "Baseball Hat", 19.95, new FallDiscount()),
        new Product("B205", "Men's Dress Shirt", 35.50, new WinterDiscount()),
        new Product("C222", "Women's Socks", 9.50, new QuantityDiscount())
    };

    /**
     * Finds the customer from the array and creates a new Receipt object. 
     * @param customerID an integer value that represents the customer.
     * 
     */
    public final void checkOutnewCustomer(int customerID){
        setCustomer(customerID);
        this.receipt = new Receipt();
    }
    
    /**
     * When adding an item to a sale you need to look up the item in the 
     * database.  Here we use the prodId to find product in the above array
     * @param prodId a String value that represents the product ID
     * @param qty an Integer value that represents the number of products
     */
    public final void addItemToSale(String prodId, int qty) {
        Product product = null;
        for (Product p : products) {
            if (prodId.equals(p.getProductID())) {
                product = p;
                break;
            }
        }

        // if found, add the lineItem to the receipt
        if (product != null) {
            receipt.addLineItem(product, qty);
        }
    }

    /**
     * Looks up the customerID in the customers array and sets the customer
     * object equal to it's match.
     * @param customerID an Integer value that represents the Customer
     */
    public final void setCustomer(int customerID) {
        Set<Integer> keys = customerMap.keySet();

        Customer customer2 = null;
        for (Integer key : keys) {
            Customer cust = customerMap.get(key);

            if (customerID == cust.getCustomerID()) {
                customer2 = cust;
                break;
            }
        }

        // if found, add customer
        if (customer2 != null) {
            this.customer = customer2;
        }
    }

    /**
     * Prints the receipt to the console.  The output includes the Customer
     * Name, Customer Number, the line items of the sale, and finally the
     * total bill.
     */
    public final void outputReceipt() {
        String formatString = "%-15s %-20s %-15s %-15s %-15s %-15s";
        
        System.out.println("Customer Name: " + customer.getCustomerName());
        System.out.println("Customer Number:" + customer.getCustomerID());
        System.out.println("");
        System.out.printf(formatString,"ID","Description","QTY","UnitPrice",
                "Subtotal","Discount");
        System.out.println("");
        
        System.out.println("Total Bill Before Discount: " 
                + receipt.getTotalBeforeDiscount());
        System.out.println("Total Bill After Discount: " 
                + receipt.getTotalAfterDiscount());
    }
}
