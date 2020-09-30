package optional.homework;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class Application {
    public static void main(String[] args) {
        Map<Student, Teacher> students = new HashMap<>();
        Teacher teacher = new Teacher("name");
        Teacher t1 = new Teacher("Jak Kowalski");
        Teacher t2 = new Teacher("Zbigniew Nowak");
        Teacher undefined = new Teacher("undefined");

        Optional<Teacher> optionalTeacher = Optional.ofNullable(teacher);
        optionalTeacher.ifPresent(t -> System.out.println(t.getName()));


        Student s1 = new Student("Kamil Matuga", t1);
        Student s2 = new Student("Adam Margul", t2);
        Student s3 = new Student("Patrycja Kwarta", undefined);




    }
}
