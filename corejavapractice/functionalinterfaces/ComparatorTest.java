package corejavapractice.functionalinterfaces;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorTest {
    
    public static void main(String ...args){
        // We always pass a comparator when we use .sort method
        // Arrays.sort(), Collections.sort(), list.stream().sorted(), listStudents.sort()
        // Collections.reverseOrder()
        // Collections.reverse(List<T>)
        // Comparator.reversed()
        // 
        // Use comparator when you want to pass custom sorting condition as an implementation of Comparator interface or as lambda function
        
        // Suppose you have a class called employee
        // You don't want to define natural sorting (using Comparable in class) and instead want to custome sort sometimes by name, sometimes by marks

        List<Student> studentList = Arrays.asList(new Student("Rahul", 100), new Student("Tony", 88), new Student("Bruce", 90));

        // way 1 : define comparator function separately and pass in sort() - Reusable
        class marksComparator implements Comparator<Student>{
            @Override
            public int compare(Student s1, Student s2){
                return Integer.compare(s1.getMarks(), s2.getMarks());
            }
        }

        Collections.sort(studentList, new marksComparator());
        System.out.println(studentList);

        // way 2 : Anonymous class, directly define while calling Collections.sort() 
        // this too is a valid way to write a class which implements Comparator
        Comparator<Student> nameComparator = new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2){
                return (s2.getName()).compareTo(s2.getName());
            }
        };
        // we can skip writing the class name so we can directly pass
        Collections.sort(studentList, new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2){
                return (s2.getName()).compareTo(s2.getName());
            }
        });
        System.out.println(studentList);

        // simple pass it as lambda function
        // eg:
        Comparator<Student> compareName = (Student s1,Student s2)->{
            return s1.getName().compareTo(s2.getName());
        };
        // or simply
        Collections.sort(studentList,(s1,s2)->s1.getName().compareTo(s2.getName())); // string -> str1.compareTo(str2);
        Collections.sort(studentList,(s1,s2)->Integer.compare(s1.getMarks(),s2.getMarks())); // Integer.compare(i1,i2);

        // Using Comparator.comparing()
        // What is Comparator.comparing()?
        // Comparator.comparing() is a static method in the Comparator interface (added in Java 8) 
        // that helps you create a comparator based on a key extractor function—typically 
        // a method reference or lambda.
        // Eg:
        Comparator<Student> byMarks = Comparator.comparing(Student::getMarks);
        // or direct passing
        Collections.sort(studentList, Comparator.comparing(s1->s1.getName()));
        Collections.sort(studentList, Comparator.comparing(Student::getName));// same as above using method reference
        // reversed
        Collections.sort(studentList, Comparator.comparing(Student::getMarks).reversed());
        // multiple criteria chaining
        Collections.sort(
            studentList,
            Comparator.comparing(Student::getMarks)
              .thenComparing(Student::getName)
        );

        // --------------------------------------------------------------------------------------------

        // All methods on Comparator Extra
        // ✅ 1. comparing()
        // Creates a comparator based on a key extractor function.
        Comparator<Student> byMarks2 = Comparator.comparing(Student::getMarks);

        // ✅ 2. comparingInt(), comparingLong(), comparingDouble()
        // Optimized versions of comparing() for primitive types. These avoid boxing overhead for primitives.
        Comparator<Student> byMarksInt = Comparator.comparingInt(Student::getMarks);

        // ✅ 3. reversed()
        // Reverses the order of an existing comparator.
        Comparator<Student> byMarksDesc = Comparator.comparingInt(Student::getMarks).reversed();

        // ✅ 4. thenComparing()
        // Chains another comparator for tie-breaking.
        Comparator<Student> byMarksThenName = Comparator
            .comparingInt(Student::getMarks)
            .thenComparing(Student::getName);

        // 5. nullsFirst(), nullsLast()
        Comparator<Student> byMarksNullSafe = Comparator.nullsFirst(Comparator.comparing(Student::getMarks));
        // even if student marks is null, it will be sorted by keeping nulls first

        // ✅ 6. naturalOrder() and reverseOrder()
        // Returns comparators for natural and reverse ordering of Comparable objects.
        Comparator<String> natural = Comparator.naturalOrder();
        Comparator<String> reverse = Comparator.reverseOrder();

        // ✅ 7. Custom Comparator with Lambda
        Comparator<Student> custom = (s1, s2) -> s1.getMarks() - s2.getMarks();

    }

}

class Student {
    private String name;
    private Integer marks;

    public Student(String name, Integer marks) {
        this.name = name;
        this.marks = marks;
    }

    public Integer getMarks() {
        return marks;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return this.name + "-" + this.marks;
    }

}