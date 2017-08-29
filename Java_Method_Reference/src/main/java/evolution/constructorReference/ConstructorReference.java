package evolution.constructorReference;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.function.Supplier;

import org.junit.Test;

import evolution.pojo.AnyPojo;

public class ConstructorReference {
	public <T, SOURCE extends Collection<T>, TARGET extends Collection<T>> TARGET copy(SOURCE source, Supplier<TARGET> targetSupplier) {
		TARGET target = targetSupplier.get();
		source.forEach(x -> target.add(x));
		return target;
	}
	
	@Test
	public void copyByMethodReference() {
		Set<AnyPojo> anotherPojos = copy(Arrays.asList(new AnyPojo(36), new AnyPojo(12), new AnyPojo(24)), HashSet::new);
		anotherPojos.forEach(System.out::println);
	}
	
	@Test
	public void copyByLambda() {
		List<AnyPojo> anotherPojos = copy(Arrays.asList(new AnyPojo(36), new AnyPojo(12), new AnyPojo(24)), () -> new ArrayList<AnyPojo>());
		anotherPojos.forEach(System.out::println);
	}
	
	@Test
	public void copyBySupplier() {
		List<AnyPojo> anotherPojos = copy(Arrays.asList(new AnyPojo(36), new AnyPojo(12), new AnyPojo(24)), new Supplier<List<AnyPojo>>() {
			@Override
			public List<AnyPojo> get() {
				return new LinkedList<AnyPojo>();
			}
		});
		anotherPojos.forEach(System.out::println);
	}
}
