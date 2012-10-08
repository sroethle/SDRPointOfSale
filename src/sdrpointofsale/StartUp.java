/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sdrpointofsale;

/**
 *
 * @author Scotty
 */
public class StartUp {
    public static void main(String[] args) {
       CashRegister cashRegister = new CashRegister();
       
       cashRegister.checkOutnewCustomer("Scott Roethle");
       cashRegister.addItemToSale("A101", 2);
       cashRegister.addItemToSale("B205", 1);
       cashRegister.addItemToSale("C222", 3);
       cashRegister.printReceipt();
       
               
    }
    
}
