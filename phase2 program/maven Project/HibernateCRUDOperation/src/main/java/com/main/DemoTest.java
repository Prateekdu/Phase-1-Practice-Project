package com.main;

import com.bean.Employee;
import com.service.EmployeeService;

public class DemoTest {
	public static void main(String args[])
	{
		Employee emp1 = new Employee();
        emp1.setId(8);
        emp1.setName("Mahesh");
        emp1.setSalary(12000);
        
        EmployeeService es = new EmployeeService();
        String result = es.storeEmployee(emp1);
        System.out.println(result);


	}
}