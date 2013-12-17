package com.coderevisited.spring.jpa;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by suresh on 17/12/13.
 */

@Configuration
@EnableJpaRepositories
public class EmployeeTest {

    private static CrudRepository repository;

    public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
        repository = context.getBean(EmployeeRepository.class);

        createEmployee(19, "Saint", "Peter", "Engineering");
        createEmployee(20, "Jack", " Dorsey", "Imaginea");
        createEmployee(21, "Sam", "Fox", "Imaginea");


        context.close();


    }

    private static void createEmployee(int id, String firstName, String lastName, String dept) {

        Employee emp = new Employee(id, firstName, lastName, dept);
        repository.save(emp);

    }


}
