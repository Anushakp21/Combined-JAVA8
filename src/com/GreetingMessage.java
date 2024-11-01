package com;

import java.util.Optional;

public class GreetingMessage {
	public static String getGreeting(String name) {
		return Optional.ofNullable(name)
				.map(n -> "Hello, " + n + "!")
				.orElse("Hello, Guest!");
	}

	public static void main(String[] args) {
		String name = null;
		String greeting = getGreeting(name);
		System.out.println(greeting); 

		name = "Alice";
		greeting = getGreeting(name);
		System.out.println(greeting); 
	}

}
