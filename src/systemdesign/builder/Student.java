package systemdesign.builder;
/*
 * Key Objectives that we want to solve :
 * We should not allow creation of Student object unless all validations are true
 * Multiple parameters to be passed in the constructor, leads to jumble in case of similar datatype parametrs
 * We want Student object to be immutable
 * Desc :
 * StudentBuilder is a helper class, who's object we can pass in Student
 * No setters for Student class attributes as we want it immutable
 * But public Getters for Student class -> as we want after creation
 */
public class Student {
    // private final : to make it -> immutable
    private final String studentName;
    private final int studentRoll;
    private final String studentGrade;
    private final int studentMarks;
    private final int studentAge;

    private Student(StudentBuilder h) { // only builder can call
        this.studentName = h.name;
        this.studentRoll = h.roll;
        this.studentGrade = h.grade;
        this.studentMarks = h.marks;
        this.studentAge = h.age;
    }

    // public Getters for Student class, as we may need it after creating student
    // Note : no setters as immutable
    public String getName() {
        return this.studentName;
    }
    public int getRoll() {
        return this.studentRoll;
    }
    public String getGrade() {
        return this.studentGrade;
    }
    public int getMarks() {
        return this.studentMarks;
    }
    public int getAge() {
        return this.studentAge;
    }

    // optional for logging
    @Override
    public String toString() {
        return String.format("Student{name='%s',roll=%d,grade='%s',marks=%d,age=%d}",studentName, studentRoll, studentGrade,studentMarks, studentAge);
    }

    // static : As we want to create an Object of helper(i.e. StudentBuilder) first, not Student, user has only access to Student class
    // nested : As the StudentBuilder class is related to Student class and should be used for creation of Student class, and not independently
    public static class StudentBuilder {

        // replica object that we can pass into student
        // will have same things as in student, but mutable : hence no final
        private String name;
        private int roll;
        private String grade;
        private int marks;
        private int age;

        // public (as we want it available outside) Setter like methods which return StudentBuilder for chaining
        public StudentBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public StudentBuilder setRoll(int roll) {
            this.roll = roll;
            return this;
        }

        public StudentBuilder setGrade(String grade) {
            this.grade = grade;
            return this;
        }

        public StudentBuilder setMarks(int marks) {
            this.marks = marks;
            return this;
        }

        public StudentBuilder setAge(int age) {
            this.age = age;
            return this;
        }

        private void validateStudentData() throws IllegalArgumentException {
            // validations
            if (this.age >= 30) {
                throw new IllegalArgumentException("Age should be less than 30");
            }
            if (this.marks < 0) {
                throw new IllegalArgumentException("Marks can't be negative");
            }
        }

        // terminating method which returns object of Student class
        public Student build() throws IllegalArgumentException {
            validateStudentData(); // validate before creating Student object
            return new Student(this); // using the only custom constructor of Student which expects object of StudentBuilder class
        }

    }

}