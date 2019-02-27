package singleResponsibilityPrinciple.ex2.correct;

import singleResponsibilityPrinciple.ex2.wrong.Employee;

public class TenOrTwentyPercent implements CalculationRule{
	
	public double calculate(Employee employee) {
		if (employee.getSalary() > 3000.00) {
			return employee.getSalary() * 0.8;
		} else {
			return employee.getSalary() * 0.9;
		}
	}
}
