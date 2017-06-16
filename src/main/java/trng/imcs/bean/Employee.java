package trng.imcs.bean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import trng.imcs.operations.EmployeeOperations;

@Component
@Scope("prototype")
public class Employee {
	private String name;
	@Autowired
	//@Qualifier("arrayEmployeeOperationsImpl")
	private EmployeeOperations operations;
	
	@Qualifier("arrayEmployeeOperationsImpl")
	public void setOperations(EmployeeOperations operations) {
		this.operations = operations;
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public EmployeeOperations getOperations() {
		return operations;
	}

	public void displayName(){
		System.out.println("name:" + name);
	}

	@PostConstruct
	public void postConstructOperation() {
		//post construct logic
		System.out.println("Employee::postConstructOperation called");
	}
	
	@PreDestroy
	public void preDestroyOperation() {
		System.out.println("Employee::preDestroyOperation called");
	}
	
}
