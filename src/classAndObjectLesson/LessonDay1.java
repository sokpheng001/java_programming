package classAndObjectLesson;

import classAndObjectLesson.model.User;

public class LessonDay1 {
    public static void main(String[] args) {
        User user = new User();
        user.setId(23);
        System.out.println("User ID: " + user.getId());
    }
}
