package singleResponsibilityPrinciple.ex2;

import singleResponsibilityPrinciple.ex2.correct.CalculationRule;
import singleResponsibilityPrinciple.ex2.correct.FifteenOrTwentyFivePercent;
import singleResponsibilityPrinciple.ex2.correct.TenOrTwentyPercent;

public enum Role {
	DEVELOPER(new TenOrTwentyPercent()),
	DBA (new FifteenOrTwentyFivePercent()),
	TESTER (new FifteenOrTwentyFivePercent()),
	SECRETARY(new TenOrTwentyPercent());
	
	private CalculationRule calculateRule;
	
	Role(CalculationRule calculateRule) {
		this.calculateRule = calculateRule;
	}
	
	public CalculationRule getRule() {
		return calculateRule;
	}
}