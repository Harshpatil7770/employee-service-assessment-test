package com.reliaquest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.reliaquest.entity.Input;
import com.reliaquest.service.EmployeeService;
import com.reliaquest.service.IEmployeeController;

import jakarta.persistence.Entity;
@RestController
@RequestMapping("/api/employees")
public class EmployeeController implements IEmployeeController<Entity, Input>{

	@Autowired
	private EmployeeService employeeService;
	
	@Override
	public ResponseEntity<List<Entity>> getAllEmployees() {
		
		return employeeService.getAllEmployees();
	}

	@Override
	public ResponseEntity<List<Entity>> getEmployeesByNameSearch(String searchString) {
		return employeeService.getEmployeesByNameSearch(searchString);
	}

	@Override
	public ResponseEntity<Entity> getEmployeeById(String id) {
		return employeeService.getEmployeeById(id);
	}

	@Override
	public ResponseEntity<Integer> getHighestSalaryOfEmployees() {
		return employeeService.getHighestSalaryOfEmployees();
	}

	@Override
	public ResponseEntity<List<String>> getTopTenHighestEarningEmployeeNames() {
		return employeeService.getTopTenHighestEarningEmployeeNames();
	}

	@Override
	public ResponseEntity<Entity> createEmployee(Input employeeInput) {
		return employeeService.createEmployee(employeeInput) ;
	}

	@Override
	public ResponseEntity<String> deleteEmployeeById(String id) {
		return employeeService.deleteEmployeeById(id) ;
	}

}
