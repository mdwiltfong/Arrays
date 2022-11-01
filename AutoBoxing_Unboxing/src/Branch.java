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

class Branch {
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

    public boolean newCustomer(String customerName,double initialTransaction){
        Customer customer = findCustomer(customerName);
        if(customer != null){
            return this.customers.add(new Customer(customerName,initialTransaction));
        }else{
            return false;
        }
    }
    public boolean addCustomerTransaction(String customerName, double transaction){
        Customer customer = this.findCustomer(customerName);
        return customer.addTransaction(transaction);
    }
    public boolean addCustomer(String name,double initTransaction){
        Customer customer = findCustomer(name);
        if(customer != null){
            return this.customers.add(new Customer(name,initTransaction));
        }else{
            return false;
        }

    }
    public Customer findCustomer(String name){
        for (int i = 0; i < this.customers.size(); i++) {
            if(this.customers.get(i).getName().equals(name)){
                return this.customers.get(i);
            }
        }
        return null;
    }
}
