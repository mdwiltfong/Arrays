/*
Goal: Write a contact class with the following specs
- Two fields of type String. One will be name while the other is phoneNumber.
- A constructor that takes two Strings, and initalizes name and phoneNumber.
- Three methods:
    1. getName()
    2. getPhoneNumber()
    3. createContact() with two parameters of type String(persons name and phonenumber) and returns an instance of Contact. This method will be static.
 */
public class Contact {
    private String name;
    private String phoneNumber;
    public Contact(String name,String phoneNumber){
        this.name= name;
        this.phoneNumber=phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
    public static Contact createContact(String name,String phoneNumber){
        return new Contact(name,phoneNumber);
    }
}
