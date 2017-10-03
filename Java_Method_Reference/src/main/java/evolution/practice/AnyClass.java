package evolution.practice;

import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import org.junit.Test;


// Sometimes, however, a lambda expression does nothing but call an existing method.
// Therefore we invented method reference.
public class AnyClass {
	@Test
	public void test0() {
		List<Object> objects = Arrays.asList("Hello World", 1, new Date()); 
		// Lambdas can sometimes be verbose.
		objects.stream().map(x -> x.toString()).collect(Collectors.toList()).forEach(x -> System.out.println(x));
		// Use Method Reference
		// Method reference is syntactic sugar for lambda expression.
		objects.stream().map(Object::toString).collect(Collectors.toList()).forEach(System.out::println);
	}
	
	@Test
	public void test1() {
		List<AnyPojo> anyPojos = Arrays.asList(new AnyPojo("Chen"), new AnyPojo("Ling"), new AnyPojo("Bob"));
		// Retrieve the names from the objects and print them out.
		anyPojos.stream().map(x -> x.getName()).forEach(System.out::println);
		// Use method reference.
		anyPojos.stream().map(AnyPojo::getName).forEach(System.out::println);
	}
}
