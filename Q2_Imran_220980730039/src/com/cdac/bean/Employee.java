package com.cdac.bean;



public class Employee implements Comparable<Employee>{
	private int id;
	private double salary;
	private String name;

	public Employee() {
		
	}

	public Employee(int id,  String name,double salary) {
		super();
		this.id = id;
		this.salary = salary;
		this.name = name;
	}




	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return  this.hashCode() +"{"+id+","+name +","+salary+"}"; 
	}

	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		return 0;
	}

}