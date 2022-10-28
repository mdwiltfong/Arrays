import java.util.ArrayList;

/*
Goal: Write a master class called MobilePhone.
Specs:
    - Two fields:
        - a String called myNumber
        - an ArrayList of type Contact called myContacts
    - Seven methods:
        1. addNewContact() with one parameter type of Contact. Return boolean.
        2. updateContact() with two parameters of type Contact (one being the old Contacnt, while the other is the new contact).
            Returns true if the contact exists and was update, or false if the contact doesn't exist.
        3. removeContact() with one parameter of type Contact, Return boolean.
            Returns true if the contact exists and was removed. Otherwise false.
        4. findContact() with one parameter of Type Contact. Returns int, which will be
        the contacts position in the ArrayList. It will be -1 if the contact doesn't exist in the array.
        5. queryContact() has one parameter of type String, and returns a Contact. Return null otherwise.
        6. printContact() no parameters and returns nothing. But prints the ArrayList of contacts with a specific format

 */
public class MobilePhone {
    private String myNumber;
    private ArrayList<Contact> myContacts;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.myContacts=new ArrayList<>();
    }

    public boolean addNewContact(Contact contact){
        Contact contactExists= queryContact(contact.getName());
        if(contactExists == null){
            return this.myContacts.add(contact);
        }else{
            return false;
        }

    }
    public boolean updateContact(Contact oldContact,Contact newContact){
        int contactPosition = findContact(oldContact.getName());
        if(contactPosition >=0){
            Contact prevContact =this.myContacts.set(contactPosition,newContact);
            if(prevContact != null){
                return true;
            }else{
                return false;
            }

        }else{
            return false;
        }
    }
    public boolean removeContact(Contact targetContact){
        int contactIndex=findContact(targetContact.getName());
        if(contactIndex>=0){
            Contact contact= this.myContacts.remove(contactIndex);
            if(contact != null){
                return true;
            }else{
                return false;
            }
        }else{
            return false;
        }
    }
    private int findContact(Contact contact){
        return this.myContacts.indexOf(contact.getName());
    }
    private int findContact(String contactName){
        for (int i = 0; i < this.myContacts.size(); i++) {
            if(this.myContacts.get(i).getName() == contactName){
                return i;
            }
        }
        return -1;
    }
    public Contact queryContact(String contactName){
        int contactIndex = findContact(contactName);
        if(contactIndex>=0){
            return this.myContacts.get(contactIndex);
        }else{
            return null;
        }

    }
    public void printContacts(){
        System.out.println("Contact List:");
        int counter=1;
        for (Contact contact :
                this.myContacts) {
            System.out.println(counter+". "+contact.getName() + " -> "+ contact.getPhoneNumber());
            counter++;
        }
    }
}
