package com.reliaquest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.reliaquest.dao.EmployeeRepo;
import com.reliaquest.entity.Employee;
import com.reliaquest.entity.EmployeeDTO;
import com.reliaquest.mapper.EmployeeEntityMapper;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepo employeeRepo;
	
	@Autowired
	private EmployeeEntityMapper employeeEntityMapper;
	
	public List<Employee> getAllEmployees() {
		return employeeRepo.findAll();
	}

	public List<Employee> getEmployeesByNameSearch(String searchString) {
		return employeeRepo.findByFullName(searchString);
	}

	public Employee getEmployeeById(String id) {
		return employeeRepo.findById(Long.valueOf(id)).orElse(null);
	}

	public Integer getHighestSalaryOfEmployees() {
		return employeeRepo.findByMaxSalary();
	}

	public List<String> getTopTenHighestEarningEmployeeNames() {
		return employeeRepo.findTopTenHigestEarningEmployeeName();
	}

	public Employee createEmployee(EmployeeDTO employeeInput) {
		Employee employee = employeeEntityMapper.convertInputToEmployeeEntity(employeeInput);
		employeeRepo.save(employee);
		return employee;
	}

	public String deleteEmployeeById(String id) {
		Employee entity = employeeRepo.findById(Long.valueOf(id)).orElse(null);
		if (entity != null) {
			employeeRepo.deleteById(Long.valueOf(id));
			return "Deleted Entity Succesfully!";
		} else {
			return "Entity Not Found!";
		}
	}

}
