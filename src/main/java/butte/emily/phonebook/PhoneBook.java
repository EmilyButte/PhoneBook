package butte.emily.phonebook;

import java.util.HashMap;

public class PhoneBook {

    public HashMap<String, String> phonebook = new HashMap<String, String>();


    public int size() {
        int size = phonebook.size();
        return size;
    }

    public void lookUp(String name) {
        System.out.println(name + "'s Phone number is: " + phonebook.get(name));
    }

    public void addEntry(String name, String phoneNumber) {
        phonebook.put(name, phoneNumber);
    }

    public void removeEntry(String name) {
        phonebook.remove(name);
    }

    public void listEntries() {
        System.out.println(phonebook.entrySet());
    }

    public void reverseLookUp(String phoneNumber) {
        for (String s : phonebook.keySet()) {
            if (phonebook.keySet().equals(s)) {
                System.out.println(phonebook.keySet());
            }
        }
    }
}

