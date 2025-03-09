package classAndObjectLesson.model;

public class Student{
    private Integer id;
    private String name;
    private String email;
    //
    public void setStudentInfo(Integer studentId, String studentName, String studentEmail){
        id = studentId;
        name = studentName;
        email = studentEmail;
    }
    public void getStudentInfo(){
        System.out.println("Student ID: " + id);
        System.out.println("Student Name: " + name);
        System.out.println("Student Email: " + email);
    }
}
