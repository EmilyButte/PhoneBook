package butte.emily.phonebook;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class PhoneBookTest {

    private PhoneBook tester;

    @Before
    public void tester() {
        tester = new PhoneBook();
        tester.addEntry("Emily Butte", "(701) 371-7515");
    }

    @Test
    public void lookUpTest() {
        String actual = "(701) 371-7515";
        String expected = tester.listing.get("Emily Butte");
        Assert.assertEquals("should return phone number", actual, expected);
    }

    @Test
    public void addEntry() {
        String expected = tester.listing.put("Emily Butte", "(701) 371-7515");
        Assert.assertNotEquals("should add a listing name & phone number to the phone book", expected);
    }

//    @Test
//    public void reverseLookUp() {
//        String actual = "Emily Butte";
//        String expected = phoneBook.listing.get("(701) 371-7515");
//        Assert.assertNotEquals("should return a name", actual, expected);
//    }
}
