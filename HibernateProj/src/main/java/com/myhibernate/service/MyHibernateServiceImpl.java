package com.myhibernate.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myhibernate.configration.dao.EmployeeInterfaces;
import com.myhibernate.model.Employee;

@Service("MyHibernateService")
@Transactional
public class MyHibernateServiceImpl implements MyHibernateService {

	@Autowired
	private EmployeeInterfaces myHibernateDao;
	
	@Override
	public void saveEmployee(Object employee) {

		myHibernateDao.saveEmployee(employee);
	}

	@Override
	public List<Employee> findAllEmployees() {
		return myHibernateDao.findAllEmployees();
	}

	@Override
	public void deleteEmployeeBySsn(String ssn) {

		myHibernateDao.deleteEmployeeBySsn(ssn);
	}

	@Override
	public Employee findBySsn(String ssn) {
		return myHibernateDao.findBySsn(ssn);
	}

	@Override
	public void updateEmployee(Employee employee) {

		myHibernateDao.updateEmployee(employee);
	}

}
