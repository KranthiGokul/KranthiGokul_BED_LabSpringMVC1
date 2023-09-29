package com.gl.lab5.EM.Assignment.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.gl.lab5.EM.Assignment.entity.Employee;
import com.gl.lab5.EM.Assignment.repository.EmployeeRepository;
import com.gl.lab5.EM.Assignment.service.EmployeeService;

@Service
public class EmployeServiceImpl implements EmployeeService {

	private EmployeeRepository employeeRepository;

	public EmployeServiceImpl(EmployeeRepository employeeRepository) {
		this.employeeRepository = employeeRepository;
	}

	@Override
	public List<Employee> getAllEmployees() {
		return employeeRepository.findAll();
	}

	@Override
	public Employee saveEmployee(Employee employee) {
		return employeeRepository.save(employee);
	}

	@Override
	public Employee getEmployeeById(Long id) {
		return employeeRepository.findById(id).get();
	}

	@Override
	public Employee updateEmployee(Employee employee) {
		return employeeRepository.save(employee);
	}

	@Override
	public void deleteEmployeeById(Long id) {
		employeeRepository.deleteById(id);
	}

}
