package com.reliaquest.entity;

import java.sql.Date;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Input {

	private Long id;

	private String fullName;

	private Date dob;

	private String departmentName;

	private Double salary;
}
