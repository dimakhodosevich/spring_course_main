package spring_annotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import spring_introduction.Person;

public class MainTest {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext c = new AnnotationConfigApplicationContext(MyConfig.class);

       Personn p = c.getBean("personnBean", Personn.class);
       p.callYourPet();
        System.out.println(p.getSurName());
        System.out.println(p.getAge());

    }
}
