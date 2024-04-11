package com.example.pipemployeemanagement.repository;

import com.example.pipemployeemanagement.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepo extends JpaRepository<Employee, Integer>
{

}
