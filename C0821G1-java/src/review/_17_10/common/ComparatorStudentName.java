package review._17_10.common;

import review._17_10.model.Student;

import java.util.Comparator;

public class ComparatorStudentName implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return o1.getStudentName().compareTo(o2.getStudentName());
    }
}
