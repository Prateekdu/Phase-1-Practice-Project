package com.main;

//import org.hibernate.mapping.List;

import com.bean.Employee;
import com.service.EmployeeService;

public class DemoTest {
	public static void main(String args[])
	{ // store  employee
		Employee emp1 = new Employee();
        emp1.setId(9);
        emp1.setName("Mahesi");
        emp1.setSalary(12000);
        
        EmployeeService es = new EmployeeService();
        String result = es.storeEmployee(emp1);
        System.out.println(result);
//		 EmployeeService es = new EmployeeService();
//		 List<Employee> listofep=es.getAllEmployee();
//		 for(Employee emp:listofep)
//		 {
//			 System.out.println(emp);
//		 }


	}
}
