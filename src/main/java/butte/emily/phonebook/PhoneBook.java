package butte.emily.phonebook;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class PhoneBook {

    //HashMap<String, String> singleNumEntry = new HashMap<String, String>();
    public HashMap<String, ArrayList<String>> multiNumEntry = new HashMap<String, ArrayList<String>>();


    public int size() {
        int size = multiNumEntry.size();
        return size;
    }

    public void lookUp(String name) {
        System.out.println(name + "'s Phone number(s) is/are: " + multiNumEntry.get(name));
    }

    public synchronized void addEntry(String name, String phoneNumber, String s) {
        List<String> listing = multiNumEntry.get(name);
        if(listing == null) {
            listing = new ArrayList<String>();
            listing.add(phoneNumber);
            multiNumEntry.put(name, (ArrayList<String>) listing);
        } else {
            if(!listing.contains(phoneNumber)) listing.add(phoneNumber);
        }
    }

    public void removeEntry(String  name) {
        multiNumEntry.remove(name);
    }

    public void listEntries() {
        System.out.println(multiNumEntry.entrySet());
    }

    public void reverseLookUp() {
        for (String s : multiNumEntry.keySet()) {
            if (multiNumEntry.keySet().equals(s)) {
                System.out.println(multiNumEntry.keySet().toString());
            }
        }
    }
}

