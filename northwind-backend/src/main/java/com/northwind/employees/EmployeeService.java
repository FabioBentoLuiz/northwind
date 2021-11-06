package com.northwind.employees;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
    private final EmployeeRepository employeeRepo;

    @Autowired
    public EmployeeService(EmployeeRepository employeeRepo) {
        this.employeeRepo = employeeRepo;
    }

    public List<Employee> getAll() {
        return this.employeeRepo.findAll();
    }

    public Employee getEmployeeById(Long id) {
        return this.employeeRepo.findById(id).orElseThrow(() -> new EmployeeNotFoundException());
    }
}
