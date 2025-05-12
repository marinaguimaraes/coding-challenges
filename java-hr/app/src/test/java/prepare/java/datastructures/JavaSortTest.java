package prepare.java.datastructures;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class JavaSortTest {

    @Test
    public void testSampleInput() {
        Student rumpa = new Student(33, "Rumpa", 3.68);
        Student ashis = new Student(85, "Ashis", 3.85);
        Student samiha = new Student(56, "Samiha", 3.75);
        Student samara = new Student(19, "Samara", 3.75);
        Student fahim = new Student(22, "Fahim", 3.76);

        List<Student> studentList = new ArrayList<>();

        studentList.add(rumpa);
        studentList.add(ashis);
        studentList.add(samiha);
        studentList.add(samara);
        studentList.add(fahim);

        StudentComparator comparator = new StudentComparator();
        studentList.sort(comparator);

        assertEquals(ashis, studentList.get(0));
        assertEquals(fahim, studentList.get(1));
        assertEquals(samara, studentList.get(2));
        assertEquals(samiha, studentList.get(3));
        assertEquals(rumpa, studentList.get(4));
    }

    @Test
    public void testNeedsOrderingByID() {
        Student rumpa = new Student(33, "Rumpa", 3.68);
        Student ashis = new Student(85, "Ashis", 3.85);
        Student samiha56 = new Student(56, "Samiha", 3.75);
        Student samiha19 = new Student(19, "Samiha", 3.75);
        Student fahim = new Student(22, "Fahim", 3.76);

        List<Student> studentList = new ArrayList<>();

        studentList.add(rumpa);
        studentList.add(ashis);
        studentList.add(samiha56);
        studentList.add(samiha19);
        studentList.add(fahim);

        StudentComparator comparator = new StudentComparator();
        studentList.sort(comparator);

        assertEquals(ashis, studentList.get(0));
        assertEquals(fahim, studentList.get(1));
        assertEquals(samiha19, studentList.get(2));
        assertEquals(samiha56, studentList.get(3));
        assertEquals(rumpa, studentList.get(4));
    }

}
