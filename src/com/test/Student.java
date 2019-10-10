package com.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Student {

	public static void main(String[] args) {

		Integer a = 20;
		Integer b = 30;

		Integer sumOfab = null;

		String name="   well";
		Integer arrys[]= {1,2,3,4,5,6,1,2,7};
		List<Integer>convertArraytoList=new ArrayList<>(Arrays.asList(arrys));
		// ODD NUMBER
		List<Integer> list = Arrays.asList(10, 20, 30, 15, 25, 30);
		List<Integer> oddNumber = list.stream().filter(i -> i % 2 != 0).collect(Collectors.toList());
		System.out.println(oddNumber);

		// EVEN NUMBER
		List<Integer> evenNumber = list.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
		System.out.println(evenNumber);

		// CONVERTING INTO UPER CASE
		Function<String, String> lambdaFunction = (String s) -> s.toLowerCase();
		System.out.println(lambdaFunction.apply("JAVA"));

		// CONVERTING INTO UPER CASE
		Function<String, String> laFunction = (String s) -> s.toUpperCase();
		System.out.println(laFunction.apply("java"));

		// CONVERTING INTO LOWERCASE
		List<String> lowerValue = Arrays.asList("MANOJ");
		List<String> converToLowerValue = lowerValue.stream().map(m -> m.toLowerCase()).collect(Collectors.toList());
		System.out.println(converToLowerValue);

		// CONVERTING INTO UPER CASE
		List<String> upperCaseValue = Arrays.asList("manoj");
		List<String> lowerCase = upperCaseValue.stream().map(m -> m.toUpperCase()).collect(Collectors.toList());
		System.out.println(lowerCase);

		// REMOVING DUPLICATE ELEMENT
		List<Integer> withoutDuplicate = list.stream().distinct().collect(Collectors.toList());
		System.out.println(withoutDuplicate);

		// SORTING IN ASC ORDER
		List<Integer> accedingOdering = list.stream().sorted().collect(Collectors.toList());
		System.out.println(accedingOdering);

		// SORTING IN REVERSE ORDER
		List<Integer> reverseOrder = list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println(reverseOrder);

		// SUMING LIST OF VALUE
		Integer totalOfSum = list.stream().mapToInt(i -> i.intValue()).sum();
		System.out.println(totalOfSum);

		// SUMING LIST OF VALUE
		Integer sum = list.stream().mapToInt(m -> m.intValue()).sum();
		System.out.println(sum);

		// SUMMING TWO NUMBER
		Integer sumofTwoNumber = sumOfab.sum(a, b);
		System.out.println(sumofTwoNumber);

		// SKIPING ELEMENT OF N LENTH
		List<Integer> skipElement = list.stream().skip(4).collect(Collectors.toList());
		System.out.println(skipElement);

		// FINDING MIN ELEMENT FROM LIST
		Optional<Integer> minElement = list.stream().min(Comparator.naturalOrder());
		System.out.println(minElement);

		// FINDING MAX ELEMENT FROM LIST
		Optional<Integer> maxElement = list.stream().max(Comparator.naturalOrder());
		System.out.println(maxElement);

		// COUNTING ELEMENT
		long count = list.stream().count();
		System.out.println(count);

		// USE OF LIMIT
		List<Integer> limitOf2Length = list.stream().limit(2).collect(Collectors.toList());
		System.out.println(limitOf2Length);

		
		//REMOVING NUMBER OF INDEX
				List<Integer> afterskipNumber=convertArraytoList.stream().skip(6).collect(Collectors.toList());
				System.out.println("afterskipNumber"+afterskipNumber);
		// USE OF IF ELSE
		if (list.stream().anyMatch((Integer number) -> number.intValue() == 2)) {
			System.out.println("number matched");
		} else {
			System.out.println("no value match on this length");
		}

	}

}
