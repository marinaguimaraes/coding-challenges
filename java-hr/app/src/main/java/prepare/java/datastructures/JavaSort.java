package prepare.java.datastructures;

import java.util.*;

class JavaSortStudent{
    private int id;
    private String fname;
    private double cgpa;
    public JavaSortStudent(int id, String fname, double cgpa) {
        super();
        this.id = id;
        this.fname = fname;
        this.cgpa = cgpa;
    }
    public int getId() {
        return id;
    }
    public String getFname() {
        return fname;
    }
    public double getCgpa() {
        return cgpa;
    }
}

class StudentComparator implements Comparator<JavaSortStudent> {

    @Override
    public int compare(JavaSortStudent o1, JavaSortStudent o2) {
        if (o1.equals(o2)) return 0;
        if (o1.getCgpa() == o2.getCgpa()) {
            int compareNames = o1.getFname().compareTo(o2.getFname());
            if (compareNames == 0) {
                return o1.getId() < o2.getId() ? -1 : 1;
            }
            return compareNames;
        }
        return o1.getCgpa() < o2.getCgpa() ? 1 : -1;
    }
}

//Complete the code
public class JavaSort
{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());

        List<JavaSortStudent> studentList = new ArrayList<>();
        while(testCases>0){
            int id = in.nextInt();
            String fname = in.next();
            double cgpa = in.nextDouble();

            JavaSortStudent st = new JavaSortStudent(id, fname, cgpa);
            studentList.add(st);

            testCases--;
        }

        Comparator<? super JavaSortStudent> studentComparator = new StudentComparator();
        studentList.sort(studentComparator);

        for(JavaSortStudent st: studentList){
            System.out.println(st.getFname());
        }
    }
}