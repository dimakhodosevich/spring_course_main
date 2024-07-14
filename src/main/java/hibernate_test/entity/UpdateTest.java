package hibernate_test.entity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class UpdateTest {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration().configure()
                .addPackage("hibernate_test.entity").buildSessionFactory();


        try{
            Session session = factory.getCurrentSession();

            session.beginTransaction();


            Employee emp = session.get(Employee.class, 2);
            emp.setName("Yulia");
            emp.setSurname("Ivanchenko");

            session.createQuery("UPDATE Employee SET salary = 1000 WHERE name='Dima'").executeUpdate();

            session.getTransaction().commit();
        }finally {
            factory.close();
        }
    }
}
