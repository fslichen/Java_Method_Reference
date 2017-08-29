package evolution.instanceReference;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import org.junit.Test;

import evolution.pojo.AnyPojo;

public class InstanceReferenceDemo {
	@Test
	public void sortByMethodReference() {
		List<AnyPojo> anyPojos = Arrays.asList(new AnyPojo(36), new AnyPojo(12), new AnyPojo(24));
		ComparisonProvider comparisonProvider = new ComparisonProvider();
		anyPojos.sort(comparisonProvider::compareByAge);
		anyPojos.forEach(System.out::println);
	}
	
	@Test
	public void sortByLambda() {
		List<AnyPojo> anyPojos = Arrays.asList(new AnyPojo(36), new AnyPojo(12), new AnyPojo(24));
		ComparisonProvider comparisonProvider = new ComparisonProvider();
		anyPojos.sort((x, y) -> comparisonProvider.compareByAge(x, y));
		anyPojos.forEach(System.out::println);
	}
	
	@Test
	public void sortByComparator() {
		List<AnyPojo> anyPojos = Arrays.asList(new AnyPojo(36), new AnyPojo(12), new AnyPojo(24));
		ComparisonProvider comparisonProvider = new ComparisonProvider();
		anyPojos.sort(new Comparator<AnyPojo>() {
			@Override
			public int compare(AnyPojo anyPojo0, AnyPojo anyPojo1) {
				return comparisonProvider.compareByAge(anyPojo0, anyPojo1);
			}
		});
		anyPojos.forEach(System.out::println);
	}
}
