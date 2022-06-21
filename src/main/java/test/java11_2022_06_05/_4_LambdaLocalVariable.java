package test.java11_2022_06_05;

import java.util.stream.Stream;

public class _4_LambdaLocalVariable {
	public static void main(String[] args) {
		Stream<String> names = Stream.of("John", "Mary", "Jo");
		names.forEach((String name) -> System.out.println(name));
		
		names = Stream.of("John", "Mary", "Jo");
		names.forEach((name) -> System.out.println(name));
		
//		names = Stream.of("John", "Mary", "Jo");
//		names.forEach((var name) -> System.out.println(name));
		
	}
}
