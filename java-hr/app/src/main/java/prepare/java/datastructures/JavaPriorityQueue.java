package prepare.java.datastructures;

import java.util.*;

class JavaPriorityQueueStudent implements Comparable<JavaPriorityQueueStudent> {
    private final int id;
    private final String name;
    private final double CGPA;

    public JavaPriorityQueueStudent(int id, String name, double CGPA) {
        this.id = id;
        this.name = name;
        this.CGPA = CGPA;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getCGPA() {
        return CGPA;
    }

    @Override
    public int compareTo(JavaPriorityQueueStudent o) {
        if (this.equals(o)) return 0;

        int compareCGPA = Double.compare(o.getCGPA(), this.getCGPA());
        if (compareCGPA != 0) {
            return compareCGPA;
        }

        int compareNames = this.getName().compareTo(o.getName());
        if (compareNames != 0) {
            return compareNames;
        }

        return Integer.compare(this.getId(), o.getId());
    }
}

class Priorities {

    public List<JavaPriorityQueueStudent> getStudents(List<String> events) {
        PriorityQueue<JavaPriorityQueueStudent> queue = new PriorityQueue<>();
        for (String event : events) {
            if ("SERVED".equals(event)) {
                queue.poll();
            } else {
                JavaPriorityQueueStudent student = newStudentInLine(event);
                queue.offer(student);
            }
        }

        return queue.stream().sorted().toList();
    }

    private JavaPriorityQueueStudent newStudentInLine(String enterStudent) {
        // ENTER John 3.75 50
        String[] std = enterStudent.split(" "); //std[0] == "ENTER"
        String name = std[1];
        double CGPA = Double.parseDouble(std[2]);
        int id = Integer.parseInt(std[3]);
        return new JavaPriorityQueueStudent(id,name,CGPA);
    }
}

public class JavaPriorityQueue {
    private final static Scanner scan = new Scanner(System.in);
    private final static Priorities priorities = new Priorities();

    public static void main(String[] args) {
        int totalEvents = Integer.parseInt(scan.nextLine());
        List<String> events = new ArrayList<>();

        while (totalEvents-- != 0) {
            String event = scan.nextLine();
            events.add(event);
        }

        List<JavaPriorityQueueStudent> students = priorities.getStudents(events);

        if (students.isEmpty()) {
            System.out.println("EMPTY");
        } else {
            for (JavaPriorityQueueStudent st: students) {
                System.out.println(st.getName());
            }
        }
    }

}