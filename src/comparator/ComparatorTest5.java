package comparator;

import java.util.List;

import misc.Student;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Collections;
import java.util.Arrays;
import java.util.Collection;

public class ComparatorTest5 {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>(List.of(new Student("Rakesh", 90), new Student("Bablu", 100), new Student("Ankita", 70)));
        students.sort(new Comparator<Student>(){
            @Override
            public int compare(Student s1, Student s2){
                return Integer.compare(s1.getMarks(),s2.getMarks());
            }
        });
        students.sort((s1,s2)->Integer.compare(s1.getMarks(),s2.getMarks()));
        students.sort(Comparator.comparing(Student::getMarks));

        // Just like Arrays.sort, we have Comparator.sort(obj,new Comparator<T>{...});
        // ASC
        Collections.sort(students,Comparator.comparing(Student::getMarks));

        // DESC
        Collections.sort(students,Comparator.comparing(Student::getMarks,Comparator.reverseOrder()));

        // ASC
        Collections.sort(students,Comparator.comparing(Student::getName));

        // DESC
        Collections.sort(students,Comparator.comparing(Student::getName, Comparator.reverseOrder()));

        // first by name asc, then highest marks order
        Collections.sort(students,Comparator.comparing(Student::getName).thenComparing(Student::getMarks, Comparator.reverseOrder()));


        List<Integer> numbers=new ArrayList<>(Arrays.asList(1,2,3,4));
        Collections.sort(numbers,Comparator.naturalOrder()); // ASC
        Collections.sort(numbers,Comparator.reverseOrder()); // DESC
        Collections.sort(numbers,Comparator.comparingInt(Integer::intValue)); // for primitives
        Collections.sort(Arrays.asList(1L,2L,3L), Comparator.comparingLong(Long::longValue));

    }
}
