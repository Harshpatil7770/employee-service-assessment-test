package com.reliaquest.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
/**
 * @author patil_ha
 */
public class EmployeeDTO {

	private Long id;

	private String fullName;

	private String departmentName;

	private Integer salary;
}
