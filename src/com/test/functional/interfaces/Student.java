package com.test.functional.interfaces;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Student {
	public static void main(String[] args) {

		Integer arra[] = { 10, 0, 2, 1, 3, 4, 5, 6, 7, 8, 9, 0, 2, 3, 4 };

		// convert array to ArrayList
		ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(arra));
		System.out.println("arrayList:" + arrayList);

		// evenNumber
		List<Integer> eveneNumber = arrayList.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
		System.out.println("evenNumber:" + eveneNumber);

		// oddNumber
		List<Integer> oddNumber = arrayList.stream().filter(i -> i % 2 != 0).collect(Collectors.toList());
		System.out.println("oddNumber:" + oddNumber);

		// upperCaseConver
		Function<String, String> upperCaseConver = s -> s.toUpperCase();
		System.out.println("upperCase:" + upperCaseConver.apply("manoj"));

		// lowerCaseConverter
		Function<String, String> lowerCaseConverter = s -> s.toLowerCase();
		System.out.println("lowerCaseConverter:" + lowerCaseConverter.apply("MANOJ"));

		// upperCaseConver
		List<String> stringList = Arrays.asList("raju");
		List<String> upperCase = stringList.stream().map(m -> m.toUpperCase()).collect(Collectors.toList());
		System.out.println("upperCase" + upperCase);

		// lowerCaseConverter
		List<String> lowerCase = Arrays.asList("RAJSHREE");
		List<String> upperCases = lowerCase.stream().map(m -> m.toLowerCase()).collect(Collectors.toList());
		System.out.println("upperCases" + upperCases);

		// removedDupplicate
		List<Integer> removedDupplicate = arrayList.stream().distinct().collect(Collectors.toList());
		System.out.println("removedDupplicate:" + removedDupplicate);

		// sorting in asc
		List<Integer> ascSorting = arrayList.stream().sorted().collect(Collectors.toList());
		System.out.println("ascSorting:" + ascSorting);

		// sorting in dsc
		List<Integer> dscSorting = arrayList.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.err.println("dscSorting:" + dscSorting);

		// totalValue of sum
		Integer totalValue = arrayList.stream().mapToInt(m -> m.intValue()).sum();
		System.out.println("totalValue:" + totalValue);

		// min number from List
		Optional<Integer> minNumber = arrayList.stream().min(Comparator.naturalOrder());
		System.out.println("minNumber:" + minNumber);

		// max number from List
		Optional<Integer> maxNumber = arrayList.stream().max(Comparator.naturalOrder());
		System.out.println("maxNumber:" + maxNumber);
		
		List<Integer> secondMAxNumber=arrayList.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		
		System.out.println("secondMAxNumber:"+secondMAxNumber.get(1));
	}
}