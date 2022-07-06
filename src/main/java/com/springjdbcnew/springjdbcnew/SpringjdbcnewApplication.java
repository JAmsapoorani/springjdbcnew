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
		dao.saveEmployeeByPreparedStatement(new Employee(108,"Amit",35000));
	}

}
