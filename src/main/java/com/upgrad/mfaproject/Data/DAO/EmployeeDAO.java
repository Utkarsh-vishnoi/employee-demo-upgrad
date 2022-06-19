package com.upgrad.mfaproject.Data.DAO;

import com.upgrad.mfaproject.Entity.EmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeDAO extends JpaRepository <EmployeeEntity, Integer> {
}
