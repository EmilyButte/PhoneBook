package butte.emily.phonebook;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class PhoneBookTest {

    private PhoneBook tester;

    @Before
    //given
    public void setUp() {
        tester = new PhoneBook();
        tester.addEntry("Emily Butte", "(701) 371-7515", "(678) 256-4392");
    }

    @Test
    public void checkToSeeIfAPhoneNumberIsReturnedWhenANameIsLookedUp() {
        //when
        tester.lookUp("Emily Butte");
        //then
        Assert.assertEquals("(701) 371-7515", tester.multiNumEntry.get("Emily Butte"));
    }

    @Test
    public void addFirstEntryToEmptyPhoneBook() {
        //when
        tester.addEntry("Emily Butte", "(701) 371-7515", "(678) 256-4392");
        //then
        Assert.assertEquals(1, tester.size());
    }

    @Test
    public void addASecondEntryToThePhoneBook() {
        //when
        tester.addEntry("Donald Duck", "(650) 555-5555", "(678) 256-4392");
        //then
        Assert.assertEquals(2, tester.size());
    }

    @Test
    public void removeAnEntryFromThePhoneBook() {
        //when
        tester.removeEntry("Donald Duck");
        //then
        Assert.assertEquals(1, tester.size());
    }

//    @Test
//    public void checkToSeeIfAnEntryCanBeLookedUpUsingThePhoneNumber() {
//        //when
//        tester.reverseLookUp("(701) 371-7515");
//        //then
//        Assert.assertEquals("Emily Butte", tester.multiNumEntry.keySet());
//    }
}
