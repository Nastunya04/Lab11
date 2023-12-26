package task1;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Student user = Student.builder()
                .name("Nastia")
                .age(18)
                .weight(60.0)
                .height(169.0)
                .gender("f")
                .mark(100)
                .mark(99)
                .grades(Arrays.asList(61,100,62))
                .build();
        System.out.println(user);
    }
}
