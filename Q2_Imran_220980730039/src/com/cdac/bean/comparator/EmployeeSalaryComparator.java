package com.cdac.bean.comparator;


import java.util.Comparator;

import com.cdac.bean.Employee;

public class EmployeeSalaryComparator implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		 if(o1.getSalary() > o2.getSalary()){
	            return -11;
	        } else {
	            return 1;
	        }
	}

}
