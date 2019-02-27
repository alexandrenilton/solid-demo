package singleResponsibilityPrinciple.ex2.correct;

import singleResponsibilityPrinciple.ex2.wrong.Employee;

public class FifteenOrTwentyFivePercent implements CalculationRule{
	
	public double calculate(Employee employee) {
		if (employee.getSalary() > 2000.00) {
			return employee.getSalary() * 0.75;
		} else {
			return employee.getSalary() * 0.85;
		}
	} 

}
