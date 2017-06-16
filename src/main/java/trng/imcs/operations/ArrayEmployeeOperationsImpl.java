package trng.imcs.operations;

import org.springframework.stereotype.Component;

import trng.imcs.bean.Employee;

@Component
public class ArrayEmployeeOperationsImpl implements EmployeeOperations{

	public void display(Employee emp) {
		System.out.println("Array Operations");
		
	}

}
