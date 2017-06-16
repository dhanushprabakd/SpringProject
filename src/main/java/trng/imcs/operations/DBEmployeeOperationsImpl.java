package trng.imcs.operations;

import org.springframework.stereotype.Component;

import trng.imcs.bean.Employee;

@Component
public class DBEmployeeOperationsImpl implements EmployeeOperations {

	public void display(Employee emp) {
		System.out.println("DB Operations Implemented");

	}

}
