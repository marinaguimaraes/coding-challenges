package prepare.java.datastructures;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class JavaPriorityQueueTest {

    @Test
    public void testSampleInput() {
        final Priorities priorities = new Priorities();

        List<String> events = new ArrayList<>();
        events.add("ENTER John 3.75 50");
        events.add("ENTER Mark 3.8 24");
        events.add("ENTER Shafaet 3.7 35");
        events.add("SERVED");
        events.add("SERVED");
        events.add("ENTER Samiha 3.85 36");
        events.add("SERVED");
        events.add("ENTER Ashley 3.9 42");
        events.add("ENTER Maria 3.6 46");
        events.add("ENTER Anik 3.95 49");
        events.add("ENTER Dan 3.95 50");
        events.add("SERVED");

        List<JavaPriorityQueueStudent> students = priorities.getStudents(events);

        assertEquals(4, students.size());
        assertEquals("Dan",students.get(0).getName());
        assertEquals("Ashley",students.get(1).getName());
        assertEquals("Shafaet",students.get(2).getName());
        assertEquals("Maria",students.get(3).getName());
    }

    @Test
    public void testFinalQueueShouldBeEmpty() {
        final Priorities priorities = new Priorities();

        List<String> events = new ArrayList<>();
        events.add("ENTER John 3.75 50");
        events.add("ENTER Mark 3.8 24");
        events.add("ENTER Shafaet 3.7 35");
        events.add("SERVED");
        events.add("SERVED");
        events.add("ENTER Samiha 3.85 36");
        events.add("SERVED");
        events.add("SERVED");

        List<JavaPriorityQueueStudent> students = priorities.getStudents(events);

        assertTrue(students.isEmpty());
    }

    @Test
    public void testOrderByNames() {
        final Priorities priorities = new Priorities();

        List<String> events = new ArrayList<>();
//        events.add("ENTER John 3.8 50");
        events.add("ENTER Mark 3.8 24");
        events.add("ENTER Shafaet 3.8 35");
//        events.add("SERVED");
        events.add("ENTER Samiha 3.8 36");

        List<JavaPriorityQueueStudent> students = priorities.getStudents(events);

        assertEquals(3, students.size());
        assertEquals("Mark",students.get(0).getName());
        assertEquals("Samiha",students.get(1).getName());
        assertEquals("Shafaet",students.get(2).getName());
    }

    @Test
    public void testOrderByID() {
        final Priorities priorities = new Priorities();

        List<String> events = new ArrayList<>();
        events.add("ENTER Jane 3.8 50");
        events.add("ENTER Jane 3.8 24");
        events.add("ENTER Jane 3.8 35");
        events.add("SERVED");
        events.add("ENTER Jane 3.8 36");

        List<JavaPriorityQueueStudent> students = priorities.getStudents(events);

        assertEquals(3, students.size());
        assertEquals(35,students.get(0).getId());
        assertEquals(36,students.get(1).getId());
        assertEquals(50,students.get(2).getId());
    }
}
