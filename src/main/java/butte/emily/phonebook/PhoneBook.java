package butte.emily.phonebook;

import java.util.HashMap;

public class PhoneBook {

    public HashMap<String, String> listing = new HashMap<String, String>();

    public String name;
    public String phoneNumber;


    public void lookUp(String name) {
        System.out.println("Phone number: " + listing.get(name));
    }

    public void addEntry(String name, String phoneNumber) {
        listing.put(name, phoneNumber);
    }

    public void removeEntry(String name) {
        listing.remove(name);
    }

    public void listEntries() {
        System.out.println(listing.keySet());
    }

//    public String reverseLookUp(){
//        return name;
//
//    }

}
