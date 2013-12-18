package com.coderevisited.spring.jpa;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by suresh on 17/12/13.
 */


public class EmployeeTest {

    private static CrudRepository repository;

    public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
        repository = context.getBean(EmployeeRepository.class);

        createEmployee(22, "Saint", "Peter", "Engineering");
        createEmployee(23, "Jack", " Dorsey", "Imaginea");
        createEmployee(24, "Sam", "Fox", "Imaginea");

        context.close();

    }

    private static void createEmployee(int id, String firstName, String lastName, String dept) {

        Employee emp = new Employee(id, firstName, lastName, dept);
        repository.save(emp);
    }

}
