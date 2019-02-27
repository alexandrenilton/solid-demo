package singleResponsibilityPrinciple.ex2.wrong;

import java.util.Calendar;

import singleResponsibilityPrinciple.ex2.Role;

public class Employee {
	private int id;
	private String name;
	private Role role;
	private Calendar startDate;
	private double salary;
	
	public double calculateSalary() {
		return this.getRole().getRule().calculate(this);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public Calendar getStartDate() {
		return startDate;
	}

	public void setStartDate(Calendar startDate) {
		this.startDate = startDate;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
}
