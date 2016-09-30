package butte.emily.phonebook;

import java.util.ArrayList;

/**
 * Created by emilybutte on 9/28/16.
 */
public class App {
    public static void main(String[] args) {

        PhoneBook phoneBook = new PhoneBook();

        ArrayList<String> charlie = new ArrayList<String>();
        charlie.add("(215) 286-7515");
        charlie.add("(918) 378 -2378");

        ArrayList<String> dennis = new ArrayList<String>();
        dennis.add("(215) 286-3926");
        dennis.add("(918) 378 -7856");

        ArrayList<String> dee = new ArrayList<String>();
        dee.add("(215) 610-1111");
        dee.add("(918) 378 -2378");

        ArrayList<String> mac = new ArrayList<String>();
        mac.add("(215) 737-5555");
        mac.add("(215) 573-1213");
        mac.add("(213) 342- 2742");

        ArrayList<String> frank = new ArrayList<String>();
        frank.add("(215) 897-5555");
        frank.add("(215) 637-4632");

        ArrayList<String> waitress = new ArrayList<String>();
        waitress.add("(215) 555-5555");

        phoneBook.multiNumEntry.put("Charlie Day", charlie);
        phoneBook.multiNumEntry.put("Dennis Reynolds", dennis);
        phoneBook.multiNumEntry.put("Dee Reynolds", dee);
        phoneBook.multiNumEntry.put("Ronald McDonald", mac);
        phoneBook.multiNumEntry.put("Frank Reynolds", frank);
        phoneBook.multiNumEntry.put("Waitress", waitress);

        phoneBook.listEntries();
        phoneBook.lookUp("Charlie Day");
        phoneBook.addEntry("Emily Butte", "(701) 371-7515", "(678) 256-4392");
        phoneBook.removeEntry("Dennis Reynolds");
        phoneBook.listEntries();
    }
}
