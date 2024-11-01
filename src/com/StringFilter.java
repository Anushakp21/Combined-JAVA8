package com;

import java.util.List;
import java.util.stream.Collectors;

public class StringFilter {
	public static List<String> filterLongStrings(List<String> strings) {
		return strings.stream()
				.filter(str -> str.length() > 5) 
				.collect(Collectors.toList()); 
	}
	public static void main(String[] args) {
		List<String> strings = List.of("apple", "banana", "cherry", "date", "fig", "grapefruit");
		List<String> longStrings = filterLongStrings(strings);

		System.out.println("Strings with length greater than 5: " + longStrings);
	}

}
