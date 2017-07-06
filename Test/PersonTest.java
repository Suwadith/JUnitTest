import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Suwadith on 7/6/2017.
 */

public class PersonTest {

    private Person jack = new Person("Jack", 21, "Male");

    @Test
    public void getName() throws Exception {
        assertEquals("Jack", jack.getName());
    }

    @Test
    public void getAge() throws Exception {
        assertEquals(21, jack.getAge());
    }

    @Test
    public void getGender() throws Exception {
        assertEquals("Male", jack.getGender());
    }

    @Test
    public void testHappyAtStart() throws Exception {
        assertFalse(jack.isHappy());
    }

    @Test
    public void testHappyAfterPlay() throws Exception {
    jack.playWithRock();
        assertTrue(jack.isHappy());
    }


}