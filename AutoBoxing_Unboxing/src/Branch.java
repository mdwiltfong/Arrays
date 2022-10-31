/*
Goal: Write a class called Branch with the following specs.
- Two fields, name of type String, an ArrayList that holds objects of type Customer called customers.
- A constructor that takes a string (name o the Branch). It will initalize name and instantiate customers;
- Five methods:
    -  getName(), getter for name.

    -  getCustomers(), getter for customers.

    -  newCustomer(), has two parameters of type String (name of customer), double (initial transaction) and returns a boolean. Returns true if the customer was added successfully or false otherwise.

    -  addCustomerTransaction(), has two parameters of type String (name of customer), double (transaction) and returns a boolean. Returns true if the customers transaction was added successfully or false otherwise.

    -  findCustomer(), has one parameter of type String (name of customer) and returns a Customer. Return the Customer if they exist, null otherwise.


 */

import java.util.ArrayList;

public class Branch {
    private String name;
    private ArrayList<Customer> customers;
    public Branch(String name){
        this.name=name;
        this.customers = new ArrayList<Customer>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }
    public boolean addCustomer(String name,double initTransaction){
        return this.customers.add(new Customer(name,initTransaction));
    }
}