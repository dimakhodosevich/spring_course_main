package spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext c = new ClassPathXmlApplicationContext("applicationContextScope.xml");
        Dog pet1 = c.getBean("Pet", Dog.class);
        Dog pet2 = c.getBean("Pet", Dog.class);

        pet1.say();
        pet2.say();

        c.close();
    }
}
