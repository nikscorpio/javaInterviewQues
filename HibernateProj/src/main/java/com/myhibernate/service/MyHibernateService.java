package com.myhibernate.service;

import java.util.List;


import com.myhibernate.model.Employee;


public interface MyHibernateService {

	void saveEmployee(Object employee);
	 
    List<Employee> findAllEmployees();
 
    void deleteEmployeeBySsn(String ssn);
 
    Employee findBySsn(String ssn);
 
    void updateEmployee(Employee employee);
default void myDelete() {
	System.out.println("MyDetele function");
}
}
