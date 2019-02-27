package singleResponsibilityPrinciple.ex2.correct;

import singleResponsibilityPrinciple.ex2.wrong.Employee;

public interface CalculationRule {
	public double calculate(Employee employee);
}
