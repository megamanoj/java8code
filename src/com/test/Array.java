package com.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Array {

	public static void main(String[] args) {

		Integer arr[] = { 1, 0, 2, 3, 0, 110, 20, 2, 3 };
		
		for (int i = 0; i < arr.length; i++) {
			
			for (int j = i+1; j < arr.length; j++) {
				if(arr[i]==arr[j])
					System.out.println("duplicate element"+arr[j]);
			}
		}

		/*List<Integer>convertingArrayToList=new ArrayList<Integer>(Arrays.asList(arr));
		List<Integer> removingDuplicateElement=convertingArrayToList.stream().distinct().collect(Collectors.toList());
		System.out.println("removingDuplicateElementUsingAPI:"+removingDuplicateElement.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList()));
		System.out.println("removingDuplicateElementUsingAPI:"+removingDuplicateElement.stream().sorted().collect(Collectors.toList()));
		LinkedHashSet<Integer>withoutDuplicateElement=new LinkedHashSet<>(Arrays.asList(arr));
		List<Integer>asscendingOrderElement=withoutDuplicateElement.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		List<Integer>reverserOrderElement=withoutDuplicateElement.stream().sorted().collect(Collectors.toList());
		System.out.println("asscendingOrderElement :"+asscendingOrderElement);
		System.out.println("reverserOrderElement"+reverserOrderElement);*/
		
		//PRINTING DUPLICATE ELEMENT FROM  ARRAY
		List<Integer>convertingArrayToList=new ArrayList<>(Arrays.asList(arr));
		System.out.println("convertingArrayToList"+convertingArrayToList);
		convertingArrayToList.stream().filter(i ->Collections.frequency(convertingArrayToList, i)>1).collect(Collectors.toSet()).forEach(System.out::println);
		
		Function<String, String> lambdaFunction = (String s) -> s.toUpperCase();
		System.out.println(lambdaFunction.apply("JAVA"));

		
		
		Integer ints[]= {10,11,12,13,10,15,14,15,16};
		
		//ODDEVEN NUMBER
		/*List<Integer>convertingToList=new ArrayList<>(Arrays.asList(ints));
		List<Integer>evenNumber=convertingToList.stream().filter(i ->i%2==0).collect(Collectors.toList());
		List<Integer>oddNumber=convertingToList.stream().filter(i ->i%2!=0).collect(Collectors.toList());
		System.out.println("evenNumber"+evenNumber);
		System.out.println("oddNumber"+oddNumber);*/
		
		
		List<Integer>convertingToList=new ArrayList<>(Arrays.asList(ints));
		List<Integer>duplicateNumber=convertingToList.stream().distinct().collect(Collectors.toList());
		System.out.println("duplicateNumber"+duplicateNumber);
		
		convertingToList.stream().filter(i ->Collections.frequency(convertingToList,i)>1).collect(Collectors.toSet()).forEach(System.out::println);
		
		Function<String,String>value=(String string)->string.trim();
		System.out.println(value.apply("    manoj   "));
		
		
		Integer arrys[]= {1,2,3,4,5,6,1,2,7};
		
		List<Integer>convertArraytoList=new ArrayList<>(Arrays.asList(arrys));
		List<Integer>duplicateArrays=convertArraytoList.stream().distinct().collect(Collectors.toList());
		System.out.println("duplicateArrays on reverse order"+duplicateArrays.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList()));
		System.out.println("duplicateArrays nurmoal order:"+duplicateArrays);
		duplicateArrays.stream().filter(i->Collections.frequency(convertArraytoList, i)>1).collect(Collectors.toSet()).forEach(System.out::println);
		
		
		List<Integer>evenNumber=convertArraytoList.stream().filter(i->i%2==0).collect(Collectors.toList());
		System.out.println(evenNumber);
		
		List<Integer>oddNumber=convertArraytoList.stream().filter(i->i%2 !=0).collect(Collectors.toList());
		System.out.println(oddNumber);
		
		Long totalNumber=convertArraytoList.stream().count();
		System.out.println(totalNumber);
		
		//MAXNUMBER
		Optional<Integer> maxNumber=convertArraytoList.stream().max(Comparator.naturalOrder());
		System.out.println("maxNumber"+maxNumber);
		
		//MINNUMBER
		Optional<Integer>minNumber=convertArraytoList.stream().min(Comparator.naturalOrder());
		System.out.println("minNumber"+minNumber);
		
		//TOTALSUM
		Integer totalSum=convertArraytoList.stream().mapToInt(m->m.intValue()).sum();
		System.out.println(totalSum);
		
		//REMOVING NUMBER OF INDEX
		List<Integer> afterskipNumber=convertArraytoList.stream().skip(6).collect(Collectors.toList());
		System.out.println("afterskipNumber"+afterskipNumber);
		
		String reverseString="manoj";
		
		List<String>convertingStringToList=new ArrayList<>(Arrays.asList(reverseString));
		Stream<String> values=convertingStringToList.stream().sorted(Collections.reverseOrder());
		System.out.println(values);
		
}
}