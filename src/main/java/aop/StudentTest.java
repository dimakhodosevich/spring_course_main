package aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class StudentTest {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context
                = new AnnotationConfigApplicationContext(ConfigForStudent.class);

        StudentUniversity studentUniversity=context.getBean("studentUniversity", StudentUniversity.class);


       Student st1 = new Student("Ivanov", 34, 3.5);
       Student st2 = new Student("Petrov", 23, 7.5);
       Student st3 = new Student("Sidorov", 35, 9.5);

       studentUniversity.addStudent(st1);
       studentUniversity.addStudent(st2);
       studentUniversity.addStudent(st3);

       List<Student> list = studentUniversity.getStudents();


        System.out.println(studentUniversity);


    }
}
