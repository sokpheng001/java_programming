package classAndObjectLesson.model;

import lombok.*;


@Data
@RequiredArgsConstructor

public class User {
    private Integer id;
    private String name;
    private String email;
    private String password;
    private String profile;
}
