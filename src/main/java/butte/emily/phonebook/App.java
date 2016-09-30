package butte.emily.phonebook;

/**
 * Created by emilybutte on 9/28/16.
 */
public class App {
    public static void main(String[] args) {

        PhoneBook phoneBook = new PhoneBook();

        phoneBook.phonebook.put("Charlie Day", "(215) 286-7515");
        phoneBook.phonebook.put("Dennis Reynolds", "(215) 884-5555");
        phoneBook.phonebook.put("Dee Reynolds", "(215) 610-1111");
        phoneBook.phonebook.put("Ronald McDonald", "(215) 737-5555");
        phoneBook.phonebook.put("Frank Reynolds", "(215) 897-5555");
        phoneBook.phonebook.put("Waitress", "(215) 555-5555");

        phoneBook.listEntries();
        phoneBook.lookUp("Charlie Day");
        phoneBook.addEntry("Emily Butte", "(701) 371-7515");
        phoneBook.removeEntry("Dennis Reynolds");
        phoneBook.listEntries();
    }
}
