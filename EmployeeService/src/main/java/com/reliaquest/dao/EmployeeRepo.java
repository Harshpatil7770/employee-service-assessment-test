package com.reliaquest.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.http.ResponseEntity;

import com.reliaquest.entity.Entity;

public interface EmployeeRepo extends JpaRepository<Entity, Long>{

	List<Entity> findByFullName(String searchString);

	@Query(value="SELECT FULL_NAME FROM ENTITY ORDER BY SALARY DESC LIMIT 10",nativeQuery =true)
	List<String> findTopTenHigestEarningEmployeeName();

	@Query(value="SELECT MAX(SALARY) FROM ENTITY",nativeQuery = true)
	Integer findByMaxSalary();

}
