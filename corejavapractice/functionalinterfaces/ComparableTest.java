package corejavapractice.functionalinterfaces;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

public class ComparableTest {

    public static void main(String... args) {
        // compareTo()
        // Natural ordering -> Integer, String, LocalDate implement Comparable
        // when using natural ordering and don't want to pass a comparator inside sort()
        // when class is in your control and you can modify the class to implement
        // Comparable.

        Student[] studentArray = {
                new Student("Ravi", 85),
                new Student("Neha", 92),
                new Student("Amit", 78)
        };

        Arrays.sort(studentArray); // Uses compareTo() as defined in class

        // for (Student s : studentArray) {
        //     System.out.println(studentArray);
        // }

        // ------------------------------------

        List<Student> studentList = Arrays.asList(new Student("Rahul", 100), new Student("Tony", 88),
                new Student("Bruce", 90));
        Collections.sort(studentList); // sorts the list doesn't return anything  

        System.out.println(studentList);

        // sort employees
        List<Employee> employeeList = List.of(new Employee("Rahul", "HR"),new Employee("Ankita", "Marketing"), new Employee("Helios","BA")).stream().sorted().toList();
        // in sorted not passing comparator, so natural sorting i.e. defined  for class is used
        System.out.println(employeeList);

        // ---------------------------------------------

        TreeSet<Employee> employeesTreeSet = new TreeSet<>();
        employeesTreeSet.add(new Employee("Kiran", "HR"));
        employeesTreeSet.add(new Employee("Xavier", "Marketing"));
        employeesTreeSet.add(new Employee("Bravo", "IT")); 
        // As we are using Treeset bydefault it's in sorted order, so compareTo of class is being used internally
        System.out.println(employeesTreeSet);


    }

}

class Student implements Comparable<Student> {
    private String name;
    private Integer marks;

    public Student(String name, Integer marks) {
        this.name = name;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return this.name + "-" + this.marks;
    }

    // Suppose we want to have natural ordering in class as sort by ascending order
    // of marks
    @Override
    public int compareTo(Student other) {
        return Integer.compare(this.marks, other.marks); // use this when comparing two integers
        // could have done this
        // return this.marks-other.marks; // vulnerable to overflow
    }

}

class Employee implements Comparable<Employee> {
    private String name;
    private String role;

    public Employee(String name, String role) {
        this.name = name;
        this.role = role;
    }

    @Override
    public int compareTo(Employee other) {
        return (this.name).compareTo(other.name); // use this when comparing two strings
    }

    @Override
    public String toString() {
        return this.name + "-" + this.role;
    }
}

