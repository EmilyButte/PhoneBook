package butte.emily.phonebook;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;


/**
 * Created by emilybutte on 9/28/16.
 */
public class PhoneBookTest {

    PhoneBook phoneBook = new PhoneBook("Emily Butte", "(701) 371-7515");


    @Test
    public void lookUpTest() {
        String actual = "(701) 371-7515";
        String expected = phoneBook.listing.get("Emily Butte");
        Assert.assertNotEquals("should return listing name & phone number", actual, expected);
    }

    @Test
    public void addEntry() {
        String expected = phoneBook.listing.put("Emily Butte", "(701) 371-7515");
        Assert.assertNotEquals("should add a listing name & phone number to the phone book", expected);
    }
}
