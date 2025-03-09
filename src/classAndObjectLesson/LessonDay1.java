package classAndObjectLesson;

import classAndObjectLesson.model.Student;

public class LessonDay1 {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.setStudentInfo(1,"Nimith",
                "nimith123@gmail.com");
        Student student2 = new Student();
        student2.setStudentInfo(2,"Wining",
                "wining123@gmail.com");
        // get object info
        student1.getStudentInfo();
        student2.getStudentInfo();
    }
}
