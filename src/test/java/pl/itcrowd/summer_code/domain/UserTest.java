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

        //when
        user.setEmail(email);

        //then
        assertEquals(email, user.getEmail());
    }

    @Test
    public void testId()
    {
        //given
        Long id = 1234L;

        //when
        user.setId(id);

        //then
        assertEquals(id , user.getId());
    }

    @Test
    public void testHashCode()
    {
        //given
        Long userId = 1234L;
        int  hash =  userId.hashCode();
        User user2 = new User();

        //when
        user.setId(userId);
        int userHash = user.hashCode();

        //then
        assertEquals(hash , userHash);
        assertEquals(0 , user2.hashCode()); // user2.id == null
    }

    @Test
    public void testEquals()
    {
        //given
        User user3 = user;
        User user4 = new User();

        //when
        user.setId(2121L);
        User user2 = new User(2121L, "tempemail@wp.pl");

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
