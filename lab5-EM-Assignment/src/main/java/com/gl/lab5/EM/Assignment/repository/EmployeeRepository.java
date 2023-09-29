package com.gl.lab5.EM.Assignment.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gl.lab5.EM.Assignment.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}

