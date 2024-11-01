package com;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class AverageSalaryCalculator {
	public static void main(String[] args) {
		List<Double> salaries = Arrays.asList(50000.0, 60000.0, 75000.0);

		OptionalDouble averageSalary = salaries.stream()
				.mapToDouble(Double::doubleValue) 
				.average(); 

		if (averageSalary.isPresent())
		{
			System.out.println("Average Salary: " + averageSalary.getAsDouble());
		} 
		else
		{
			System.out.println("No salaries available to calculate average.");
		}
	}

}
