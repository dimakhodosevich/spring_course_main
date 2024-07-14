package hibernate_test.entity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration().configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class).buildSessionFactory();

        try{
            Session session = factory.getCurrentSession();
            session.beginTransaction();
            int id = 2;
            Employee employee = session.get(Employee.class, id);
            session.getTransaction().commit();

            System.out.println(employee);

        } finally {
            factory.close();
        }
    }
}
