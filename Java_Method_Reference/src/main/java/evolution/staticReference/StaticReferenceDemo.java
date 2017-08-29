package evolution.staticReference;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import org.junit.Test;

import evolution.pojo.AnyPojo;

public class StaticReferenceDemo {
	@Test
	public void sortByMethodReference() {
		List<AnyPojo> anyPojos = Arrays.asList(new AnyPojo(36), new AnyPojo(12), new AnyPojo(24));
		anyPojos.sort(AnyPojo::compareByAge);
		anyPojos.forEach(System.out::println);
	}
	
	@Test
	public void sortByLambda() {
		List<AnyPojo> anyPojos = Arrays.asList(new AnyPojo(36), new AnyPojo(12), new AnyPojo(24));
		anyPojos.sort((x, y) -> x.compareByAge(y));
		anyPojos.forEach(System.out::println);
	}
	
	@Test
	public void sortByComparator() {
		List<AnyPojo> anyPojos = Arrays.asList(new AnyPojo(36), new AnyPojo(12), new AnyPojo(24));
		anyPojos.sort(new Comparator<AnyPojo>() {
			@Override
			public int compare(AnyPojo AnyPojo0, AnyPojo AnyPojo1) {
				return AnyPojo0.compareByAge(AnyPojo1);
			}
		});
		anyPojos.forEach(System.out::println);
	}
}
