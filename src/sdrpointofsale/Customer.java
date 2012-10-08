package sdrpointofsale;

/**
 *
 * @author Scott Roethle
 */
public class Customer {
    
    private String customerName;
    private int customerID;
    
    /**
     * Custom constructor that creates a new customer
     * @param customerName String value that represents the customer name
     * @param customerID Integer value that represents the customer ID
     */
    public Customer(String customerName, int customerID){
        this.customerName = customerName;
        this.customerID = customerID;
    }

    /**
     * Gets the customer name.
     * @return String Value for customer name.
     */
    public final String getCustomerName() {
        return customerName;
    }

    /**
     *
     * @return Integer value that represents the Customer ID
     */
    public final int getCustomerID() {
        return customerID;
    }

    /**
     *
     * @param customerID
     */
    public final void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    /**
     *
     * @param customerName
     */
    public final void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
    
   
}
