package com.example.demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import trng.imcs.bean.Employee;
import trng.imcs1.testBean.Department;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		//ApplicationContext appContext = new AnnotationConfigApplicationContext(SpringConfig.class);
		AnnotationConfigApplicationContext appContext = new AnnotationConfigApplicationContext(trng.imcs1.testconfig.TestConfig.class);
		Employee emp = appContext.getBean(Employee.class);
		emp.displayName();
		emp.setName("Dhansh" + "jjj");
		System.out.println("After Initialization");
		emp.displayName();
		Employee emp1 = appContext.getBean(Employee.class);
		System.out.println("Scope prototype");
		emp1.displayName();
		System.out.println("Department also initialized with import");
		Department dept = appContext.getBean(Department.class);
		dept.setDeptName("HR");
		System.out.println(dept.getDeptName());
		 emp.getOperations().display(emp);
		 //ConfigurableApplicationContext applicationContext = (ConfigurableApplicationContext) appContext;
		 appContext.removeBeanDefinition("employee");
		 
	}
}
