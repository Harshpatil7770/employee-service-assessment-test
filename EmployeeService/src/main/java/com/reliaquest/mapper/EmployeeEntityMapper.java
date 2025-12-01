package com.reliaquest.mapper;

import org.springframework.stereotype.Component;

import com.reliaquest.entity.Entity;
import com.reliaquest.entity.Input;

@Component
public class EmployeeEntityMapper {

	
	public Entity convertInputToEmployeeEntity(Input input) {
		Entity employee=new Entity();
		employee.setFullName(input.getFullName());
		employee.setDepartmentName(input.getDepartmentName());
		employee.setSalary(input.getSalary());
		return employee;
	}
}
