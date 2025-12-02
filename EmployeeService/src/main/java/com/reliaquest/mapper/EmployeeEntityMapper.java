package com.reliaquest.mapper;

import org.springframework.stereotype.Component;

import com.reliaquest.entity.Employee;
import com.reliaquest.entity.EmployeeDTO;
/**
 * @author patil_ha
 */
//convert DTO to entity
@Component
public class EmployeeEntityMapper {

	
	public Employee convertInputToEmployeeEntity(EmployeeDTO input) {
		Employee employee=new Employee();
		employee.setFullName(input.getFullName());
		employee.setDepartmentName(input.getDepartmentName());
		employee.setSalary(input.getSalary());
		return employee;
	}
}
