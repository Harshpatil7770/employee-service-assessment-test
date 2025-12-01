package com.reliaquest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.reliaquest.entity.Input;
import com.reliaquest.service.EmployeeService;
import com.reliaquest.service.IEmployeeController;
import com.reliaquest.entity.Entity;

@RestController
@RequestMapping("/api/employees")
//Entity - entity , Input - inputDTO
public class EmployeeController implements IEmployeeController<Entity, Input>{

	@Autowired
	private EmployeeService employeeService;
	
	@Override
	public ResponseEntity<List<Entity>> getAllEmployees() {
		return new ResponseEntity<>(employeeService.getAllEmployees(), HttpStatus.OK);
	}

	@Override
	public ResponseEntity<List<Entity>> getEmployeesByNameSearch(String searchString) {
		return new ResponseEntity<>(employeeService.getEmployeesByNameSearch(searchString), HttpStatus.OK);
	}

	@Override
	public ResponseEntity<Entity> getEmployeeById(String id) {
		return new ResponseEntity<>(employeeService.getEmployeeById(id), HttpStatus.OK);
	}

	@Override
	public ResponseEntity<Integer> getHighestSalaryOfEmployees() {
		return new ResponseEntity<>(employeeService.getHighestSalaryOfEmployees(), HttpStatus.OK);
	}

	@Override
	public ResponseEntity<List<String>> getTopTenHighestEarningEmployeeNames() {
		return new ResponseEntity<>(employeeService.getTopTenHighestEarningEmployeeNames(), HttpStatus.OK);
	}

	@Override
	public ResponseEntity<Entity> createEmployee(Input employeeInput) {
		return new ResponseEntity<>(employeeService.createEmployee(employeeInput),HttpStatus.CREATED);
	}

	@Override
	public ResponseEntity<String> deleteEmployeeById(String id) {
		return new ResponseEntity<>(employeeService.deleteEmployeeById(id), HttpStatus.OK);
	}

}
