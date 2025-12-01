package com.reliaquest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.reliaquest.dao.EmployeeRepo;
import com.reliaquest.entity.Input;

import jakarta.persistence.Entity;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepo employeeRepo;
	
	public ResponseEntity<List<Entity>> getAllEmployees() {
		return null;
	}

	public ResponseEntity<List<Entity>> getEmployeesByNameSearch(String searchString) {
		return null;
	}

	public ResponseEntity<Entity> getEmployeeById(String id) {
		return null;
	}

	public ResponseEntity<Integer> getHighestSalaryOfEmployees() {
		return null;
	}

	public ResponseEntity<List<String>> getTopTenHighestEarningEmployeeNames() {
		return null;
	}

	public ResponseEntity<Entity> createEmployee(Input employeeInput) {
		return null;
	}

	public ResponseEntity<String> deleteEmployeeById(String id) {
		return null;
	}

}
