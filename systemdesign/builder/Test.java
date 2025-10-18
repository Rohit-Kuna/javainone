public class Test {

    public static void main(String[] args) throws Exception{
        // we want to make a bilder pattern
        // Student object -> shouldn't get created if any validation fails
        // To many args are passed in constr
        
        // here we are first creating helperStudent object and passing it to Student
        // HelperStudent h = new HelperStudent("Javed",1,"A",92,8);
        // Student s = new Student(h);
        // System.out.println(s);

        // In the above case, we are giving the responsibility to client to create another object and pass, 
        // but we must somehow service should provide me the builder right 

        Student s = new Student.StudentBuilder().setName("KK").setAge(12).setMarks(90).build();
        System.out.println(s);

    }
    
}
