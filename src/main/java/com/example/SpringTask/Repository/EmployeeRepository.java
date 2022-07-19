package com.example.SpringTask.Repository;

import com.example.SpringTask.Entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;


public interface EmployeeRepository extends JpaRepository<Employee,Long> {
}
