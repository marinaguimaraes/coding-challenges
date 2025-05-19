package prepare.java.datastructures;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class JavaSortTest {

    @Test
    public void testSampleInput() {
        JavaSortStudent rumpa = new JavaSortStudent(33, "Rumpa", 3.68);
        JavaSortStudent ashis = new JavaSortStudent(85, "Ashis", 3.85);
        JavaSortStudent samiha = new JavaSortStudent(56, "Samiha", 3.75);
        JavaSortStudent samara = new JavaSortStudent(19, "Samara", 3.75);
        JavaSortStudent fahim = new JavaSortStudent(22, "Fahim", 3.76);

        List<JavaSortStudent> studentList = new ArrayList<>();

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
        JavaSortStudent rumpa = new JavaSortStudent(33, "Rumpa", 3.68);
        JavaSortStudent ashis = new JavaSortStudent(85, "Ashis", 3.85);
        JavaSortStudent samiha56 = new JavaSortStudent(56, "Samiha", 3.75);
        JavaSortStudent samiha19 = new JavaSortStudent(19, "Samiha", 3.75);
        JavaSortStudent fahim = new JavaSortStudent(22, "Fahim", 3.76);

        List<JavaSortStudent> studentList = new ArrayList<>();

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
