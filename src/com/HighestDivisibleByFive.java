package com;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class HighestDivisibleByFive {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(3, 10, 25, 44, 55, 68, 85, 95);

		Predicate<Integer> isDivisibleByFive = num -> num % 5 == 0;

		Optional<Integer> maxDivisibleByFive = numbers.stream()
				.filter(isDivisibleByFive)
				.max(Integer::compare);

		maxDivisibleByFive.ifPresentOrElse(
				num -> System.out.println("Highest number divisible by 5: " + num),
				() -> System.out.println("No number divisible by 5 found.")
				);
	}
}
