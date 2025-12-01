package com.reliaquest.entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@jakarta.persistence.Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Entity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private String fullName;

	private String departmentName;
	
	private Integer salary;
}
