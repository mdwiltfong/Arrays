/*
Goal: Write a class called Customer.
- Two fields: name of type String, and an ArrayList that holds objects of type Double called Transactions.
- A constructor that takes a String (name of the customer) and a double (initial transaction). It initalises name and instantiates transactions.
- It will also have three methods:
     -  getName(), getter for name.

     -  getTransactions(), getter for transactions.

     -  addTransaction(), has one parameter of type double (transaction) and doesn't return anything.
 */

import java.util.ArrayList;

public class Customer {
    private String name;
    private ArrayList<Double> transactions;
    public Customer(String name, double initTransaction){
        this.name=name;
        this.transactions= new ArrayList<Double>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }

    public boolean addTransaction(double transaction) {
        return this.transactions.add(transaction);
    }
}
