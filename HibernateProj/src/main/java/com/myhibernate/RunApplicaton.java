package com.myhibernate;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import org.joda.time.LocalDate;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.myhibernate.configration.SpringConfigration;
import com.myhibernate.model.Employee;
import com.myhibernate.model.Stock;
import com.myhibernate.model.StockDailyRecord;
import com.myhibernate.service.MyHibernateService;

public class RunApplicaton {

	public static <T> void main(String[] args) {

		AbstractApplicationContext apl = new AnnotationConfigApplicationContext(SpringConfigration.class);
		
		MyHibernateService mhs = (MyHibernateService)apl.getBean("MyHibernateService");
		
		 /*
         * Create Employee1
         */
        Employee employee1 = new Employee();
        employee1.setName("Han Yenn");
        employee1.setJoiningDate(new LocalDate(2010, 10, 10));
        employee1.setSalary(new BigDecimal(10000));
        employee1.setSsn("ssn00000001");
        //employee1.setDepartment(dep);
 
        /*
         * Create Employee2
         */
        Employee employee2 = new Employee();
        employee2.setName("Dan Thomas");
        employee2.setJoiningDate(new LocalDate(2012, 11, 11));
        employee2.setSalary(new BigDecimal(20000));
        employee2.setSsn("ssn00000002");
        //employee2.setDepartment(dep);
        
        Employee employee9 = new Employee();
        employee9.setName("Daen Thomas");
        employee9.setJoiningDate(new LocalDate(2012, 11, 11));
        employee9.setSalary(new BigDecimal(20000));
        employee9.setSsn("ssn00000009");
        
        Employee employee3 = new Employee();
        employee3.setName("NIk Thomas");
        employee3.setJoiningDate(new LocalDate(2012, 11, 11));
        employee3.setSalary(new BigDecimal(20000));
        employee3.setSsn("ssn00000003");
        
        Employee employee4 = new Employee();
        employee4.setName("Danial Thomas");
        employee4.setJoiningDate(new LocalDate(2012, 11, 11));
        employee4.setSalary(new BigDecimal(20000));
        employee4.setSsn("ssn00000004");
        
        Employee employee5 = new Employee();
        employee5.setName("Mikeal Thomas");
        employee5.setJoiningDate(new LocalDate(2012, 11, 11));
        employee5.setSalary(new BigDecimal(20000));
        employee5.setSsn("ssn00000005");
        
        Employee employee6 = new Employee();
        employee6.setName("Dano Thomas");
        employee6.setJoiningDate(new LocalDate(2012, 11, 11));
        employee6.setSalary(new BigDecimal(20000));
        employee6.setSsn("ssn00000006");
        Employee employee7 = new Employee();
        employee7.setName("Danos Thomas");
        employee7.setJoiningDate(new LocalDate(2012, 11, 11));
        employee7.setSalary(new BigDecimal(20007));
        employee7.setSsn("ssn00000007");
        Employee employee8 = new Employee();
        employee8.setName("Thomas");
        employee8.setJoiningDate(new LocalDate(2012, 11, 11));
        employee8.setSalary(new BigDecimal(20000));
        employee8.setSsn("ssn00000008");
        
        
        Stock stock = new Stock();
        stock.setStockCode("7052");
        stock.setStockName("PADINI");
        mhs.saveEmployee(stock);

        StockDailyRecord stockDailyRecords =  new StockDailyRecord();
        stockDailyRecords.setPriceOpen(new Float("1.2"));
        stockDailyRecords.setPriceClose(new Float("1.1"));
        stockDailyRecords.setPriceChange(new Float("10.0"));
        stockDailyRecords.setVolume(3000000L);
        stockDailyRecords.setDate(new Date());

        stockDailyRecords.setStock(stock);
        stock.getStockDailyRecords().add(stockDailyRecords);
        StockDailyRecord stockDailyRecords2 = new StockDailyRecord();
        
        stockDailyRecords2.setPriceOpen(new Float("1.4"));
        stockDailyRecords2.setPriceClose(new Float("2.1"));
        stockDailyRecords2.setPriceChange(new Float("50.0"));
        stockDailyRecords2.setVolume(3700000L);
        stockDailyRecords2.setDate(new Date(11, 11, 11));

        stockDailyRecords2.setStock(stock);
        stock.getStockDailyRecords().add(stockDailyRecords2);
        
        
        
        mhs.saveEmployee(stockDailyRecords);
        mhs.saveEmployee(stockDailyRecords2);
        
        mhs.saveEmployee(employee1);
        mhs.saveEmployee(employee2);
        mhs.saveEmployee(employee3);
        mhs.saveEmployee(employee4);
        mhs.saveEmployee(employee5);
        mhs.saveEmployee(employee6);
        mhs.saveEmployee(employee7);
        mhs.saveEmployee(employee8);
        mhs.saveEmployee(employee9);
        mhs.myDelete();
        
       List<Employee> myEmployee = mhs.findAllEmployees();
       

	System.out.println(myEmployee.stream().map(p->p.getSalary()).collect(Collectors.toList()));
	
	System.out.println(myEmployee.stream().filter(o->o.getSsn().equalsIgnoreCase("ssn00000001") ).findFirst());
	myEmployee.forEach(o->System.out.println(o.getSsn()));
        
        
        
        
		
		
	}

}
