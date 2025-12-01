package com.reliaquest.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.reliaquest.entity.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Long>{

}
