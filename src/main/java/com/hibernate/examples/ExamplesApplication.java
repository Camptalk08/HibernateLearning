package com.hibernate.examples;

import com.hibernate.examples.entity.Employee;
import com.hibernate.examples.entity.EmployeeIdentity;
import com.hibernate.examples.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ExamplesApplication implements CommandLineRunner {

    @Autowired
    private EmployeeRepository employeeRepository;

    public static void main(String[] args) {
        SpringApplication.run(ExamplesApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        // delete all tables
		employeeRepository.deleteAllInBatch();

		//employee object and insert in database
		Employee employee = new Employee(new EmployeeIdentity("E-001","C-001"),"asma","asma@gmail.com","1234567890");
        employeeRepository.save(employee);
    }
}
