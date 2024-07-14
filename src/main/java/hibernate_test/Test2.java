package hibernate_test;

import hibernate_test.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class Test2 {
    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration().configure().addAnnotatedClass(Employee.class)
                .buildSessionFactory();


        try{
            Session session = sessionFactory.getCurrentSession();
            session.beginTransaction();

            List<Employee> list = session.createQuery("from Employee WHERE name='Dima' AND id IN (3,4) ").getResultList();

            for (Employee e: list) {
                System.out.println(e);
            }

            session.getTransaction().commit();
        }finally {
            sessionFactory.close();
        }
    }
}
