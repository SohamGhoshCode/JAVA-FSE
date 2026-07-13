package com.example.persistencecomparison;

import com.example.persistencecomparison.entity.Employee;
import com.example.persistencecomparison.hibernate.HibernateEmployeeManager;
import com.example.persistencecomparison.service.EmployeeService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class PersistenceComparisonApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(PersistenceComparisonApplication.class, args);

        HibernateEmployeeManager hibernateEmployeeManager = context.getBean(HibernateEmployeeManager.class);
        Employee emp1 = new Employee();
        emp1.setFirstName("John");
        emp1.setLastName("Smith");
        emp1.setSalary(50000);
        Integer hibernateId = hibernateEmployeeManager.addEmployee(emp1);
        System.out.println("Hibernate addEmployee - Generated ID: " + hibernateId);

        EmployeeService employeeService = context.getBean(EmployeeService.class);
        Employee emp2 = new Employee();
        emp2.setFirstName("Jane");
        emp2.setLastName("Doe");
        emp2.setSalary(60000);
        employeeService.addEmployee(emp2);
        System.out.println("Spring Data JPA addEmployee - Employee saved: " + emp2);
    }
}
