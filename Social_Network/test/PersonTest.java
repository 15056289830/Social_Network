import junit.framework.TestCase;

import javax.swing.*;

public class PersonTest extends TestCase {

    public void testNewfriend() {
        Person Rose = new Person("Rose");
        Person Jay = new Person("Jay");
        Rose.newfriend(Jay);
        assertEquals(Jay,Rose.Freiends().get(0));
    }

    public void testMyname() {
        Person Rose = new Person("Rose");
        assertEquals("Rose",Rose.myname());
    }

    public void testFreiends() {
        Person Rose = new Person("Rose");
        Person Jay = new Person("Jay");
        Person Joe = new Person("Joe");
        Rose.newfriend(Jay);
        assertEquals(Jay,Rose.Freiends().get(Rose.Freiends().size()-1));
        Rose.newfriend(Joe);
        assertEquals(Joe,Rose.Freiends().get(Rose.Freiends().size()-1));
    }
}