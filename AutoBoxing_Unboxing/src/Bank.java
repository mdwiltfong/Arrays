/*
Goal: Write a class called Bank.
- Must have two fields; name of type String, Branch of type ArrayList that holds branches.
- A constructor that takes in a String (name of the bank). It will initalise name and instantiate branches.
- Five methods:
    1. addBranch(), with one parameter of type String. Returns boolean. Returns true if the branch was added successfully.
    2. addCustomer(), with three parameters of type String(name of the branch), String (name of customer), double (initial transaction).
    Returns a boolean. Returns true if the customer was added successfully or false otherwise.
    3. addCustomerTransaction() with three parameters of type String(name of the branch), String (name of the customer), double (transaction), and returns a boolean.
    Returns true if the customers transaction was added successfully or false otherwise.
    4. findBranch(), has one parameter of type String (name of the branch) and returns a Branch. Return the Branch if it exists or null otherwise.
    5. listCustomers(), with two parameters of type String (name of the Branch), boolean( print transaction) and then returns a boolean.
    Returns true fi the branch exists and false otherwise.
 */

import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Branch> branches;
    public Bank(String name){
        this.name=name;
        this.branches=new ArrayList<Branch>();
    }

    public boolean addBranch(String name){
        return this.branches.add(new Branch(name));
    }
    public boolean addCustomer(String branchName,String customerName,double initTransaction){

    }
}
