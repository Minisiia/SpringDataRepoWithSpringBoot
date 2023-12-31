package com.example.springdatarepo.service;

import com.example.springdatarepo.model.Employee;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface EmployeeService {
    Iterable<Employee> findAll();

    Page<Employee> getEmployees(int pageNumber, int pageSize, String sortBy);

    void performBatchSave(Iterable<Employee> employees);

    void deleteByNameContaining(String partialName);

    void deleteInBatch(Iterable<Employee> entities);
}
