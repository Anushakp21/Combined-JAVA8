package com;

import java.util.Arrays;
import java.util.List;

public class ProductOfOdds {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7);

		int productOfOdds = numbers.stream()
				.filter(num -> num % 2 != 0) 
				.reduce(1, (product, num) -> product * num);  

		System.out.println("Product of odd numbers: " + productOfOdds); 
	}

}
