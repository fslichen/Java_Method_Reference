package evolution.particularReference;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class ParticularReference {
	@Test
	public void sortByMethodReference() {
		List<String> strings = Arrays.asList("Hello", "World");
		strings.sort(String::compareToIgnoreCase);
		strings.forEach(System.out::println);
	}
	
	@Test
	public void sortByLambda() {
		List<String> strings = Arrays.asList("Hello", "World");
		strings.sort((x, y) -> x.compareToIgnoreCase(y));
		strings.forEach(System.out::println);
	}
}
