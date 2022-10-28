public class Main {
    public static void main(String[] args) {
        MobilePhone mp = new MobilePhone("123456789");
        Contact newContact = new Contact("Jane","123456789");
        mp.addNewContact(newContact);
        Contact jane=mp.queryContact("Jane");
        Contact updatedContact= Contact.createContact(newContact.getName(), "56789");
        boolean updated = mp.updateContact(newContact,updatedContact);


    }
}
