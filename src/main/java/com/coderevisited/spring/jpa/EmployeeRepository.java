package com.coderevisited.spring.jpa;

import org.springframework.data.repository.CrudRepository;

/**
 * Created by suresh on 17/12/13.
 */
public interface EmployeeRepository extends CrudRepository<Employee, Integer> {
}
