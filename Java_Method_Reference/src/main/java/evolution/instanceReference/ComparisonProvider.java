package evolution.instanceReference;

import evolution.pojo.AnyPojo;

public class ComparisonProvider {
	public int compareByAge(AnyPojo anyPojo0, AnyPojo anyPojo1) {
		return anyPojo0.getAge() - anyPojo1.getAge();
	}
}
