package collection.list;

import misc.Student;

public class Arrays {
    public static void main(String[] args){
        // What happens if I want to store non primitives i.e. Objects in array
        // addresss ref of that Object is stored
        Student[] studArry=new Student[100];
        studArry[0]=new Student("Raj",100); // address of Student object Raj is stored heer
    }
}
