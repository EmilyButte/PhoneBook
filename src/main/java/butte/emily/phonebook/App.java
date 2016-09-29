package butte.emily.phonebook;

/**
 * Created by emilybutte on 9/28/16.
 */
public class App {
    public static void main(String[] args) {

        PhoneBook phoneBook = new PhoneBook();

        phoneBook.listing.put("Charlie Day", "(215) 286-7515");
        phoneBook.listing.put("Dennis Reynolds", "(215) 884-5555");
        phoneBook.listing.put("Dee Reynolds", "(215) 610-1111");
        phoneBook.listing.put("Ronald McDonald", "(215) 737-5555");
        phoneBook.listing.put("Frank Reynolds", "(215) 897-5555");
        phoneBook.listing.put("Waitress", "(215) 555-5555");

        phoneBook.listEntries();
        phoneBook.lookUp("Charlie Day");
        phoneBook.addEntry("Emily Butte", "(701) 371-7515");
        phoneBook.removeEntry("Dennis Reynolds");
        phoneBook.listEntries();
        //System.out.println(phoneBook.reverseLookUp("(215) 555-5555"));


    }
}
