package dictionary;

public class ContactDictionary {
    private ContactDictionary() {
        throw new IllegalStateException("Cannot create this class!");
    }

    public static final String welcomeMessage = "Welcome in Contacts application \n 1 - add new contact" +
            "\n 2 - show all contacts \n 3 - delete contact by id \n 4 - find contact by id \n 5 - import contacts";
}
