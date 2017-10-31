package com.myhibernate.configration.dao;

import java.util.List;

import com.myhibernate.model.Employee;

public interface EmployeeInterfaces {
	
	void saveEmployee(Object employee);
    
    List<Employee> findAllEmployees();
     
    void deleteEmployeeBySsn(String ssn);
     
    Employee findBySsn(String ssn);
     
    void updateEmployee(Employee employee);
    default void myDelete() {
    	List<Employee> fl = findAllEmployees();
    	fl.forEach(o->deleteEmployeeBySsn(o.getSsn()));
    }

}
