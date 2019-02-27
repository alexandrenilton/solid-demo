package singleResponsibilityPrinciple.ex2.wrong;

import static singleResponsibilityPrinciple.ex2.Role.DBA;
import static singleResponsibilityPrinciple.ex2.Role.DEVELOPER;
import static singleResponsibilityPrinciple.ex2.Role.TESTER;



public class CalculateSalary {
	public double calculate(Employee employee) {
		if (DEVELOPER.equals(employee.getRole())) {
			return tenOrTwentyPercente(employee);
		}
		
		if ( DBA.equals(employee.getRole()) || TESTER.equals(employee.getRole()) ) {
			return fifteenOrTwentyFivePercent(employee);
		}
		throw new RuntimeException("Invalid employee inválido!");
	}

	private double fifteenOrTwentyFivePercent(Employee employee) {
		if (employee.getSalary() > 3000.00) {
			return employee.getSalary() * 0.8;
		} else {
			return employee.getSalary() * 0.9;
		}
	}

	private double tenOrTwentyPercente(Employee employee) {
		if (employee.getSalary() > 2000.00) {
			return employee.getSalary() * 0.75;
		} else {
			return employee.getSalary() * 0.85;
		}
	}
}
