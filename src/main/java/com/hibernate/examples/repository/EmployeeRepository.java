package com.hibernate.examples.repository;

import com.hibernate.examples.entity.EmployeeIdentity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hibernate.examples.entity.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, EmployeeIdentity>{

}
