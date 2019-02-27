package singleResponsibilityPrinciple.ex2.correct;

import singleResponsibilityPrinciple.ex2.wrong.Employee;



public class CalculateSalaryCorrect {

	public double calculate(Employee employee) {
		return employee.calculateSalary();
	}

}