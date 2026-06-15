package corejavapractice.practice;

import java.util.List;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class ComparatorTest {
    public static void main(String[] args) {

        // Use Comparable when you want to define natural ordering for Object Classes (you can edit class definition)
        // Comparable -> obj1.compareTo(obj2)
        // Example:
        List<Employee> empList=new ArrayList<>(List.of(new Employee(4, "Harman"), new Employee(2, "Josh")));
        // empList.sort(Comparator.naturalOrder()); // need to pass atleast the Comparator.naturalOrder() to use default sort condition method defined in class i.e. Comparable
        Collections.sort(empList);
        System.out.println(empList);
        
        // Use Comparator when you want instant custom ordering rule on Objects 
        // Comparator -> compare(obj1,obj2)
        List<Student> studentList = List.of(new Student("Raman", 90), new Student("Urvashi", 85), new Student("Kiran", 92) );
        studentList.sort((s1,s2)->s1.getMarks()-s2.getMarks()); // basically passing an implementation of Comparator's compare method
        studentList.sort((s1,s2)->Integer.compare(s1.getMarks(),s2.getMarks())); // inbuilt compare for int
        studentList.sort(Comparator.comparing(Student::getMarks));

        studentList.sort((s1,s2)->s1.getName().compareTo(s2.getName())); // inbuilt compareTo for String comparison
        studentList.sort(Comparator.comparing(Student::getName));
        studentList.sort(Comparator.comparing(Student::getName).reversed());
        Collections.sort(studentList,Comparator.comparing(Student::getName).reversed());
        
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

class Employee implements Comparable<Employee>{
    private int empId;
    private String empName;

    public Employee(int empId, String empName){
        this.empId=empId;
        this.empName=empName;
    }

    @Override
    public int compareTo(Employee other){
        return Integer.compare(this.empId,other.empId);
    }

    @Override
    public String toString(){
        return this.empId+"-"+this.empName;
    }
}
