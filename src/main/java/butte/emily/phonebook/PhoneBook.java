package butte.emily.phonebook;

import java.util.HashMap;

public class PhoneBook {

    private String name;
    private String phoneNumber;
    private String newEntry;
    private String removedEntry;
    private String list;

    public HashMap<String, String> listing = new HashMap<String, String>();

    public PhoneBook(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String lookUp(String name) {
        System.out.println(listing.get(name));
    }

    public void addEntry(String name, String phoneNumber) {
         newEntry = listing.put(name, phoneNumber);
    }

    public void removeEntry() {
        removedEntry = listing.remove(name);
    }

    public String listEntries() {
        list = listing.keySet();

    }
}
