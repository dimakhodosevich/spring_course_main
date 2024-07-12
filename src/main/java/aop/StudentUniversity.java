package aop;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component("studentUniversity")
@Scope("singleton")
public class StudentUniversity {
    private List<Student> students;

    public StudentUniversity() {
        students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        if (student != null) {
            students.add(student);
        }
    }


    public List<Student> getStudents() {
        for (Student s: students) {
            System.out.println(s);
        }

        return students;
    }

    @Override
    public String toString() {
        return "StudentUniversity{" +
                "students=" + students +
                '}';
    }
}
