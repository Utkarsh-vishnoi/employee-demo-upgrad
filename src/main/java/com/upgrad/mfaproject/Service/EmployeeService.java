package com.upgrad.mfaproject.Service;

import com.upgrad.mfaproject.Data.DTO.EmployeeDTO;
import com.upgrad.mfaproject.Entity.EmployeeEntity;

import java.util.List;


public interface EmployeeService {
    public List<EmployeeEntity> getAllEmployees();
    public EmployeeEntity createNewEmployee(EmployeeEntity employeeEntity);
    public EmployeeEntity readEmployeeDetails(int ID);
    public EmployeeEntity updateEmployeeDetails(int ID, EmployeeDTO employeeDTO);
    public void deleteEmployee(int ID);
}
