package com.example.employeepayrollapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.employeepayrollapp.model.EmployeeModel;

public interface EmployeeRepository extends JpaRepository<EmployeeModel, Long>  {

}
