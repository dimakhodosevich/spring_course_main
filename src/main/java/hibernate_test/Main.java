package hibernate_test;

import hibernate_test.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) {
        // Создание фабрики сессий
        SessionFactory factory = new Configuration().configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class).buildSessionFactory();


        try {
            // Получение текущей сессии
            Session session = factory.getCurrentSession();

            // Создание объекта Employee
            Employee employee = new Employee("Yna", "Sidorova", "Engeneer", 1000);

            // Начало транзакции
            session.beginTransaction();

            // Сохранение объекта Employee
            session.save(employee);

            // Подтверждение транзакции
            session.getTransaction().commit();

            System.out.println(employee);

        } finally {
            // Закрытие фабрики сессий
            factory.close();
        }
    }
}
