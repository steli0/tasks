package tasks;

import org.junit.Assert;
import org.junit.Test;

import tasks.Person;

public class PersonTest {

    @Test()
    public void testHashCode() {
        Assert.assertEquals(new Person("Ivan", "Some city, street, and number 8", 25, 100.24),
                new Person("Ivan", "Some city, street, and number 8", 25, 100.24));
    }

}
