package pl.itcrowd.summer_code.domain;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class UserTest {
    User user;

    @Before
    public void beforeTests()
    {
        user = new User();
    }

    @Test
    public void testEmail()
    {
        //given
        String email = "superemail@gmail.com";
        user.setEmail(email);

        //when

        //then
        assertEquals(email, user.getEmail());
    }

    @Test
    public void testHashCode()
    {
        //given
        Long L = 1234L; //User Id
        int  hash =  L.hashCode();

        //when
        user.setId(L);
        int userHash = user.hashCode();

        User user2 = new User();

        //then
        assertEquals(hash , userHash);
        assertEquals(0 , user2.hashCode()); // user2.id == null
    }

    @Test
    public void testEquals()
    {
        //given
        user.setId(2121L);

        //when
        User user2 = new User(2121L, "tempemail@wp.pl");
        User user3 = user;
        User user4 = new User();

        //then
        assertTrue(user.equals(user2));
        assertTrue(user.equals(user3));
        assertFalse(user.equals(user4));
    }


    @Test
    public void testEqualsOtherType()
    {
        //given
        Object object = new Object(); //example object for test (Object is other type than User)
        //when

        //then
        assertFalse(user.equals(object));
    }

}
