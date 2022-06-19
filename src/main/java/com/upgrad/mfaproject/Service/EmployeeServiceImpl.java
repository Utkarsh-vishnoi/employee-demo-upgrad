package com.upgrad.mfaproject.Service;

import com.upgrad.mfaproject.Data.DAO.EmployeeDAO;
import com.upgrad.mfaproject.Data.DTO.EmployeeDTO;
import com.upgrad.mfaproject.Entity.EmployeeEntity;
import com.upgrad.mfaproject.Exception.EmployeeNotFound;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService{

    @Autowired
    private EmployeeDAO employeeDAO;
    @Override
    public List<EmployeeEntity> getAllEmployees() {
        List<EmployeeEntity> employeeList = employeeDAO.findAll();

        if(employeeList.size() > 0) {
            return employeeList;
        } else {
            return new ArrayList<EmployeeEntity>();
        }
    }

    @Override
    public EmployeeEntity createNewEmployee(EmployeeEntity employeeEntity) { return employeeDAO.save(employeeEntity); }

    @Override
    public EmployeeEntity readEmployeeDetails(int ID) {

        Optional<EmployeeEntity> employee = employeeDAO.findById(ID);
        if(employee.isPresent()) {
            return employee.get();
        } else {
            throw new EmployeeNotFound("No employee record exist for given id", 400);
        }
    }

    @Override
    public EmployeeEntity updateEmployeeDetails(int ID, EmployeeDTO employeeDTO) {
        EmployeeEntity employee = readEmployeeDetails(ID);
        employee.setEmployeeContact(employeeDTO.getEmployeeContact());
        employee.setEmployeeCountry(employeeDTO.getEmployeeCountry());
        employee.setEmployeeDesignation(employeeDTO.getEmployeeDesignation());
        employee.setEmployeeName(employeeDTO.getEmployeeName());
        employee.setEmployeeSkills(employeeDTO.getEmployeeSkills());
        return employeeDAO.save(employee);
    }

    @Override
    public void deleteEmployee(int ID) {
        Optional<EmployeeEntity> employee = employeeDAO.findById(ID);

        if(employee.isPresent())
        {
            employeeDAO.deleteById(ID);
        } else {
            throw new EmployeeNotFound("No employee record exist for given id", 400);
        }
    }
}
