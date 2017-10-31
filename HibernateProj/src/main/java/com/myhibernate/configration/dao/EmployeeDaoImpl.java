package com.myhibernate.configration.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.myhibernate.model.Employee;

@Repository("employeeDao")
public class EmployeeDaoImpl extends MyHibernateDao implements EmployeeInterfaces {

	@Override
	public void saveEmployee(Object employee) {

		persist(employee);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Employee> findAllEmployees() {

		Criteria criteria = getSession().createCriteria(Employee.class);
		return (List<Employee>)criteria.list();
	}

	@Override
	public void deleteEmployeeBySsn(String ssn) {
		Query qy = getSession().createQuery("delete from Employee where ssn = :ssn");
		qy.setString("ssn", ssn);
		qy.executeUpdate();
	}

	@Override
	public Employee findBySsn(String ssn) {

		Criteria crt = getSession().createCriteria(Employee.class);
		crt.add(Restrictions.eq("ssn", ssn));
		return (Employee)crt.uniqueResult();
	}

	@Override
	public void updateEmployee(Employee employee) {
		getSession().update(employee);
	}

}
