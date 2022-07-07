package com.springjdbcnew.springjdbcnew;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class SpringjdbcnewApplication {

	public static void main(String[] args) {

	SpringApplication.run(SpringjdbcnewApplication.class, args);
		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");

		EmployeeDao dao=(EmployeeDao)ctx.getBean("edao");
		dao.saveEmployeeByPreparedStatement(new Employee(102,"Amit",35000));
		dao.saveEmployeeByPreparedStatement(new Employee(103,"Amitkumaf",55000));
		int status=dao.updateEmployee(new Employee(102,"Sonoo",15000));
		System.out.println(status);
		Employee e=new Employee();
		e.setId(101);
		int status1=dao.deleteEmployee(e);
		System.out.println(status1);
	}


}
