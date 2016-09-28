package butte.emily.phonebook;

import java.util.HashMap;
import java.util.Set;

public class PhoneBook {

    private String name;
    private String phoneNumber;
    private String newEntry;
    private String removedEntry;
    private Set<String> list;

    public HashMap<String, String> listing = new HashMap<String, String>();

    public void lookUp(String name) {
        System.out.println(listing.get(name));
    }

    public void addEntry(String name, String phoneNumber) {
         newEntry = listing.put(name, phoneNumber);
    }

    public String removeEntry(String name) {
        removedEntry = listing.remove(name);
        return removedEntry;
    }

    public Set listEntries() {
        list = listing.keySet();
        return list;
    }
}
