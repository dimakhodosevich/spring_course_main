package hibernate_test.entity;

import javax.persistence.*;

@Entity
@Table(name="employees")
public class Employee {

    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.IDENTITY) // всегда указывать -  стратегия основана на автоматическом увеличении id по правилам базы данных
//    @GeneratedValue(strategy = GenerationType.SEQUENCE) - не выгодно
//    @GeneratedValue(strategy = GenerationType.TABLE) // создает таблицу и из нее потом уже делает auto_increment - не выгодно
//    @GeneratedValue(strategy = GenerationType.AUTO) // default - ориентация на базу данных - не выгодно
    private int id;
    @Column(name="name")
    private String name;
    @Column(name="surname")
    private String surname;
    @Column(name="department")
    private String department;

    @Column(name="salary")
    private int salary;

    public Employee() {
    }

    public Employee(String name, String surname, String department, int salary) {
        this.name = name;
        this.surname = surname;
        this.department = department;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", department='" + department + '\'' +
                ", salary='" + salary + '\'' +
                '}';
    }
}
