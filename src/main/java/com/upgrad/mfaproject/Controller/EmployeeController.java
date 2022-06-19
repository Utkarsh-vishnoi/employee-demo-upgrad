package com.upgrad.mfaproject.Controller;

import com.upgrad.mfaproject.Data.DTO.EmployeeDTO;
import com.upgrad.mfaproject.Entity.EmployeeEntity;
import com.upgrad.mfaproject.Service.EmployeeService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @Autowired
    ModelMapper modelMapper;

    @GetMapping("/employee")
    public ResponseEntity getEmployees() {
        List<EmployeeEntity> employees = employeeService.getAllEmployees();
        return new ResponseEntity(employees, HttpStatus.OK);
    }

    @GetMapping("/employee/{id}")
    public ResponseEntity getEmployeeByID(@PathVariable("id") int ID) {
        EmployeeEntity employee = employeeService.readEmployeeDetails(ID);
        return new ResponseEntity(employee, HttpStatus.OK);
    }

    @PostMapping(value = "/employee", consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity createEmployee(@RequestBody EmployeeDTO employeeDTO) {
        EmployeeEntity employeeEntity = modelMapper.map(employeeDTO, EmployeeEntity.class);
        EmployeeEntity createdEmployee = employeeService.createNewEmployee(employeeEntity);
        return new ResponseEntity(createdEmployee, HttpStatus.CREATED);
    }

    @PutMapping(value = "/employee/{id}", consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity updateEmployeeDetails(@PathVariable("id") int ID, @RequestBody EmployeeDTO employeeDTO) {
        EmployeeEntity updatedEmployee = employeeService.updateEmployeeDetails(ID, employeeDTO);
        return new ResponseEntity(updatedEmployee, HttpStatus.OK);
    }

    @DeleteMapping("/employee/{id}")
    public ResponseEntity deleteEmployeeDetails(@PathVariable("id") int ID) {
        employeeService.deleteEmployee(ID);
        return new ResponseEntity(HttpStatus.FORBIDDEN);
    }
}
